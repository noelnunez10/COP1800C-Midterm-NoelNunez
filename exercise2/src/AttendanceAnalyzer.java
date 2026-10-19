
import java.util.Scanner;

public class AttendanceAnalyzer {

    // Este metodo calcula las visitas totales por habitacion.
    public static int[] roomTotals(int[][] visits) {
        int[] totals = new int[visits.length];

        // Uso dos ciclos for para recorrer filas y columnas.
        for (int i = 0; i < visits.length; i++) {
            for (int j = 0; j < visits[i].length; j++) {
                totals[i] += visits[i][j];
            }
        }
        return totals;
    }

    // Este metodo calcula las visitas totales por periodo.
    public static int[] periodTotals(int[][] visits) {
        int[] totals = new int[visits[0].length];

        // Sumo los valores de cada columna.
        for (int i = 0; i < visits.length; i++) {
            for (int j = 0; j < visits[i].length; j++) {
                totals[j] += visits[i][j];
            }
        }
        return totals;
    }

    // Este metodo muestra el resumen de asistencia.
    public static void printSummary(int[][] visits) {
        int[] rooms = roomTotals(visits);
        int[] periods = periodTotals(visits);
        int grandTotal = 0, busyRooms = 0, highestRoom = 0;

        System.out.println("\nATTENDANCE SUMMARY");

        // Recorro los totales de las habitaciones.
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Room " + (i + 1) + " total: " + rooms[i]);
            grandTotal += rooms[i];

            // Una habitacion es busy si tiene 6 visitas o mas.
            if (rooms[i] >= 6) busyRooms++;

            // Uso > para mantener la primera habitacion si hay empate.
            if (rooms[i] > rooms[highestRoom]) highestRoom = i;
        }

        // Muestro las visitas totales de cada periodo.
        for (int j = 0; j < periods.length; j++) {
            System.out.println("Period " + (j + 1) + " total: " + periods[j]);
        }

        // Uso double para obtener un promedio con decimales.
        // Divido entre todas las celdas de la matrix.
        double average = (double) grandTotal /
                (visits.length * visits[0].length);

        System.out.println("Grand total: " + grandTotal);
        System.out.printf("Average per cell: %.2f%n", average);
        System.out.println("Room with highest total: Room " + (highestRoom + 1));
        System.out.println("Busy rooms: " + busyRooms);
    }

    public static void main(String[] args) {

        // Matrix del midterm: 3 habitaciones y 4 periodos.
        int[][] visits = {
                {2, 0, 3, 1},
                {1, 4, 0, 2},
                {0, 2, 2, 1}
        };

        // Scanner permite leer lo que escribe el usuario.
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // El ciclo while mantiene el menu abierto.
        while (running) {
            System.out.println("\nATTENDANCE MENU");
            System.out.println("1. Summary");
            System.out.println("2. Find room");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            try {
                // Convierto el texto ingresado a un numero entero.
                int choice = Integer.parseInt(scanner.nextLine().trim());

                // Switch ejecuta una opcion segun el numero.
                switch (choice) {
                    case 1:
                        printSummary(visits);
                        break;

                    case 2:
                        System.out.print("Enter room number (1-" + visits.length + "): ");

                        try {
                            int room = Integer.parseInt(scanner.nextLine().trim());

                            // Primero verifico que la habitacion exista.
                            if (room < 1 || room > visits.length) {
                                System.out.println("Invalid room number.");
                            } else {

                                // Resto 1 porque los arrays empiezan en 0.
                                int total = roomTotals(visits)[room - 1];

                                System.out.println("Room " + room + " total: " + total);

                                // Compruebo si la habitacion esta busy.
                                if (total >= 6) {
                                    System.out.println("Status: Busy");
                                } else {
                                    System.out.println("Status: Not busy");
                                }
                            }

                        } catch (NumberFormatException e) {
                            // Si escribe letras, muestro un error.
                            System.out.println("Invalid input. Enter a number.");
                        }
                        break;

                    case 0:
                        // Termino el ciclo cuando el usuario elige 0.
                        System.out.println("Goodbye!");
                        running = false;
                        break;

                    default:
                        // Esta opcion controla numeros como 5 o 9.
                        System.out.println("Invalid option. Try again.");
                }

            } catch (NumberFormatException e) {
                // Evito que el menu termine por una entrada incorrecta.
                System.out.println("Invalid input. Enter a number.");
            }
        }
        scanner.close();
    }
}


import java.util.Scanner;

public class ResourceApp {

    public static void main(String[] args) {

        // Creo un array con los tres recursos del campus.
        CampusResource[] resources = {
                new StudySpace("Quiet Study", 4),
                new ComputerLab("Computer Lab", 3),
                new StudySpace("Group Study", 2)
        };

        // Scanner permite leer lo que escribe el usuario.
        Scanner scanner = new Scanner(System.in);

        // Controla si el menu sigue funcionando.
        boolean running = true;


        while (running) {

            System.out.println("\nCAMPUS RESOURCE MENU");
            System.out.println("1. Reserve");
            System.out.println("2. Cancel");
            System.out.println("3. Report");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            // try/catch evita que el programa se cierre
            // si el usuario escribe letras en lugar de numeros.
            try {

                // Leo la opcion y la convierto a int.
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {

                    case 1:
                    case 2:

                        // Muestro los recursos disponibles.
                        for (int i = 0; i < resources.length; i++) {
                            System.out.println((i + 1) + ". "
                                    + resources[i].getTitle());
                        }

                        System.out.print("Enter resource number: ");
                        int number = Integer.parseInt(
                                scanner.nextLine().trim());

                        // Verifico que el numero del recurso exista.
                        if (number < 1 || number > resources.length) {
                            System.out.println("Invalid resource number.");
                            break;
                        }

                        System.out.print("Enter number of seats: ");
                        int seats = Integer.parseInt(
                                scanner.nextLine().trim());

                        // Selecciono el recurso del array.
                        // Resto 1 porque los arrays comienzan en 0.
                        CampusResource resource = resources[number - 1];

                        // Guarda si la operacion fue exitosa.
                        boolean success;

                        if (choice == 1) {

                            // Utilizo reserve() del Exercise 3.
                            success = resource.reserve(seats);

                        } else {

                            // Utilizo cancel() del Exercise 3.
                            success = resource.cancel(seats);
                        }

                        System.out.println("Success: " + success);
                        System.out.println("Reserved: "
                                + resource.getReserved());

                        break;

                    case 3:

                        // Llamo al metodo que muestra el reporte.
                        printReport(resources);

                        break;

                    case 0:

                        System.out.println("Goodbye!");


                        running = false;

                        break;

                    default:

                        System.out.println("Invalid option. Try again.");
                }

            } catch (NumberFormatException e) {

                // Se ejecuta cuando el usuario escribe
                // algo que no se puede convertir a int.
                System.out.println("Invalid input. Enter a number.");
            }
        }

        scanner.close();
    }

    // Este metodo recibe todos los recursos y crea el reporte.
    // Se usa CampusResource para trabajar con los dos tipos
    // de recursos sin necesitar codigo diferente para cada uno.
    public static void printReport(CampusResource[] resources) {

        // StringBuilder permite guardar y juntar texto.
        // Se utiliza porque lo pide el Exercise 4.
        StringBuilder report = new StringBuilder();

        // Guardo el dinero total generado por los recursos.
        int totalRevenue = 0;

        // Agrego el titulo al reporte.
        report.append("\nCAMPUS RESOURCE REPORT ");

        // Recorro todos los recursos.
        for (int i = 0; i < resources.length; i++) {

            // Selecciono el recurso actual.
            CampusResource r = resources[i];

            // Agrego el numero y nombre del recurso.
            report.append((i + 1) + ". " + r.getTitle() + "\n");

            // Agrego la cantidad de asientos reservados.
            report.append("Reserved: " + r.getReserved() + "\n");

            // Agrego la cantidad de asientos disponibles.
            report.append("Remaining: " + r.getRemaining() + "\n");

            // Agrego el dinero generado por este recurso.
            report.append("Revenue: " + r.getRevenue() + "\n");

            // String.format muestra la ocupacion con un decimal.
            report.append("Occupancy: "
                    + String.format("%.1f", r.getOccupancy())
                    + "%\n\n");

            // Sumo el dinero generado por el recurso.
            totalRevenue = totalRevenue + r.getRevenue();
        }

        // Muestro el dinero total con dos decimales.
        report.append("Total revenue: "
                + String.format("%.2f", (double) totalRevenue)
                + "\n");

        System.out.println(report);
    }
}

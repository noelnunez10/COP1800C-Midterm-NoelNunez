
public class StudyRoomDemo {

    public static void main(String[] args) {

        // Creo una habitacion con capacidad de 6 asientos.
        StudyRoom room = new StudyRoom("Quiet Room", 6);

        System.out.println("STUDY ROOM DEMO");
        System.out.println("Room: " + room.getTitle());
        System.out.println("Capacity: " + room.getCapacity());

        // Ejecuto las 8 operaciones en el orden solicitado.
        boolean result;

        result = room.reserve(4);
        showResult("reserve(4)", result, room);

        result = room.reserve(3);
        showResult("reserve(3)", result, room);

        result = room.cancel(2);
        showResult("cancel(2)", result, room);

        result = room.reserve();
        showResult("reserve()", result, room);

        result = room.reserve(3);
        showResult("reserve(3)", result, room);

        result = room.cancel(7);
        showResult("cancel(7)", result, room);

        result = room.reserve(0);
        showResult("reserve(0)", result, room);

        result = room.cancel(-1);
        showResult("cancel(-1)", result, room);

        // Pruebo el constructor con capacidad predeterminada.
        System.out.println(" DEFAULT CAPACITY ");
        StudyRoom defaultRoom = new StudyRoom("Discrete Math Room");
        System.out.println("Capacity: " + defaultRoom.getCapacity());

        // Pruebo cancelar exactamente todos los asientos.
        System.out.println(" FULL CANCELLATION ");
        defaultRoom.reserve(4);
        boolean canceled = defaultRoom.cancel(4);
        showResult("cancel(4)", canceled, defaultRoom);

        // Compruebo que dos objetos sean independientes.
        System.out.println(" INDEPENDENT OBJECTS ");
        StudyRoom roomA = new StudyRoom("Room A", 5);
        StudyRoom roomB = new StudyRoom("Room B", 5);
        roomA.reserve(2);

        System.out.println("Room A reserved: " + roomA.getReserved());
        System.out.println("Room B reserved: " + roomB.getReserved());

        // Un alias apunta al mismo objeto, no crea una copia.
        System.out.println(" ALIAS REFERENCE ");
        StudyRoom alias = roomA;
        alias.reserve(1);

        System.out.println("Room A reserved: " + roomA.getReserved());
        System.out.println("Alias reserved: " + alias.getReserved());

        // Pruebo constructores invalidos sin detener el programa.
        System.out.println(" INVALID CONSTRUCTORS ");

        try {
            new StudyRoom(null, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Null title rejected.");
        }

        try {
            new StudyRoom("   ", 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Blank title rejected.");
        }

        try {
            new StudyRoom("Test", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Zero capacity rejected.");
        }

        try {
            new StudyRoom("Test", -2);
        } catch (IllegalArgumentException e) {
            System.out.println("Negative capacity rejected.");
        }
    }

    // Muestra el resultado y el estado despues de cada operacion.
    public static void showResult(String action, boolean result, StudyRoom room) {
        System.out.println(action + " -> " + result
                + "  Reserved: " + room.getReserved()
                + "  Remaining: " + room.getRemaining());
    }
}


public class StudyRoom {

    // Atributos privados de la habitacion.
    private String title;
    private final int capacity;
    private int reserved;

    // Constructor principal con nombre y capacidad.
    public StudyRoom(String title, int capacity) {

        // Verifico que el nombre no sea nulo ni vacio.
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid room title.");
        }

        // La capacidad siempre debe ser positiva.
        if (capacity <= 0) {
            throw new IllegalArgumentException("Invalid capacity.");
        }

        // Guardo los datos iniciales del objeto.
        this.title = title.trim();
        this.capacity = capacity;
        this.reserved = 0;
    }

    // Segundo constructor con capacidad predeterminada de 4.
    public StudyRoom(String title) {
        this(title, 4);
    }

    // Getters para consultar los datos privados.
    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getReserved() {
        return reserved;
    }

    public int getRemaining() {
        return capacity - reserved;
    }

    // Intenta reservar una cantidad de asientos.
    public boolean reserve(int seats) {

        // Rechazo cantidades invalidas o mayores al espacio libre.
        if (seats <= 0 || seats > getRemaining()) {
            return false;
        }

        // Solo modifico reserved si la solicitud es valida.
        reserved += seats;
        return true;
    }

    // Metodo para reservar un solo asiento.
    public boolean reserve() {
        return reserve(1);
    }

    // Cancela asientos que ya estaban reservados.
    public boolean cancel(int seats) {

        // No permito cantidades negativas ni cancelar de mas.
        if (seats <= 0 || seats > reserved) {
            return false;
        }

        reserved -= seats;
        return true;
    }
}

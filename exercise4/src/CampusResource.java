
public abstract class CampusResource extends StudyRoom implements Priced {

    // Constructor de CampusResource.
    public CampusResource(String title, int capacity) {
        super(title, capacity);
    }

    // Cada recurso tendra su propio precio.
    public abstract int feePerSeat();

    // Calcula el dinero generado por las reservaciones.
    public int getRevenue() {
        return getReserved() * feePerSeat();
    }

    // Calcula el porcentaje de asientos ocupados.
    public double getOccupancy() {
        return (double) getReserved() * 100 / getCapacity();
    }
}

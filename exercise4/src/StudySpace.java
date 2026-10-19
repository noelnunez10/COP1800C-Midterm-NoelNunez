
public class StudySpace extends CampusResource {

    //extends CampusResource significa que StudySpace hereda las funciones de reservación, cancelación, ingresos y ocupación.

    // Precio fijo por asiento en un espacio de estudio.
    private static final int FEE = 3;

    // Constructor que recibe el nombre y la capacidad.
    public StudySpace(String title, int capacity) {
        super(title, capacity);
    }

    // Devuelve el precio de cada asiento.
    public int feePerSeat() {
        return FEE;
    }
}

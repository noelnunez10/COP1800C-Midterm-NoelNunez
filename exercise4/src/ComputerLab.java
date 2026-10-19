
public class ComputerLab extends CampusResource {

    // Precio fijo por asiento en el laboratorio.
    private static final int FEE = 8;

    // Constructor que recibe el nombre y la capacidad.
    public ComputerLab(String title, int capacity) {
        super(title, capacity);
    }

    // Devuelve el precio de cada asiento.
    public int feePerSeat() {
        return FEE;
    }
}

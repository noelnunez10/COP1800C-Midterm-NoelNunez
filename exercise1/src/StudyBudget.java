
public class StudyBudget {

    // Estas constantes guardan los valores fijos del ejercicio.
    // static final significa que no puedo cambiar sus valores.
    private static final int BLOCK_MINUTES = 30;
    private static final int FEE_PER_BLOCK = 5;
    private static final double DISCOUNT_RATE = 0.20;


    public static void main(String[] args) {
        // String sirve para guardar el nombre del estudiante.
        String name = " Ana Lee ";

        // int guarda los minutos como un numero entero.
        int minutes = 95;

        // boolean indica si la membresia esta activa o no.
        boolean activeMembership = true;

        // trim() quita los espacios del inicio y final del nombre.
        name = name.trim();

        // isEmpty() revisa si el nombre quedo vacio.
        // || significa OR, basta con que una condicion sea verdadera.
        if (name.isEmpty() || minutes <= 0) {

            System.out.println("Invalid data: name or minutes.");

            return;
        }

        // Convierto el nombre a letras mayusculas.
        String upperName = name.toUpperCase();

        // charAt(0) obtiene la primera letra del nombre.
        // Lo hago despues de validar para evitar errores.
        char initial = name.charAt(0);

        // La division entre int cuenta solo los bloques completos.
        int blocks = minutes / BLOCK_MINUTES;

        // El operador % calcula los minutos que sobran.
        int remainingMinutes = minutes % BLOCK_MINUTES;

        // Multiplico los bloques completos por su precio.
        // Uso double porque los pagos pueden tener decimales.
        double baseFee = blocks * FEE_PER_BLOCK;

        // && significa AND, las dos condiciones deben cumplirse.
        // Necesita membresia activa y al menos 4 bloques.
        boolean eligible = activeMembership && blocks >= 4;

        // Creo las variables donde guardare el descuento y pago final.
        double discountAmount;
        double finalFee;

        // Si cumple las condiciones, calculo el descuento.
        if (eligible) {

            // Multiplico el precio por 0.20 (que es el 20%) para obtener el descuento.
            discountAmount = baseFee * DISCOUNT_RATE;

            // Resto el descuento del precio original.
            finalFee = baseFee - discountAmount;

        } else {

            // Si no cumple, el descuento es cero.
            discountAmount = 0.0;

            // El estudiante paga el precio completo.
            finalFee = baseFee;
        }

        // Muestro un reporte con toda la informacion solicitada.
        System.out.println("STUDY BUDGET REPORT");

        // Muestro el nombre sin los espacios adicionales.
        System.out.println("Name: " + name);

        // Muestro el nombre en mayusculas.
        System.out.println("Uppercase name: " + upperName);

        // Muestro la primera letra del nombre.
        System.out.println("Initial: " + initial);

        // Muestro si tiene membresia activa.
        System.out.println("Active membership: " + activeMembership);

        // Muestro los bloques completos y minutos restantes.
        System.out.println("Complete blocks: " + blocks);
        System.out.println("Remaining minutes: " + remainingMinutes);

        // Muestro si puede recibir el descuento.
        System.out.println("Eligible for discount: " + eligible);

        // printf con %.2f muestra exactamente dos decimales. (eso me lo ensenaron en python)
        // %n hace un salto de linea. (igual aqui)
        System.out.printf("Base fee: %.2f%n", baseFee);
        System.out.printf("Discount: %.2f%n", discountAmount);
        System.out.printf("Final fee: %.2f%n", finalFee);
    }
}

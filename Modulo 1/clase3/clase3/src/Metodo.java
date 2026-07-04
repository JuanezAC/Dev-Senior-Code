public class Metodo {
    public static void main(String[] args) {
        double propina = calcularPropina(80000, 0.10);
        System.out.println("Propina: " + propina);
    }

    static double calcularPropina(double subtotal, double porcentaje) {
        return subtotal * porcentaje;
    }

    static double calcularTotal(double subtotal, double porcentaje) {
        double propina = calcularPropina(subtotal, porcentaje);
    return subtotal + propina;  
}
}

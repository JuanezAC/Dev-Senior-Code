import java.util.Scanner;

public class Operaciones {

    static String nombre = "";
    static int cantidad = 0;
    static double precio = 0.0;
    static boolean hayProducto = false;

    public static void registrar(Scanner sc) {
        if(!Validador.hayProducto(hayProducto)) {
            nombre = Validador.leerTexto(sc, "Nombre del producto: ");
            cantidad = Validador.leerEntero(sc, "Cantidad: ");
            precio = Validador.leerDecimal(sc, "Precio unitario: ");
            hayProducto = true;
            System.out.println("Producto registrado correctamente.");
        }
    }

    public static void ver() {
        Validador.hayProducto(hayProducto);

        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio:   " + precio);
    }

    public static void actualizarCantidad(Scanner sc) {
        Validador.hayProducto(hayProducto);

        cantidad = Validador.leerEntero(sc, "Nueva cantidad: ");
        System.out.println("Cantidad actualizada.");
    }

    public static void verValorTotal() {
        Validador.hayProducto(hayProducto);

        double total = cantidad * precio;
        System.out.println("Valor total en inventario: " + total);
    }

}

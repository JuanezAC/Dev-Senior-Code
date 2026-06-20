import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas personas en la mesa: ");
        int personas = sc.nextInt();

        sc.nextLine(); // Limpiar el buffer después de leer un entero

        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.println("Mesa de "+ nombre + ", "+ personas+ " personas.");

        double subtotal = 120000;
        boolean tieneCupon = true;

        boolean aplicaDescuento = subtotal > 100000 && tieneCupon;
        System.out.println("Aplica descuento? " + aplicaDescuento);

        int entero = 5;
        double comoDecimal = entero; // Conversión implícita de int a double
        System.out.println("Inplicita: " + comoDecimal);

        double precio = 19990.75;
        int precioRecortado = (int) precio; // Conversión explícita de double a int
        System.out.println("Casting: " + precioRecortado);
    }
}

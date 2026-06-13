public class App {
    public static void main(String[] args) throws Exception {
        // Constantes no pueden ser modificadas una vez asignado su valor
        final double IVA = 0.19;
        final int DIAS_SEMANA = 7;

        //operadores aritméticos
        // Suma
        int a = 5;
        int b = 10;
        int suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);

        // Multiplicación
        int multiplicacion = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + multiplicacion);

        // División
        int division = b / a;
        System.out.println("La división de " + b + " y " + a + " es: " + division);

        // Modulo
        //El modulo es el residuo de la división entre dos números. Por ejemplo, 
        // el módulo de 10 y 3 es 1, porque 10 dividido por 3 da un cociente de 3 y un residuo de 1.
        int modulo = b % a;
        System.out.println("El módulo de " + b + " y " + a + " es: " + modulo);

        int entero1 = 5;
        int entero2 = 10;
        //La suma se tiene que poner en parentecis
        System.out.println("El resultado de la suma es: " + (entero1 + entero2));
    }
}

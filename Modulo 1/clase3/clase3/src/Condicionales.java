public class Condicionales {
    public static void main(String[] args) {
        double cuenta = 150000;

        if (cuenta >= 200000){
            System.out.println("Descuento vip (15%)");
        }else if (cuenta >= 100000){
            System.out.println("Descuento regular (10%)");
        }else{
            System.out.println("No aplica descuento");
        }
    }
}

package Clase_2.src;
import javax.swing.JOptionPane;

public class RepasoClase1{
    public static void main(String[] args) {
        String nombre;
        int edad;
        double estatura;

        nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad: "));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Digite la estatura: "));

        System.out.println("Nombre: " + nombre+ "\nEdad: " + edad + "\nEstatura: " + estatura);
    }
}

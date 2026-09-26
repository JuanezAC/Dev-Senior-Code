import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nombres;
        int edad;
        double salario;
        float promedio;
        char sexo;
        boolean estado;

        nombres = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del estudiante: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del estudiante: "));

        JOptionPane.showMessageDialog(null, "Nombre: " + nombres + "\nEdad: " + edad + "\nSalario: " + salario);
    }
}

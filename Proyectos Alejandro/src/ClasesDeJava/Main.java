package ClasesDeJava;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba: ");
        JOptionPane.showMessageDialog(null, "Mensaje: HOLA", "Título", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje: Advertencia", "Título", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensaje: Advertencia", "Título", JOptionPane.PLAIN_MESSAGE);

    }
}

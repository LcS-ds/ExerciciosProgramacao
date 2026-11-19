package entrada;

import javax.swing.JOptionPane;

public class EntradaNumero {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um numero");

        JOptionPane.showMessageDialog(null, "O numero digitado foi: " + numero);
    }
}

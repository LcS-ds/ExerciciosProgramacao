package entrada;

import javax.swing.JOptionPane;

public class EntradaDeDados {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome + "!");
    }
}

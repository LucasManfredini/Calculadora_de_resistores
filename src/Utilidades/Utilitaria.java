package Utilidades;
import javax.swing.JOptionPane;

public class Utilitaria {
    public static int validaDados(String mensagem, int min, int max) {
        boolean valido = false;
        int valor;
        do{
            if(valido) {
                JOptionPane.showMessageDialog(null, "Numero inválido");
                valido = true;
            }
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
        }while(min > valor || valor > max);
        return valor;
    }
    public static double validaDados(String mensagem, double min, double max) {
        boolean valido = false;
        double valor;
        do{
            if(valido) {
                JOptionPane.showMessageDialog(null, "Numero inválido");
                valido = true;
            }
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, mensagem));
        }while(min > valor || valor > max);
        return valor;
    }
}

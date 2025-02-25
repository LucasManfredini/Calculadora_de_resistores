package Programa;

import javax.swing.JOptionPane;
import java.util.ArrayList;

import static Utilidades.Utilitaria.*;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Double> valorResistores = new ArrayList<>();
        JOptionPane.showMessageDialog(null, "Bem vindo ao programa de calculadora de resistores");
        int numeroResistores;
        numeroResistores = validaDados("Digite a quantidade de resistores disponiveis de 1 a 10", 1, 10);
        for (int i = 0; i < numeroResistores; i++) {
            valorResistores.add(validaDados("Digite a resistencia dos resistores disponiveis",0.0,100000.0));
        }
    }
}

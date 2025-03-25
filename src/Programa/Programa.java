package Programa;

import java.util.ArrayList;

import static Utilidades.Utilitaria.*;
import static javax.swing.JOptionPane.*;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Double> resistores = new ArrayList<>();

        int numeroResistores;
        double valorDesejadoResistor, resultado;
        String continuar;
        StringBuilder texto = new StringBuilder();


        showMessageDialog(null, "Bem vindo ao programa de calculadora de resistores");
        while(true) {
            numeroResistores = validaDados("Digite a quantidade de resistores disponiveis de 1 a 10", 1, 10);

            for (int i = 0; i < numeroResistores; i++) {
                resistores.add(validaDados("Digite a resistencia do "+ (i+1) +" resistor", 0.1, 100000.0));
            }
            valorDesejadoResistor = validaDados("Digite o valor da resistencia desejada", 0.1, 100000.0);

            ArrayList<Double> melhorCombinacao = calculaVariosResistores(resistores, valorDesejadoResistor);
            resultado = calculaResParalelo(melhorCombinacao);
            texto.append("Melhor combinação de resitores: \n");
            texto.append("Valor do resistor desejado: ").append(valorDesejadoResistor).append("\n");
            texto.append("Valor da melhor Combinação: ").append(resultado).append("\n");
            texto.append("Resistores combinados\n");
            for (int i = 0; i < melhorCombinacao.size(); i++) {
                texto.append("Resistor ").append(i+1).append(": ").append(melhorCombinacao.get(i)).append("\n");
            }

            showMessageDialog(null, texto.toString());
            continuar = showInputDialog(null,"Dejeja usar a calculador de novo? (S/N)");
            if (continuar.equalsIgnoreCase("N"))break;
            texto = new StringBuilder("");
        }
    }
}



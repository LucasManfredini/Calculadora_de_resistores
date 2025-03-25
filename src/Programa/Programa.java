package Programa;

import javax.swing.JOptionPane;
public class Programa {
    public static void main(String[] args) {

        int quantres, quantrespar, conta = 1;
        double resistores[] = new double[7], resistordesejado, resistorequivalente;

        JOptionPane.showMessageDialog(null, "Bem vindo ao programa de calcular resistores equivalentes");

        do {
            quantres = Integer.parseInt(JOptionPane.
                    showInputDialog("Quantos resistores far�o parte da conta (1 a 6)"));
        } while (quantres < 1 || quantres > 6);

        do {
            quantrespar = Integer.parseInt(JOptionPane.
                    showInputDialog("Quantos resistores estar�o em paralelo (3 a 5)"));
        } while (quantrespar < 3 || quantrespar > 5);

        do {
            resistores[conta] = Double.parseDouble(JOptionPane.
                    showInputDialog("Qual o valor do resistor " + conta));

            if (resistores[conta] > 0) {
                System.out.println(resistores[conta]);
                conta++;
            }
        } while (conta <= quantres);

        do {
            resistordesejado = Double.parseDouble(JOptionPane.
                    showInputDialog("Qual o valor do resistor Desejado"));
            System.out.println(resistordesejado);
        } while (resistordesejado <= 0);


        if (quantrespar == 3) {

            double diferenca = 0, memoria = resistordesejado;
            int j1 = 0, j2 = 0, j3 = 0;
            for (int i1 = 1; i1 <= quantres; i1++) {
                for (int i2 = 1; i2 <= quantres; i2++) {
                    for (int i3 = 1; i3 <= quantres; i3++) {
                        resistorequivalente = (1 / ((1 / resistores[i1]) + (1 / resistores[i2]) + (1 / resistores[i3])));
                        diferenca = resistordesejado - resistorequivalente;
                        if (diferenca < 0) {
                            diferenca *= (-1);
                        }
                        if (diferenca < memoria) {
                            memoria = diferenca;
                            System.out.println(memoria + " resistores " + resistores[i1] + " " + resistores[i2] + " " + resistores[i3]);
                            j1 = i1;
                            j2 = i2;
                            j3 = i3;
                        }
                    }
                }
            }
            double resistenciafinal = (1 / ((1 / resistores[j1]) + (1 / resistores[j2]) + (1 / resistores[j3])));
            JOptionPane.showMessageDialog(null, "Melhor combina��o de resitores:"
                    + "\nValor desejado " + resistordesejado
                    + "\nValor da combina��o " + resistenciafinal
                    + "\nResistor 1: " + resistores[j1]
                    + "\nResistor 2: " + resistores[j2]
                    + "\nResistor 3: " + resistores[j3]);
        } else if (quantrespar == 4) {
            double diferenca = 0, memoria = resistordesejado;
            int j1 = 0, j2 = 0, j3 = 0, j4 = 0;
            for (int i1 = 1; i1 <= quantres; i1++) {
                for (int i2 = 1; i2 <= quantres; i2++) {
                    for (int i3 = 1; i3 <= quantres; i3++) {
                        for (int i4 = 1; i4 <= quantres; i4++) {
                            resistorequivalente = (1 / ((1 / resistores[i1]) + (1 / resistores[i2]) + (1 / resistores[i3]) + (1 / resistores[i4])));
                            diferenca = resistordesejado - resistorequivalente;
                            if (diferenca < 0) {
                                diferenca *= (-1);
                            }
                            if (diferenca < memoria) {
                                memoria = diferenca;
                                System.out.println(memoria + " resistores " + resistores[i1] + " " + resistores[i2] + " " + resistores[i3] + " " + resistores[i4]);
                                j1 = i1;
                                j2 = i2;
                                j3 = i3;
                                j4 = i4;
                            }
                        }
                    }
                }
            }

            double resistenciafinal = (1 / ((1 / resistores[j1]) + (1 / resistores[j2]) + (1 / resistores[j3]) + (1 / resistores[j4])));
            JOptionPane.showMessageDialog(null, "Melhor combina��o de resitores:"
                    + "\nValor desejado " + resistordesejado
                    + "\nValor da combina��o " + resistenciafinal
                    + "\nResistor 1: " + resistores[j1]
                    + "\nResistor 2: " + resistores[j2]
                    + "\nResistor 3: " + resistores[j3]
                    + "\nResistor 4: " + resistores[j4]);
        } else if (quantrespar == 5) {
            double diferenca = 0, memoria = resistordesejado;
            int j1 = 0, j2 = 0, j3 = 0, j4 = 0, j5 = 0;
            for (int i1 = 1; i1 <= quantres; i1++) {
                for (int i2 = 1; i2 <= quantres; i2++) {
                    for (int i3 = 1; i3 <= quantres; i3++) {
                        for (int i4 = 1; i4 <= quantres; i4++) {
                            for (int i5 = 1; i5 <= quantres; i5++) {
                                resistorequivalente = (1 / ((1 / resistores[i1]) + (1 / resistores[i2]) + (1 / resistores[i3]) + (1 / resistores[i4]) + (1 / resistores[i5])));
                                diferenca = resistordesejado - resistorequivalente;
                                if (diferenca < 0) {
                                    diferenca *= (-1);
                                }
                                if (diferenca < memoria) {
                                    memoria = diferenca;
                                    System.out.println(memoria + " resistores " + resistores[i1] + " " + resistores[i2] + " " + resistores[i3] + " " + resistores[i4] + " " + resistores[i5]);
                                    j1 = i1;
                                    j2 = i2;
                                    j3 = i3;
                                    j4 = i4;
                                    j5 = i5;
                                }
                            }
                        }
                    }
                }
            }

            double resistenciafinal = (1 / ((1 / resistores[j1]) + (1 / resistores[j2]) + (1 / resistores[j3]) + (1 / resistores[j4]) + (1 / resistores[j5])));
            JOptionPane.showMessageDialog(null, "Melhor combina��o de resitores:"
                    + "\nValor desejado " + resistordesejado
                    + "\nValor da combina��o " + resistenciafinal
                    + "\nResistor 1: " + resistores[j1]
                    + "\nResistor 2: " + resistores[j2]
                    + "\nResistor 3: " + resistores[j3]
                    + "\nResistor 4: " + resistores[j4]
                    + "\nResistor 5: " + resistores[j5]);
        }
    }
}


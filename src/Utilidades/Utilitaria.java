package Utilidades;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class Utilitaria {
    public static int validaDados(String mensagem, int min, int max) {
        boolean valido = false;
        int valor;
        do{
            if(valido) {
                showMessageDialog(null, "Numero inválido");
                valido = true;
            }
            valor = Integer.parseInt(showInputDialog(null, mensagem));
        }while(min > valor || valor > max);
        return valor;
    }

    public static double validaDados(String mensagem, double min, double max) {
        boolean valido = false;
        double valor;
        do{
            if(valido) {
                showMessageDialog(null, "Numero inválido");
                valido = true;
            }
            valor = Double.parseDouble(showInputDialog(null, mensagem));
        }while(min > valor || valor > max);
        return valor;
    }

    public static double calculaResParalelo(ArrayList<Double> resistores) {
        double resistorEquivalente = resistores.get(0);
        for (int i = 0 ; i < resistores.size()-1 ; i++) {
            resistorEquivalente = (resistorEquivalente * resistores.get(i+1))/(resistorEquivalente + resistores.get(i+1));
        }
        return resistorEquivalente;
    }

    public static ArrayList<Double> calculaVariosResistores(ArrayList<Double> resistores, Double resistorDesejado) {
        ArrayList<Double> melhorCombinacao = new ArrayList<>();
        ArrayList<Double> combinacoes = new ArrayList<>();
        double resistorEquivalente, memoria = resistorDesejado, diferenca;

        for(int i1 = 0; i1 < resistores.size(); i1++) {
            for(int i2 = 0; i2 < resistores.size(); i2++) {
                combinacoes.add(resistores.get(i1));
                combinacoes.add(resistores.get(i2));
                resistorEquivalente = calculaResParalelo(combinacoes);
                diferenca = resistorDesejado - resistorEquivalente;
                if (diferenca < 0) diferenca *= (-1);
                if (diferenca < memoria){
                    memoria = diferenca;
                    melhorCombinacao.clear();
                    melhorCombinacao.addAll(combinacoes);
                }
                combinacoes.clear();
                if (diferenca == 0) break;
                for(int i3 = 0; i3 < resistores.size(); i3++) {
                    combinacoes.add(resistores.get(i1));
                    combinacoes.add(resistores.get(i2));
                    combinacoes.add(resistores.get(i3));
                    resistorEquivalente = calculaResParalelo(combinacoes);
                    diferenca = resistorDesejado - resistorEquivalente;
                    if (diferenca < 0) diferenca *= (-1);
                    if (diferenca < memoria){
                        memoria = diferenca;
                        melhorCombinacao.clear();
                        melhorCombinacao.addAll(combinacoes);
                    }
                    combinacoes.clear();
                    if (diferenca == 0) break;
                    for(int i4 = 0; i4 < resistores.size(); i4++) {
                        combinacoes.add(resistores.get(i1));
                        combinacoes.add(resistores.get(i2));
                        combinacoes.add(resistores.get(i3));
                        combinacoes.add(resistores.get(i4));
                        resistorEquivalente = calculaResParalelo(combinacoes);
                        diferenca = resistorDesejado - resistorEquivalente;
                        if (diferenca < 0) diferenca *= (-1);
                        if (diferenca < memoria){
                            memoria = diferenca;
                            melhorCombinacao.clear();
                            melhorCombinacao.addAll(combinacoes);
                        }
                        combinacoes.clear();
                        if (diferenca == 0) break;
                        for(int i5= 0; i5 < resistores.size(); i5++) {
                            combinacoes.add(resistores.get(i1));
                            combinacoes.add(resistores.get(i2));
                            combinacoes.add(resistores.get(i3));
                            combinacoes.add(resistores.get(i4));
                            combinacoes.add(resistores.get(i5));
                            resistorEquivalente = calculaResParalelo(combinacoes);
                            diferenca = resistorDesejado - resistorEquivalente;
                            if (diferenca < 0) diferenca *= (-1);
                            if (diferenca < memoria){
                                memoria = diferenca;
                                melhorCombinacao.clear();
                                melhorCombinacao.addAll(combinacoes);
                            }
                            combinacoes.clear();
                            if (diferenca == 0) break;
                            for(int i6 = 0; i6 < resistores.size(); i6++) {
                                combinacoes.add(resistores.get(i1));
                                combinacoes.add(resistores.get(i2));
                                combinacoes.add(resistores.get(i3));
                                combinacoes.add(resistores.get(i4));
                                combinacoes.add(resistores.get(i5));
                                combinacoes.add(resistores.get(i6));
                                resistorEquivalente = calculaResParalelo(combinacoes);
                                diferenca = resistorDesejado - resistorEquivalente;
                                if (diferenca < 0) diferenca *= (-1);
                                if (diferenca < memoria){
                                    memoria = diferenca;
                                    melhorCombinacao.clear();
                                    melhorCombinacao.addAll(combinacoes);
                                }
                                combinacoes.clear();
                                if (diferenca == 0) break;
                            }
                        }
                    }
                }

            }
        }
        return melhorCombinacao;
    }
}


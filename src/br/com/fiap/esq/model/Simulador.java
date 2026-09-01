package br.com.fiap.esq.model;

public class Simulador {

    public static String simularObjetivos(int opcao, int meses, double valorMensal, Objetivo objetivo){
        double valorRestante = objetivo.getValorFinalObjetivo() - objetivo.getValorInicialObjetivo();;
        int mesesRestantes = 0;
        double valorPorMes = 0;
        if (opcao == 1) {
           valorPorMes = valorRestante / meses;
            String resultado = String.format("%.2f", valorPorMes);
           return ("Para alcançar seu objetivo, guarde R$" + resultado + " por mês.");
        } else {
            mesesRestantes = (int) (valorRestante / valorMensal);
            return ("Para alcançar seu objetivo, faltam: " + mesesRestantes + " meses.");
        }
    }


}

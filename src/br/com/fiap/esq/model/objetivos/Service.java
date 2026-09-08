package br.com.fiap.esq.model.objetivos;

import java.util.List;
import java.util.Scanner;

public class Service {
    public static void lancarObjetivos(Scanner sc, List<Objetivo> objetivos) {
        System.out.println("Qual o seu próximo objetivo?");
        String objetivoNome = sc.next() + sc.nextLine();
        System.out.print("Qual o valor total para atingir seu objetivo? \nR$");
        double valorFinalObjetivo = sc.nextDouble();
        System.out.print("Quanto será seu investimento inicial? \nR$");
        double valorInicialObjetivo = sc.nextDouble();
        objetivos.add(new Objetivo(objetivoNome, valorFinalObjetivo, valorInicialObjetivo));
        System.out.println("Objetivo Cadastrado com sucesso! Você pode agora selecionar o simulador de objetivos para ver qual melhor forma de alcançá-lo!");
    }

    public static void simularObjetivos(List<Objetivo> objetivos, Scanner sc) {
        System.out.println("Qual objetivo você gostaria de simular?");

        int numeroObjetivo = 1;

        for (Objetivo objetivo : objetivos) {
            System.out.println(
                    numeroObjetivo++ + " - " +
                            objetivo.getObjetivo() +
                            " | Valor inicial: R$ " + String.format("%.2f", objetivo.getValorInicialObjetivo()) +
                            " | Valor final: R$ " + String.format("%.2f", objetivo.getValorFinalObjetivo())
            );
        }

        int escolhaObjetivo = sc.nextInt();

        if (escolhaObjetivo < 1 || escolhaObjetivo > objetivos.size()) {
            System.out.println("Objetivo inválido.");
            return;
        }

        Objetivo objetivoSelecionado = objetivos.get(escolhaObjetivo - 1);

        System.out.println(
                "Você quer simular com base em: " +
                        "1-Número de meses ou 2-Valor mensal?"
        );

        int opcaoSimulador = sc.nextInt();

        int mesesObjetivo = 0;
        double valorMensal = 0;

        if (opcaoSimulador == 1) {

            System.out.println("Em quantos meses você deseja atingir seu objetivo?");
            mesesObjetivo = sc.nextInt();

        } else if (opcaoSimulador == 2) {

            System.out.print("Qual valor você deseja guardar por mês? \nR$");
            valorMensal = sc.nextDouble();

        } else {
            System.out.println("Opção Inválida!");
            return;
        }

        System.out.println(
                Simulador.simularObjetivos(
                        opcaoSimulador,
                        mesesObjetivo,
                        valorMensal,
                        objetivoSelecionado
                )
        );
    }
}

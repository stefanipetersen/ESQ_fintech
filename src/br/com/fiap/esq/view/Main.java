package br.com.fiap.esq.view;

import br.com.fiap.esq.model.Gasto;
import br.com.fiap.esq.model.Objetivo;
import br.com.fiap.esq.model.Simulador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        List<Gasto> gastos = new ArrayList<>();
        List<Objetivo> objetivos = new ArrayList<>();

        do {
            System.out.println("Bem-vindo(a) ao ESQ! \nSua plataforma preferida de organização e planejamento financeiro.");
            System.out.println("O que você gostaria de fazer hoje? \n1-Lançar Gastos \n2-Exibir Gastos \n3-Lançar Objetivos \n4-Simulador dos Objetivos \n0-Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Qual o nome do estabelecimento?");
                    String estabelecimento = sc.next() + sc.nextLine();
                    System.out.println("Qual o tipo do estabelecimento (1-Comida, 2-Moradia, 3-Lazer, 4-Saúde, 5-Outros?");
                    int tipoDoEstabelecimento = sc.nextInt();
                    System.out.print("Qual o valor gasto? \nR$" );
                    double valorGasto = sc.nextDouble();

                    gastos.add(new Gasto(estabelecimento, tipoDoEstabelecimento, valorGasto));
                    System.out.println("Gasto registrado com sucesso!");
                    break;

                case 2:
                    int quantos_gastos = 1;
                    for (Gasto gasto1 : gastos)
                    {
                        System.out.println("Gasto #"+ quantos_gastos + "\n Estabelecimento: " + gasto1.getEstabelecimento() + "| Categoria: " + gasto1.getTipoDoEstabelecimento()+ "| Valor: R$" + gasto1.getValorGasto());
                        quantos_gastos++;
                    }
                    break;

                case 3:
                    System.out.println("Qual o seu próximo objetivo?");
                    String objetivoNome = sc.next() + sc.nextLine();
                    System.out.print("Qual o valor total para atingir seu objetivo? \nR$");
                    double valorFinalObjetivo = sc.nextDouble();
                    System.out.print("Quanto será seu investimento inicial? \nR$");
                    double valorInicialObjetivo = sc.nextDouble();
                    objetivos.add(new Objetivo(objetivoNome, valorFinalObjetivo, valorInicialObjetivo));
                    System.out.println("Objetivo Cadastrado com sucesso! Você pode agora selecionar o simulador de objetivos para ver qual melhor forma de alcançá-lo!");
                    break;

                case 4:
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
                        break;
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
                        break;
                    }

                    System.out.println(
                            Simulador.simularObjetivos(
                                    opcaoSimulador,
                                    mesesObjetivo,
                                    valorMensal,
                                    objetivoSelecionado
                            )
                    );

                    break;

                case 0:
                    System.out.println("Finalizando o sistema");
                    break;
                default:
                    System.out.println("Opção Inválida!");


            }

        } while (op != 0);

        sc.close();

    }

}

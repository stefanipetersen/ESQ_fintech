package br.com.fiap.esq.view;

import br.com.fiap.esq.model.Gasto;
import br.com.fiap.esq.model.Objetivo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        Gasto gasto = new Gasto();
        Objetivo objetivo = new Objetivo();

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
                    gasto.setEstabelecimento(estabelecimento);
                    gasto.setTipoDoEstabelecimento(tipoDoEstabelecimento);
                    gasto.setValorGasto(valorGasto);

                    System.out.println("Gasto registrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Estabelecimento: " + gasto.getEstabelecimento() + ", Tipo do estabelecimento: " + gasto.getTipoDoEstabelecimento()+ ", Valor gasto: R$" + gasto.getValorGasto());
                    break;

                case 3:
                    System.out.println("Qual o seu próximo objetivo?");
                    String objetivoNome = sc.next() + sc.nextLine();
                    System.out.println("Qual o valor total para atingir seu objetivo?");
                    double valorFinalObjetivo = sc.nextDouble();
                    System.out.println("Quanto será seu investimento inicial?");
                    double valorInicialObjetivo = sc.nextDouble();
                    objetivo.setObjetivo(objetivoNome);
                    objetivo.setValorFinalObjetivo(valorFinalObjetivo);
                    objetivo.setValorInicialObjetivo(valorInicialObjetivo);
                    System.out.println("Objetivo Cadastrado com sucesso! Você pode agora selecionar o simulador de objetivos para ver qual melhor forma de alcançá-lo!");
                    break;


                case 4:
                    System.out.println("");
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

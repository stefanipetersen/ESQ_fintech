package br.com.fiap.esq.view;

import br.com.fiap.esq.model.gastos.Gasto;
import br.com.fiap.esq.model.objetivos.Objetivo;
import br.com.fiap.esq.model.objetivos.Simulador;
import br.com.fiap.esq.model.login.Cliente;
import br.com.fiap.esq.model.login.ClienteBasic;
import br.com.fiap.esq.model.login.ClientePremium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.fiap.esq.model.gastos.Service.exibirGastos;
import static br.com.fiap.esq.model.gastos.Service.lancarGastos;
import static br.com.fiap.esq.model.login.Service.cadastroUsuario;
import static br.com.fiap.esq.model.login.Service.meusDados;
import static br.com.fiap.esq.model.objetivos.Service.lancarObjetivos;
import static br.com.fiap.esq.model.objetivos.Service.simularObjetivos;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        int plano = 0;

        Cliente clienteBasic = new ClienteBasic();
        Cliente clientePremium = new ClientePremium();
        List<Gasto> gastos = new ArrayList<>();
        List<Objetivo> objetivos = new ArrayList<>();

        do {
            System.out.println("Bem-vindo(a) ao ESQ! \nSua plataforma preferida de organização e planejamento financeiro.");
            System.out.println("O que você gostaria de fazer hoje? \n1-Cadastrar \n2-Meus Dados \n3-Lançar Gastos \n4-Exibir Gastos \n5-Lançar Objetivos \n6-Simulador dos Objetivos \n0-Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    plano = cadastroUsuario(sc, clienteBasic, clientePremium);
                    break;

                case 2:
                    meusDados(plano, clienteBasic, clientePremium);
                    break;

                case 3:
                    lancarGastos(sc, gastos);
                    break;

                case 4:
                    exibirGastos(gastos);
                    break;

                case 5:
                    lancarObjetivos(sc, objetivos);
                    break;

                case 6:
                    simularObjetivos(objetivos, sc);
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

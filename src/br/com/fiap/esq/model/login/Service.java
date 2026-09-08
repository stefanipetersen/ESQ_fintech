package br.com.fiap.esq.model.login;

import java.util.Scanner;

public class Service {

    public static int cadastroUsuario(Scanner sc, Cliente clienteBasic, Cliente clientePremium) {
        int plano;
        System.out.println("Digite o seu nome completo: ");
        String nome = sc.next() + sc.nextLine();
        System.out.println("Digite o seu CPF: ");
        String cpf = sc.next() + sc.nextLine();
        System.out.println("Digite o seu E-mail: ");
        String email = sc.next() + sc.nextLine();
        System.out.println("Qual plano você gostaria de assinar? \n1-Basic (grátis) \n2-Premium (R$30,00/mês)");
        plano = sc.nextInt();
        if (plano == 1){
            clienteBasic.setNome(nome);
            clienteBasic.setCpf(cpf);
            clienteBasic.setEmail(email);
            clienteBasic.setPlano(plano);
        } else {
            clientePremium.setNome(nome);
            clientePremium.setCpf(cpf);
            clientePremium.setEmail(email);
            clientePremium.setPlano(plano);
        }
        System.out.println("Usuário cadastrado com sucesso!");
        return plano;
    }

    public static void meusDados(int plano, Cliente clienteBasic, Cliente clientePremium) {
        if (plano == 1){
            System.out.println(clienteBasic.resumoConta());
        } else if (plano == 2) {
            System.out.println(clientePremium.resumoConta());
        } else {
            System.out.println("Cliente não cadastrado.");
        }
    }

}

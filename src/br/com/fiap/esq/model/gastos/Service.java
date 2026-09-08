package br.com.fiap.esq.model.gastos;

import java.util.List;
import java.util.Scanner;

public class Service {
    public static void lancarGastos(Scanner sc, List<Gasto> gastos) {
        System.out.println("Qual o nome do estabelecimento?");
        String estabelecimento = sc.next() + sc.nextLine();
        System.out.println("Qual o tipo do estabelecimento (1-Comida, 2-Moradia, 3-Lazer, 4-Saúde, 5-Outros?");
        int tipoDoEstabelecimento = sc.nextInt();
        System.out.print("Qual o valor gasto? \nR$" );
        double valorGasto = sc.nextDouble();

        gastos.add(new Gasto(estabelecimento, tipoDoEstabelecimento, valorGasto));
        System.out.println("Gasto registrado com sucesso!");
    }

    public static void exibirGastos(List<Gasto> gastos) {
        int quantos_gastos = 1;
        for (Gasto gasto1 : gastos)
        {
            System.out.println("Gasto #"+ quantos_gastos + "\n Estabelecimento: " + gasto1.getEstabelecimento() + "| Categoria: " + gasto1.getTipoDoEstabelecimento()+ "| Valor: R$" + gasto1.getValorGasto());
            quantos_gastos++;
        }
    }
}

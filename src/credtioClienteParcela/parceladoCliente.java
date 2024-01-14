package credtioClienteParcela;

import java.util.Scanner;

public class parceladoCliente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Nome do Cliente");
        String nome = entrada.nextLine();
        System.out.println("Digite o Valor do Prodeuto");
        double valorProduto = entrada.nextDouble();

        System.out.println("Escolher o Número de Parcelas: ");
        System.out.println("Digite 1 - Zero Juros");
        System.out.println("Digite 2 - 05% de juros no Valor da Compra");
        System.out.println("Digite 3 - 10% de juros no Valor da Compra");
        System.out.println("Digite 4 - 15% de juros no Valor da Compra");
        int parcela = entrada.nextInt();
        double totalCompra = 0;
        double valorParcela = 0;
        double totalJuros = 0;

        if (parcela == 1) {

            System.out.println("Nome do Cliente " + nome);
            System.out.println("Valor da Comprar  R$ " + valorProduto + " reais ");
            System.out.println("Sem Juros no Total da Compra!");

        } else if (parcela == 2) {

            System.out.println("Nome do Cliente " + nome);
            double  novoValor = valorProduto * 0.05;
            System.out.println("Valor da Comprar  R$ " + valorProduto + " reais ");
            totalCompra = valorProduto + novoValor;
            System.out.println("Valor Total da Comprar " + totalCompra + " em 2x com 5% ");

            valorParcela = totalCompra/2;
            System.out.println("1ºº Parcela de " + valorParcela + " reais");
            System.out.println("2ºº Parcela de " + valorParcela + " reais");

            totalJuros = valorParcela*2;
            System.out.println("Total com Jurtos R$" + totalJuros + " reais");

        } else if (parcela == 3) {
            System.out.println("Nome do Cliente " + nome);
            double novoValor = valorProduto * 0.10;
            System.out.println("Valor da Comprar  R$ " + valorProduto + " reais ");
            totalCompra = valorProduto + novoValor;
            System.out.println("Valor Total da Comprar " + totalCompra + " em 3x com 10% ");

            valorParcela = totalCompra / 3;
            System.out.println("1ºº Parcela de " + valorParcela + " reais");
            System.out.println("2ºº Parcela de " + valorParcela + " reais");
            System.out.println("3ºº Parcela de " + valorParcela + " reais");


            totalJuros = valorParcela*3;
            System.out.println("Total com Jurtos R$" + totalJuros + " reais");

        } else if (parcela == 4) {
            System.out.println("Nome do Cliente " + nome);
            double  novoValor = valorProduto * 0.15;
            System.out.println("Valor da Comprar  R$ " + valorProduto + " reais ");
            totalCompra = valorProduto + novoValor;
            System.out.println("Valor Total da Comprar " + totalCompra + " em 4x com 15% ");

            valorParcela = totalCompra/4;
            System.out.println("1ºº Parcela de " + valorParcela + " reais");
            System.out.println("2ºº Parcela de " + valorParcela + " reais");
            System.out.println("3ºº Parcela de " + valorParcela + " reais");
            System.out.println("4ºº Parcela de " + valorParcela + " reais");

            totalJuros = valorParcela*4;
            System.out.println("Total com Jurtos R$" + totalJuros + " reais");

        } else {System.out.println("Valor Digitado Incorreto!");}
    }
}
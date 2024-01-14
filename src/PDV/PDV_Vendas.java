package PDV;

import java.util.Scanner;

public class PDV_Vendas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("CODIGO - PRODUTO ");
        System.out.println("______________________________________________");
        System.out.println("1001 -   Feijão ");
        System.out.println("______________________________________________");
        System.out.println("1324 -   Arroz ");
        System.out.println("______________________________________________");
        System.out.println("6548 -   Carne ");
        System.out.println("______________________________________________");
        System.out.println("0987 -   Banana ");
        System.out.println("______________________________________________");
        System.out.println("7623 -   Leite ");
        System.out.println("______________________________________________");
        System.out.println("1000 -   Macarrão ");
        System.out.println("______________________________________________");

        System.out.println("Digite o Código do Produto: ");
        double CodProduto = entrada.nextDouble();
        double totalProduto;

        System.out.println("Digite a Quantidade do Produto: ");
        double QuantProduto = entrada.nextDouble();

        if (CodProduto == 1001) {
            totalProduto = QuantProduto * 5.32;
            System.out.println("Valor do Produto " + " CODIGO 1001 - Feijão | Total R$ " + totalProduto );

        } else if (CodProduto == 1324) {
            totalProduto = QuantProduto * 6.45;
            System.out.println("Valor do Produto " + " CODIGO 1324 - Arroz | Total R$ " + totalProduto );

        } else if (CodProduto == 6548) {

            totalProduto = QuantProduto * 2.75;
            System.out.println("Valor do Produto " + " CODIGO 6548 - Carne | Total R$ " + totalProduto );

        } else if (CodProduto == 987) {
            totalProduto = QuantProduto * 5.32;
            System.out.println("Valor do Produto " + " CODIGO 987 - Banana | Total R$ " + totalProduto );

        } else if (CodProduto == 7623){

            totalProduto = QuantProduto * 6.45;
            System.out.println("Valor do Produto " + " CODIGO 7623 - Leite | Total R$ " + totalProduto );

        } else {

            totalProduto = QuantProduto * 8.50;
            System.out.println("Valor do Produto " + " CODIGO 1000 - Macarrão | Total R$ " + totalProduto);
        }

        }

}

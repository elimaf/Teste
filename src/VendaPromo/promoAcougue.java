package VendaPromo;

import java.util.Scanner;

public class promoAcougue {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Valor para Tipo de Carne ");
        System.out.println("200 - Filé Migon  ");
        System.out.println("300 - Filé Alcatra ");
        System.out.println("400 - Filé Picanha ");
        System.out.println("500 - Filé Picanha Importada ");
        System.out.println("Digite o Tipo de Carne: ");
        String carneI = "200 - Filé Migon";
        String carneII = "300 - Filé Alcatra";
        String carneIII = "400 - Filé Picanha";
        String carneIV = "500 - Filé Picanha Importada";
        String carne=" ";
        int tipoCarne = entrada.nextInt();
        System.out.println("Digite a Quantidade de Carne (KG)");
        double quantidadeCarne = entrada.nextDouble();

        System.out.println("Digite o Tipo de Pagamento: ");
        System.out.println("1 - A Vista: ");
        System.out.println("2 - Parcelado: ");
        double valorParcelar = 0;

        int tipoPagamento = entrada.nextInt();

        double subtotal = 0;
        double desconto = 0;

        switch (tipoCarne) {

            case 200:

                if (quantidadeCarne <= 5) {
                    carne = carneI;
                    subtotal = quantidadeCarne * 34.90;

                } else {
                    carne = carneI;
                    subtotal = quantidadeCarne * 36.80;
                    valorParcelar = subtotal / 2;
                }
                break;
            case 300:
                if (quantidadeCarne <= 5) {
                    carne = carneII;
                    subtotal = quantidadeCarne * 35.90;

                } else {
                    carne = carneII;
                    subtotal = quantidadeCarne * 32.80;
                    valorParcelar = subtotal / 2;
                }
                break;
            case 400:
                if (quantidadeCarne <= 5) {
                    carne = carneIII;
                    subtotal = quantidadeCarne * 45.90;

                } else {
                    carne = carneIII;
                    subtotal = quantidadeCarne * 42.80;
                    valorParcelar = subtotal / 2;
                }
                break;

            case 500:
                if (quantidadeCarne <= 5) {
                    carne = carneIV;
                    subtotal = quantidadeCarne * 60.90;

                } else {
                    carne = carneIV;
                    subtotal = quantidadeCarne * 58.80;
                    valorParcelar = subtotal / 2;
                }
                break;

            default: {
                System.out.println("Digite um valor Válido ");

            }
        }
        
        if (tipoPagamento == 1) {

            desconto = subtotal * 0.05;
            double descontoTotal = subtotal - desconto;

            System.out.println("Tipo de Carne: " + carne);
            System.out.println("Quantidade de Carne: " + quantidadeCarne + " Kg");
            System.out.printf("Total a Pagar= R$ %.2f\n", subtotal, " reais");
            System.out.println("Pagamento A Vista");
            System.out.printf("Desconto em (-) R$ %.2f \n", desconto, " reais");
            System.out.printf("Total Pagar com Desconto 5% = R$ %.2f\n", descontoTotal, " reais");
        } else {
            System.out.println("Tipo de Carne: " + carne);
            System.out.println("Quantidade de Carne: " + quantidadeCarne + " Kg");
            System.out.println("Desconto em (-) R$ " + desconto + " reais");
            System.out.println("Total a Pagar= R$ " + subtotal + " reais");
            System.out.printf("1º Parcela R$ %.2f \n", valorParcelar, " reais");
            System.out.printf("2º Parcela R$ %.2f \n", valorParcelar, " reais");
        }
    }
}

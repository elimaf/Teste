package PDVRestaurante;

import java.util.Scanner;

public class PlayRestaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor do Kilo R$ 12,00 ");
        System.out.println("Digite o Peso da Comida");
        double peso = entrada.nextDouble();
        System.out.println("Escolher a Bebida ");
        System.out.println(" 1 - Cola-Cola 350 ml R$ 3,69 ");
        System.out.println(" 2 - Fanta Uva 350 ml R$ 5,00 ");
        System.out.println(" 3 - Fanta Laranja 500 ml R$ 3,50 ");
        System.out.println(" 4 - Água Mineral  200 ml R$ 2,00");
        int bebida = entrada.nextInt();
        double subtotal = 0;
        double valorPesoKg = 0.012;

        switch (bebida){
            case 1:
                subtotal = (valorPesoKg * (peso - 200)) + 3.69;
                System.out.println("Valor Total à Pagar R$ " + subtotal);
                break;
            case 2:
                subtotal = (valorPesoKg * (peso - 200)) + 5.00;
                System.out.println("Valor Total à Pagar R$ " + subtotal);
                break;
            case 3:
                subtotal = (valorPesoKg * (peso - 200)) + 3.50;
                System.out.println("Valor Total à Pagar R$ " + subtotal);
                break;
            case 4:
                subtotal = (valorPesoKg * (peso - 200)) + 2.00;
                System.out.println("Valor Total à Pagar R$ " + subtotal);
                break;
            default: {
                System.out.println("Erro ");
            }
        }
    }
}

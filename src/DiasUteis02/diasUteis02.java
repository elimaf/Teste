package DiasUteis02;

import java.util.Scanner;

public class diasUteis02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o Dia da Semana");
        System.out.println("Digite 1 - Segunda-feira");
        System.out.println("Digite 2 - Terça-feira");
        System.out.println("Digite 3 - Quarta-feira");
        System.out.println("Digite 4 - Quinta-feira");
        System.out.println("Digite 5 - Sexta-feira");
        System.out.println("Digite 6 - Sábado");
        System.out.println("Digite 7 - Domingo");
        System.out.println("Digite o Valor 0 (zero) para Sair do Programa");
        System.out.println("Escolha o Dia da Semana");
        int diaUtil = entrada.nextInt();

        do  {

            switch (diaUtil) {
                case 1: {
                    System.out.println("Hoje são Segunda-feira");
                    System.out.println("Dias Util da Semana!");
                    break;
                }
                case 3: {
                    System.out.println("Hoje são Terça-feira");
                    System.out.println("Dias Util da Semana!");
                    break;
                }
                case 4: {
                    System.out.println("Hoje são Quarta-feira");
                    System.out.println("Dias Util da Semana!");
                    break;
                }
                case 5: {
                    System.out.println("Hoje são Quinta-feira");
                    System.out.println("Dias Util da Semana!");
                    break;
                }
                case 6: {
                    System.out.println("Hoje são Sexta-feira");
                    System.out.println("Dias Util da Semana!");
                    break;
                }
                case 7: {
                    System.out.println("Hoje são Domingo");
                    System.out.println("Bom Fim de Semana!");
                    break;
                }

                default: {
                    System.out.println("Valor Informado Inválido!");
                }

            }

        }

        while (diaUtil == 0);
    }
}

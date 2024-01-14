package leituraNumeros;

import java.util.Scanner;

public class leitura20Numeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os 20 Números Solicitados ");
        int totalNumeroPositivo = 0;
        int totalNumeroNegativo = 0;
        double mediaPositivo = 0;
        double mediaNegativo = 0;
        int somaPositivo = 0;
        int somaNegativo = 0;
        int totalGeralNumero = 0;
        int mediaGeral= 0;
        int somaGeral =  0;

        for (int i=0; i < 20; i ++) {

            System.out.println("Digite o " + (i+1) + "º Valor");
            int numero = entrada.nextInt();

            if (numero >= 0) {
                 totalNumeroPositivo = totalNumeroPositivo + 1;
                 somaPositivo = somaPositivo + numero;
                 mediaPositivo = somaPositivo / totalNumeroPositivo;


            } else if (numero < 0) {
                totalNumeroNegativo = totalNumeroNegativo + 1;
                somaNegativo = somaNegativo + numero;
                mediaNegativo = somaNegativo / totalNumeroNegativo;

            } else {
                System.out.println("Valores Digitados não Reais");
            }
            totalGeralNumero = totalGeralNumero + 1;
            somaGeral = somaGeral + numero;
            mediaGeral = somaGeral/totalGeralNumero;

        }
        System.out.println("---------------------------------------------");
        System.out.println("Total de NUmero Positivos = " + totalNumeroPositivo);
        System.out.println("Média de NUmero Positivos = " + mediaPositivo);
        System.out.println("---------------------------------------------");
        System.out.println("Total de Numero Negativos = " + totalNumeroNegativo);
        System.out.println("Média de Numero Negativos = " + mediaNegativo);
        System.out.println("---------------------------------------------");
        System.out.println("Total de Numeros Digitados Positivos e Negativos ");
        System.out.println(totalGeralNumero);
        System.out.println("Valor Medio dos Valores Lidos = " + mediaGeral);
        System.out.println("---------------------------------------------");
    }

}



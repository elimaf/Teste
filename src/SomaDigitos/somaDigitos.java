package SomaDigitos;

import java.util.Scanner;

public class somaDigitos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Valor 100 - 999");
        System.out.println("Digite 1º Centena");
        String valor01 = entrada.next();
        System.out.println("Digite 2º Centena");
        String valor02 = entrada.next();
        System.out.println("Digite 3º Centena");
        String valor03 = entrada.next();
        String valor1 = valor01.substring(1,1);
        String valor2 = valor02.substring(1,1);
        String valor3 = valor03.substring(1,1);
        String somatoria01 = valor1 + valor2 + valor3;
        System.out.println("Somatoria das Centenas = " + somatoria01);

    }
}

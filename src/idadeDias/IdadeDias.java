package idadeDias;

import java.util.Scanner;

public class IdadeDias {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        double idade = teclado.nextDouble();

        double diasidade = idade * 365;
        System.out.println("Quantidades de Dias " + diasidade);

    }

}

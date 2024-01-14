package SexoFemininoMasculino;

import java.util.Scanner;

public class SexoFM {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 - Feminino e 2 - Masculino: ");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Sexo Feminino");
                break;
            case 2:
                System.out.println("Sexo Masculino");
                break;
            default:
                System.out.println("Sexo Inválido!");
                break;
        }
    }
}

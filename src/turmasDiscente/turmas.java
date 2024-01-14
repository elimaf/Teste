package turmasDiscente;

import java.util.Scanner;

public class turmas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 - Matutino | 2 - Vespertino | 3 - Noturno:");
        int numero = teclado.nextInt();

        switch (numero) {

            case 1:
                System.out.println("Bom  Dia!");
                break;

            case 2:
                System.out.println("Boa Tarde!");
                break;

            case 3:
                System.out.println("Boa Noite!");
                break;

            default:
                System.out.println("Digite o Valor Valido!");
                break;
        }

    }

}

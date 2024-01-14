package diasUteis;

import java.util.Scanner;

public class diasUteisTrabalho {

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
        int diaUtil = entrada.nextInt();

        if (diaUtil == 1 || diaUtil == 2 || diaUtil == 3 || diaUtil == 4 || diaUtil == 5 || diaUtil == 6  ) {

            System.out.println("Dia Útil de Trabalho");

        } else if (diaUtil == 7) {System.out.println("Fim de Semana");

        } else {System.out.println(" Escolha Inválida!");}
    }
}

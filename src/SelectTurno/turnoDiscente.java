package SelectTurno;

import java.util.Scanner;

public class turnoDiscente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Idade do Atleta: ");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        System.out.println("Digite o Turno do Discente");
        char turno = entrada.next().charAt(0);

        if (turno == 'M' || turno == 'm' ) {

            System.out.println("Bom Dia!");

        } else if (turno == 'V' || turno == 'v' ){

            System.out.println("Boa Tarde!");

        } else if (turno == 'N' || turno == 'n' ){

            System.out.println("Bom Noite!");

        } else {System.out.println("Escolhar Inválida");}

    }

}

package Matriz;

import java.util.Scanner;

public class Matriz {
    static final int LIN = 10;
    static final int COL = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat[][] = new int[LIN][COL];
        int dp = 0;
        int soma = 0;

        //Leitura dos valores

        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.println("Informe os Valores Númericos");
                mat[i][j] = input.nextInt();

            }
        }

        //Demostração dos Dados informados

        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.println("[" + mat[i][j] + "]");

            }
            
            System.out.println("\n");
        }

        //Soma Diagonal Principal

        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                if (i == j) {
                    dp = dp + mat[i][j];
                }

                System.out.println("\n");
            }
        }
    }

}

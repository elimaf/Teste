package NumerosMatriz;

import java.util.Random;

public class NumberMatrizTeste {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[10][10];

        //colocando elementos aleatoriamente dentro da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }

        //imprimindo os elementos da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

package numFibonacci;

import java.util.Scanner;

public class Fibonacci {
    static long numFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return numFibonacci(n - 1) + numFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite o Numero para formaçaõ Fibonacci");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero == 0 || numero > 0) {
            for (int i = 0; i < numero; i++) {
                System.out.print("(" + (i + 1) + "):" + Fibonacci.numFibonacci(i) + "\n");
            }
        } else {

            System.out.println("Não é Possível Calcular Fibonacci!!!");
        }
    }
}

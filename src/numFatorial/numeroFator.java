package numFatorial;

import java.util.Scanner;

public class numeroFator {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digit o Número para Calcular o Fatorial");
        int numero = entrada.nextInt();
        int fator = 1;

        for (int i=1; i < numero; i ++){
                fator = fator * i;
        } System.out.println("Fatorial do " + numero + "! è " + fator);

        }
}

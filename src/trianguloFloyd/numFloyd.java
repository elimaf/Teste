package trianguloFloyd;

import java.util.Scanner;

public class numFloyd {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 1;
        System.out.println("Digite o Valor do Triangulo de Floyd");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + cont);
                cont++;
            }
            System.out.println();
        }

    }

}

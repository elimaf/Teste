package equa2Grau;

import java.util.Scanner;

public class equacao2Grau {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Valor de A ");
        double a = entrada.nextDouble();

        if (a != 0) {
            System.out.println("Digite o Valor de B ");
            double b = entrada.nextDouble();
            System.out.println("Digite o Valor de C ");
            double c = entrada.nextDouble();

            double delta = (Math.pow(b, 2)) - 4 * (a) * (c);

            if (delta < 0) {

                System.out.println("Programa Encerrado! Delta Negativo: " + delta);

            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.printf("Delta igual a zero. Somente uma raiz: %.2f \n", raiz);

            } else {

                double raiz1 = (-b + Math.sqrt(delta))/(2*a);
                double raiz2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Delta = " + delta);
                System.out.printf("Raiz Reais X1 = %.2f \n", raiz1);
                System.out.printf("Raiz Reais X2 = %.2f \n" , raiz2);
            }

        } else {System.out.println("Não Ha Equação de 2º Grau!");}
    }
}

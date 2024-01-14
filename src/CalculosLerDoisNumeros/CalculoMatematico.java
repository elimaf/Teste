package CalculosLerDoisNumeros;

import java.util.Scanner;

public class CalculoMatematico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Número 1: ");
        double num1 = entrada.nextInt();
        System.out.println("Número 2: ");
        double num2 = entrada.nextInt();
        System.out.println("Número 3: ");
        double num3 = entrada.nextDouble();

        //Letra A o produto do dobro do primeiro com metade do segundo :
        //(2 * num1) * (num2/2)

        double result1 = (2 * num1) * (num2 / 2);
        System.out.println("Produto do dobro do primeiro com metade do segundo");
        System.out.println("Letra A: " + result1);

        //Letra B
        //(3*num1) + num3
        double result2 = (3 * num1) + num3;
        System.out.println("Soma do triplo do primeiro com o terceiro");
        System.out.println("Letra B: " + result2);

        //Letra C
        double result3 = Math.pow(num3, 3);
        System.out.println("Terceiro elevado ao cubo");
        System.out.println("Letra C: " + result3);

    }

}

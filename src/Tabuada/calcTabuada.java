package Tabuada;

import java.util.Scanner;

public class calcTabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informar um número: ");
        double numero = entrada.nextDouble();
        System.out.println("Digite o Operador +  -  *  / ");
        char operador = entrada.next().charAt(0);
        if (operador == '+') {
                for (int i = 1; i <= 10; i++) {
                    double resultado = i + numero;
                    System.out.println(numero + " + " + i + " = " + resultado);
                }
            } else if (operador == '-') {
                for (int i = 1; i <= 10; i++) {
                    double resultado = i - numero;
                    System.out.println(numero + " - " + i + " = " + resultado);
                }
            } else if (operador == '*') {
                for (int i = 1; i <= 10; i++) {
                    double resultado = i * numero;
                    System.out.println(numero + " X " + i + " = " + resultado);
                }
            } else if (operador == '/') {
                for (int i = 1; i <= 10; i++) {
                    double resultado = i / numero;
                    System.out.println(i + " / " + numero + " = " + resultado);
                }
            } else {
                System.out.println("Operadror Digitado Inválido!!!! ");
        }
    }
}

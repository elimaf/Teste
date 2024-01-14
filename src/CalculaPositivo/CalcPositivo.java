/*
14. Faça um programa que leia um número e, caso ele seja positivo, calcule e
mostre:
● O número digitado ao quadrado
● A raiz quadrada do número digitado
*/

package CalculaPositivo;

import java.util.Scanner;

public class CalcPositivo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = entrada.nextDouble();

        if (numero > 0){
            System.out.println("Número ao quadrado: " + Math.pow(numero,2));
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
            System.out.println("Raiz Cubica " + Math.pow(numero, 3));
        } else {
                System.out.println("Número negativo ou zero");
        }
    }
}

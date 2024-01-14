package CalculosAritmeticos;
import java.util.Scanner;

public class Calculadora {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite n1: ");
            double n1 = entrada.nextDouble();
            System.out.println("Digite n2: ");
            double n2 = entrada.nextDouble();
            double soma = n1 + n2;
            double sub = n1-n2;
            double mult = n1*n2;
            double divi = n1/n2;
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + sub);
            System.out.println("Multiplicação: " + mult);
            System.out.println("Divisão: " + divi);

    }





}

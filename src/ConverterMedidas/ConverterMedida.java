package ConverterMedidas;

import java.util.Scanner;

public class ConverterMedida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Medida em metros: ");
        double metro = entrada.nextDouble();
        double cm = metro * 100;
        System.out.println("Medida em centímetros: " + cm + " cm");

    }
}

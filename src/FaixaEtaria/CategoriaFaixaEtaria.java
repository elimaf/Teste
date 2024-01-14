package FaixaEtaria;

import java.util.Scanner;

public class CategoriaFaixaEtaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Idade do Atleta: ");
        int idade = entrada.nextInt();
        System.out.println("Digite o Sexo do Atleta (M/F)");
        char sexo = entrada.next().charAt(0);

        if((sexo =='F'||sexo =='f') && (idade > 5 && idade <= 10)) {

            System.out.println("Cartegoria do Atleta com idade de " + idade + " anos " + " Feminino- INFANTIL");

        } else if ((sexo =='F'||sexo =='f') && (idade > 11 && idade <= 17)) {

            System.out.println("Cartegoria do Atleta com idade de " + idade + " anos " + " Feminino- JUVENIL");

        } else if ((sexo =='F'||sexo =='f') && (idade >= 18)) {

            System.out.println("Cartegoria do Atleta com idade de " + idade + " anos " + " Feminino- ADULTO");

        } else if ((sexo =='M'||sexo =='m') && (idade > 5 && idade <= 10)) {

            System.out.println("Cartegoria do Atleta com idade de " + idade + " anos " + " Masculino - INFANTIL");

        } else if ((sexo =='M'||sexo =='m') && ( idade > 11 && idade <= 17)) {

            System.out.println("Cartegoria do Atleta com idade de " + idade + " anos " + " Masculino - JUVENIL");

        } else if ((sexo =='M'|| sexo =='m') && (idade >= 18)) {

            System.out.println("Cartegoria do Atleta com idade de " + idade + " anos " + " Masculino - ADULTO");

        } else {

            System.out.println("Valor Digitado Invalido!");

        }

    }

}

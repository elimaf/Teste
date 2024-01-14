package nuemro20_50;

import java.util.Scanner;

public class numeros20a50 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite Valores entre 1 e 50 ");
        int quantNum= 0;
        for (int i = 0; i < 20; i++){
            System.out.println("Digite o " + (i+1) + "º Valor dos 50 Números");
            int valor = entrada.nextInt();
            if (valor > 20 && valor < 50){
                quantNum = quantNum + 1;
            }

        }
       System.out.println("Total de Numero entre 10 e 20 = " + quantNum);
    }

}

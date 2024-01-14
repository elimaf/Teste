package CasoWhileFlagBreak;

import java.util.Scanner;

public class somaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0; int cont = 0; int num = 0; int maior = 0; int menor = 0;

        while (num != 999) {
            System.out.println("Digite um Valor (999 para Sair do Programa");
            num = entrada.nextInt();
            if (num == 999){ break;
            } else if (num > menor){maior = num;
            } else {menor = num;} cont += 1; soma += num;
        }
        System.out.println("A soma dos " + cont + " valore " + soma + " ! ");
        System.out.println("Maior Número Digitado " + maior);
        System.out.println("Menor Número Digitado " + menor);
    }
}


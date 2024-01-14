package numImPar;

import java.util.Scanner;

public class calcNumImPar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Quantidade dos Numeros para Inserir");
        double quantidade = entrada.nextInt();
        double quantidadeImpar =0;
        double quantidadePar = 0;
        double somaTotal = 0 ;

        for (int i=0; i < quantidade; i++){
            System.out.println("Digite o Número");
            double numero = entrada.nextInt();
            if (numero % 2 != 0){
                quantidadeImpar = quantidadeImpar + 1;
                somaTotal = somaTotal + numero;
            } else {
                quantidadePar = quantidadePar + 1;
                somaTotal = somaTotal + numero;
            }
        }
        System.out.println("Quantidade de Números Pares = " + quantidadePar);
        System.out.println("Quantidade de Números Impares = " + quantidadeImpar);
        System.out.println("Soma dos Numeros Digitados = " + somaTotal);
        double media = somaTotal/quantidade;
        System.out.printf("Média dos Numeros Digitados = %.2f %n", (media));
    }
}
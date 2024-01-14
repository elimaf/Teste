package avaliarVetor;
import java.util.Scanner;
public class VetorAvaliar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas[] = new double[10];
        String nome[] = new String[10];
        double soma = 0;
        double media = 0;
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o Nome do Discente");
            nome[i] = entrada.nextLine();
            System.out.println("Digite a 1º Nota do Discente");
            notas[i] = entrada.nextDouble();
            System.out.println("Digite a 2º Nota do Discente");
            notas[i] = entrada.nextDouble();
            soma = soma + notas[i];
        }
            media = soma/2;
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome dos Disentes" + nome[i]);
            System.out.println("Notas dos Discentes" + notas[i] );
            System.out.println("Media do Discentes =" + media);
        }

    }
}

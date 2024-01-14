package FrequenciaEscolar;

import java.util.Scanner;

public class FrequenciaAprovado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade de aulas ministradas na disciplina: ");
        double ministradas = entrada.nextDouble();

        System.out.println("Quantidade de aulas assistidas pelo aluno: ");
        double assistidas = entrada.nextDouble();
        System.out.println("Nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = entrada.nextDouble();

        double frequencia = assistidas / ministradas * 100;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
        System.out.println("Frequência: " + frequencia + " %");

        if (media >= 6 && frequencia >= 75) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }

    }
}

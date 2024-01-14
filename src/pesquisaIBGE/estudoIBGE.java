package pesquisaIBGE;

import java.util.Scanner;

public class estudoIBGE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite de 10 Informações dos Cidadâs da Pesquisa");
        System.out.println("Digite o Código do Cidadã");
        int codigoCidadao = entrada.nextInt();
        double quantFeminino = 0;
        double quantMasculino = 0;
        int maiorIdade = 0;
        int menorIdade = 1;
        int quantEnsinoFundamentel = 0;
        int quantEnsinoMedio = 0;
        int quantEnsinoSuperior = 0;

        while (codigoCidadao != 0) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Digite a Idade do Cidadã");
                int idade = entrada.nextInt();
                System.out.println("Digite o Grau de Instrução do Cidadã");
                int escolharNivelEstudo = entrada.nextInt();
                System.out.println("Digite o Sexo do Cidadã");
                char sexo = entrada.next().charAt(0);
                if (sexo == 'F' || sexo == 'f') {
                    quantFeminino = quantFeminino + 1;
                }
                if (sexo == 'M' || sexo == 'm') {
                    quantMasculino = quantMasculino + 1;
                }
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }

                switch (escolharNivelEstudo) {

                    case 1:
                        quantEnsinoFundamentel++;
                        break;
                    case 2:
                        quantEnsinoMedio++;
                        break;
                    case 3:
                        quantEnsinoSuperior++;
                        break;
                    default: {
                        System.out.println("Sem Nivel Educacional de Ensino!!!");
                    }
                    System.out.println("Digite o Código do Cidadã");
                    codigoCidadao = entrada.nextInt();
                }
            }
            double totalPopulacional = quantFeminino + quantMasculino;
            double mediaFeminina = (quantFeminino / totalPopulacional) * 100;
            double mediaMasculino = (quantMasculino / totalPopulacional) * 100;
            System.out.println("Quantidade Geral da População Pesquisa " + totalPopulacional);
            System.out.println("Quantidade de Cidadã Sexo Feminino " + quantFeminino);
            System.out.println("Percentual da População Feminina " + mediaFeminina + " % ");
            System.out.println("Quantidade de Cidadã Sexo Masculino " + quantMasculino);
            System.out.println("Percentual da População Feminina " + mediaMasculino + " % ");
            System.out.println("Maior Idade da Pesquisa " + maiorIdade + " anos ");
            System.out.println("Menor Idade da Pesquisa " + menorIdade + " anos ");
            System.out.println("Quantidade de Cidadãs Ensino Fundamental= " + quantEnsinoFundamentel);
            System.out.println("Quantidade de Cidadãs Ensino Médio= " + quantEnsinoMedio);
            System.out.println("Quantidade de Cidadãs Ensino Superior= " + quantEnsinoSuperior);
        }
    }
}
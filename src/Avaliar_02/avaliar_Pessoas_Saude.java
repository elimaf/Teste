package Avaliar_02;

import java.util.Scanner;

public class avaliar_Pessoas_Saude {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a Quantidade de Cidadãs");
        int quantCidada = entrada.nextInt();
        double altura = 0;
        double mediaAlturaHomens = 0;   double mediaAlturaMulheres = 0;
        double somaHomensAltura = 0;    double somaMulheresAltura = 0;
        double maiorIdade = 0;          double menorIdade = 0;
        double mediaIdadeM = 0;         double mediaidadeH = 0;
        double contM = 0;               double contH = 0;
        double somaM = 0;               double somaH = 0;
        // Laço de repetição da quantidade da pesquisa populacional na saúde
        for (int i = 0; i < quantCidada; i++) {
            System.out.println("Digite a Idade do Paciente");
            double idade = entrada.nextInt();
            System.out.println("Digite o Peso do Paciente");
            double peso = entrada.nextDouble();
            System.out.println("Digite o Sexo do Paciente");
            char sexo = entrada.next().charAt(0);
            System.out.println("Digite a Altura do Paciente");
            altura = entrada.nextDouble();
            // Calculo da Maior Idade e Menor Idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            } if (idade < menorIdade) {
                menorIdade = idade;
            }
            // Condição para Caluclo da Média da Altura e idade das Mulheres
            if (sexo == 'F' || sexo == 'f') {
                // Calculo da Somatoria Altura das Mulheres
                somaMulheresAltura = somaMulheresAltura + altura;
                // Calculo da Média da Idade das Nulheres
                somaM += idade;
                contM++;
            }
            // Condição para Caluclo da Média da Altura e idade dos Homens
            if (sexo == 'M' || sexo == 'm') {
                // Calculo da Somatoria Altura dos Homens
                somaHomensAltura = somaHomensAltura + altura;
                // Calculo da Média da Idade dos Homens
                somaH += idade;
                contH++;
            }
        }
            mediaIdadeM = somaM/contM;
            mediaidadeH = somaH/contH;
            mediaAlturaMulheres = somaMulheresAltura / contM;
            mediaAlturaHomens = somaHomensAltura / contM;
            double mediaGeralIdade = (somaH + somaM) / quantCidada;
            double mediaGeralAltura = (somaHomensAltura + somaMulheresAltura) / quantCidada;
            // Exibição da Media das Alturas Mulheres e Homens
            System.out.println("----------------------------------------------------");
            System.out.println("Total das Idade das Mulheres = " + somaM);
            System.out.println("Total das Idade dos Homens = " + somaH);
            double geralIdadePopular = somaM + somaH;
            // Exibição da Media das Alturas Mulheres e Homens
            System.out.println("----------------------------------------------------");
            System.out.println("Media da idade das Mulheres = " + mediaIdadeM);
            System.out.println("Media da idade dos Homens   = " + mediaidadeH);
            System.out.println("Média Geral Idade da População = " + mediaGeralIdade);
            System.out.println("----------------------------------------------------");
            System.out.println("Total das Altura das Mulheres = " + somaMulheresAltura);
            System.out.println("Total das Altura das Homens = " + somaHomensAltura);
            double geralAlturaPopular = somaHomensAltura + somaMulheresAltura;
            System.out.println("Total Geral da Altura da População = " + geralAlturaPopular);
            // Exibição da Media das Alturas Mulheres e Homens
            System.out.println("----------------------------------------------------");
            System.out.println("Média da Altura dos Mulheres = " + mediaAlturaMulheres);
            System.out.println("Média da Altura dos Homens = " + mediaAlturaHomens);
            System.out.println("Média Geral da Altura da População = " + mediaGeralAltura);
            // Exibição da Maior e Menor Idade
            System.out.println("----------------------------------------------------");
            System.out.println("A Maior Idade = " + maiorIdade + " anos ");
            System.out.println("A Menor Idade = " + menorIdade + " anos ");
        }
}


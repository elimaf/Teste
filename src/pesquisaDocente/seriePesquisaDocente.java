package pesquisaDocente;

import java.util.Scanner;

public class seriePesquisaDocente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Série: primeira-1, segunda-2, terceira-3 ou quarta-4): ");
        int serie = entrada.nextInt();
        int contTerceira =0;
        int maiorLivro = 0;
        double contRedacao0=0;
        int contPessoas=0;
        while (serie > 0){
            System.out.println("Quantos livros lê por mês? ");
            int qntLivros = entrada.nextInt();
            System.out.println("Gosta de fazer redação (Sim-1 ou Não-0)? ");
            int redacao = entrada.nextInt();

            //A quantidade de alunos que está na terceira série;
            if (serie == 3){
                contTerceira++;
            }

            //A maior quantidade de livros lidos por um aluno que está na quarta série;
            if (serie == 4 && qntLivros > maiorLivro){
                maiorLivro = qntLivros;
            }

            //A porcentagem de alunos que não gostam de fazer redação e que estão na terceira série.
            if (serie==3 && redacao==0){
                contRedacao0++;
            }

            contPessoas++;

            System.out.println("Série: primeira-1, segunda-2, terceira-3 ou quarta-4): ");
            serie = entrada.nextInt();
        }

        System.out.println("A quantidade de alunos que está na terceira série: " + contTerceira);
        System.out.println("A maior quantidade de livros lidos por um aluno que está na quarta série: " + maiorLivro);
        double porcentagem=0;
        if (contPessoas!=0){
            porcentagem = contRedacao0/contPessoas * 100;
        }
        System.out.println("A porcentagem de alunos que não gostam de fazer redação e que estão na terceira série: " + porcentagem + "%");
    }
 }


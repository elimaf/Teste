package conceitoDiscente;

import java.util.Scanner;

public class ConceitoAluno {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o Conceito do Discente conforme a Tabela ");
            System.out.println(" Conceito A - Excelente ");
            System.out.println(" Conceito B - Ótimo ");
            System.out.println(" Conceito C - Bom ");
            System.out.println(" Conceito D - Regular ");
            System.out.println(" Conceito E - Ruim ");
            System.out.println("Digite o Conceito do Discente: ");
            String conceitoDiscente = entrada.next().toUpperCase();

            switch (conceitoDiscente) {

                case "A":
                    System.out.println("Discente Excelente");
                    break;

                case "B":
                    System.out.println("Discente òtimo");
                    break;

                case "C":
                    System.out.println("Discente Bom");
                    break;

                case "D":
                    System.out.println("Discente Regular");
                    break;

                case "E":
                    System.out.println("Discente Ruim");
                    break;
                default: {
                    System.out.println("Conceito Inexistente! Tente Novamente");
                }
            }
        }
}
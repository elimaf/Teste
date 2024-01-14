package AumentoSalarial03;

import java.util.Scanner;

public class Quetion03_SalarioAumento {

    public static void main(String[] args) {
        int tempo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolher entre as Profissões: ");
        System.out.println("Digite 1 -  Analista");
        System.out.println("Digite 2- Gerente");
        int cargo = entrada.nextInt();
        System.out.println("Digite o Tempo de Empresa");
        tempo = entrada.nextInt();
        System.out.println("Digite o Salario do Funcionário");
        double salario = entrada.nextDouble();
        double salarioReajuste =0;

        if ((cargo == 1) && (tempo < 5)) {
            System.out.println("Cargo do Funcionário: " + cargo + " - Analista ");
            salarioReajuste = salario + salario * 0.3;
            System.out.println("Salario com aumento de 30%: R$ " + salarioReajuste + " reais");


        } else if ((cargo == 1) && (tempo > 5)) {
            System.out.println("Cargo do Funcionário: " + cargo + " - Analista ");
            salarioReajuste = salario + salario * 0.4;
            System.out.println("Salario com aumento de 40%: R$ " + salarioReajuste  + " reais");

        } else if ((cargo == 2) && (tempo < 5)){

            System.out.println("Cargo do Funcionário: " + cargo + " - Gerente ");
            salarioReajuste = salario + salario * 0.1;
            System.out.println("Salario com aumento de 10%: R$ " + salarioReajuste + " reais");

        } else if ((cargo == 2) && (tempo > 5)){

            System.out.println("Cargo do Funcionário: " + cargo + " - Gerente ");
            salarioReajuste = salario + salario * 0.2;
            System.out.println("Salario com aumento de 20%: R$ " + salarioReajuste + " reais");

        } else {
            System.out.println("Valor Digitado Inválido");
        }
    }

}

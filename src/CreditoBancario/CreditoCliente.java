package CreditoBancario;

import java.util.Scanner;

public class CreditoCliente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Codigo do Cliente: ");
        double codCliente = entrada.nextDouble();

        System.out.println("Digite o Valor da Renda do Cliente: ");
        double ValorRenda = entrada.nextDouble();

        double creditoCliente;
        double saldoCliente;

        if ( ValorRenda >= 0 && 200 <= ValorRenda) {

            System.out.println ("Cliente " + codCliente + "Zero Credito Emprestimo para" + ValorRenda);

        } else if (201 >= ValorRenda && 400 <= ValorRenda)  {

            creditoCliente = ValorRenda * 0.2;
            saldoCliente = creditoCliente + ValorRenda;
            System.out.println (codCliente + " Recebera o valor de R$" + saldoCliente);

        } else if (401 >= ValorRenda && 600 <= ValorRenda) {

            creditoCliente = ValorRenda * 0.3;
            saldoCliente = creditoCliente + ValorRenda;
            System.out.println (codCliente + " Recebera o valor de R$" + saldoCliente);

        } else {

            creditoCliente = ValorRenda * 0.4;
            saldoCliente = creditoCliente + ValorRenda;
            System.out.println (codCliente + " Recebera o valor de R$" + creditoCliente);
        }
    }

}

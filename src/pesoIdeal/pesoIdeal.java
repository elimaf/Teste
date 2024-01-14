package pesoIdeal;

import java.util.Scanner;

public class pesoIdeal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Sexo do Cliente: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("Digite a Altura do Cliente");
        double alturaCliente = entrada.nextDouble();
        double pesoIdeal = 0;

        if (sexo == 'M' || sexo == 'm') {

            pesoIdeal = 72.7 * alturaCliente - 58;
            System.out.println("Cliente com Pesso Ideal Masculino de " + pesoIdeal);

        } else if (sexo == 'F' || sexo == 'f'){

            pesoIdeal = 62.1 * alturaCliente - 44.7;
            System.out.println("Cliente com Pesso Ideal Feminino de " + pesoIdeal);

        } else { System.out.println("Valor Digitado Incorreto, Favor Digitar os Valores Corretamente");}
    }
}
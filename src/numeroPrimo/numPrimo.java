package numeroPrimo;

import java.util.Scanner;

public class numPrimo {

    public static void main(String[] args) {
        Scanner entrada = new  Scanner (System.in);
        System.out.println("Digite o Numero para Verificar Primo ou Não Primo");
        int num = entrada.nextInt();
        boolean achou = false;
        int cont = 1;

        while (cont<= num ){
            if (num==1){
                achou = false;
                System.out.println(num + " Não é primo.");
                break;
            }

        if (num != 1 && cont != num && num%cont == 0) {
            achou = false;
            System.out.println("Numero Digitado não é Primo!");

        break;

        } else {
            achou = true;
            num++;
        } if (achou) {

                System.out.println(num+ " é um número primo!");
        }

        }

    }

}

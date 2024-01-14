package somaFracao;

import java.util.Scanner;

public class somatoriaFracao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int somaNumerador = 1;
        int valorDenominador = 1;
        for (int i=0; i <= 50; i++){
            somaNumerador = somaNumerador + 2;
            valorDenominador ++;
            System.out.println(somaNumerador+":"+ i);
        }

    }
}

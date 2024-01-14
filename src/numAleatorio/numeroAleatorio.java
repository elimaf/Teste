package numAleatorio;

import java.util.Random;

public class numeroAleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int contPares = 0;
        int contImpares = 0;
        for (int i = 0; i < 100; i++) {
            int numero = aleatorio.nextInt(50);
            if (numero % 2 == 0) {
                contPares ++;
            } else {
                contImpares ++;
            }
        }
        System.out.println("Numeros pares= " + contPares);
        System.out.println("Total de Impares= " + contImpares);
    }
}

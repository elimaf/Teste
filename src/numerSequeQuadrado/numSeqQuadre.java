package numerSequeQuadrado;

import java.util.Scanner;

public class numSeqQuadre {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Numero para o Calculo N-ésimo Termo");
        int numero = entrada.nextInt();
        int quadrado;
        for (int i=1; i < numero +1; i ++){
            quadrado = i*i;
            System.out.println(i +"°" + " N-ésimo Termo do Numero " + i + " è " + quadrado);
        }

    }






}

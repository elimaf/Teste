package pesquisaPopulacional;

import java.util.Scanner;

public class pesquisaAlturaPopular {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os 10 Valores");
        System.out.println("Digite o Ssxo do(a) Pequisado(a)");
        char sexo = entrada.next().charAt(0);
        System.out.println("Digte a Altura  do(a) Pequisado(a) ");
        double altuta = entrada.nextDouble();
        double alturaHomem = 0;
        double alturaMulher = 0;
        double totalGeralAltura = 0;
        double mediaGeralAltura = 0;
        double MaiorAlturaHomem = 0;

        if (sexo == 'M' || sexo == 'm'){
            
            if ( alturaHomem > MaiorAlturaHomem) {
                MaiorAlturaHomem = alturaHomem;
            }

        } else if (sexo == 'F' || sexo == 'f'){



        } else {
            System.out.println("Opção Digitada Inválida!");
        }
        System.out.println("Valor Maior Altura Homem");
        System.out.println("Valor Maior Altura Homem" +  MaiorAlturaHomem);
    }

}

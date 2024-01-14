package numeroString;

import java.util.Scanner;

public class numeroCalcString{

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println(" Calculadora de 4 Operações");
            System.out.println("Digite 1º Número para o Calculo");
            double numero1 = entrada.nextDouble();
            System.out.println("Digite 2º NUmero para o Calculo");
            double numero2 = entrada.nextDouble();
            System.out.println("Digite o Operador +  -  *  / ");
            char operacao = entrada.next().charAt(0);
            double calculo = 0;
            switch (operacao) {
                case '+':
                    calculo = numero1 + numero2;
                    System.out.println("Resulado [" + numero1 + "] + [" + numero2 + "] = " + calculo);
                break;

                case '-':

                    calculo = numero1 - numero2;
                    System.out.println("Resulado [" + numero1 + "] - [" + numero2 + "] = " + calculo);
                    break;

                case '*':
                    calculo = numero1 * numero2;
                    System.out.println("Resulado [" + numero1 + "] * [" + numero2 + "] = " + calculo);

                    break;

                case '/':

                    calculo = numero1 / numero2;
                    System.out.println("Resultado [" + numero1 +"] / [" + numero2 + "] = " + calculo);
                break;
                default:{
                    System.out.println("Operação Inválida!");
                }

            }
        }
}




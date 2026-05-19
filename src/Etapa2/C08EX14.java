package Etapa2;

//FUNÇÃO: Imprime uma matriz com o simbolo que o usuario fornecer
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args) {
        String simbolo;
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 20: ");
        numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Informe um simbolo: ");
        simbolo = teclado.nextLine();

            //Controla as linhas
            for (int i = 0; i < numero; i++) {
                //Controla as colunas
                for (int j = 0; j < numero; j++) {
                    System.out.print(simbolo + " ");
                }
                //Imprime um espaço entre eles
                System.out.println();
            }
            teclado.close();
        }
    }

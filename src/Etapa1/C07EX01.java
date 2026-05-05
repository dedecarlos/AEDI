package Etapa1;

import java.util.Scanner;

//FUNCAO: Calcula e imprime o premio ganho por um apostador de acordo com a quantidade de acertos
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C07EX01 {
    public static void main(String[] args) {
        int acertos;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o numero de acertos: ");
        acertos = teclado.nextInt();
        teclado.close();

        switch (acertos) {
            case 1, 2, 3, 4, 5 -> System.out.println("Nao houve premio ganho");
            case 6, 7, 8, 9, 10 -> System.out.println("Apostador ganhou outro cartao de aposta");
            case 11 -> System.out.println("Apostador ganhou R$100,00");
            case 12 -> System.out.println("Apostador ganhou R$1000,00");
            case 13 ->  System.out.println("Apostador ganhou R$50000,00");
        }
    }
}

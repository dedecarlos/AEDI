package Etapa2;

//FUNCAO: Imprime uma sequencia com a quantidade que o usuario informar
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX12 {
    public static void main(String[] args) {
        int termos;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 9: ");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            //Imprime a parte crescente
            for (int aux2 = 1; aux2 <= aux; aux2++)
                System.out.print(aux2);
            //Imprime a parte decrescente
            for (int aux2 = aux; aux2 >= 1; aux2--)
                System.out.print(aux2);
            System.out.println();
        }
    }
}
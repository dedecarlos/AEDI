package Etapa2;

//FUNCAO: Imprime uma sequencia com a quantidade que o usuario informar
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX11 {
    public static void main(String[] args) {
        int termos;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 9: ");
        termos = teclado.nextInt();

        for (int aux2 = 1; aux2 <= termos; aux2++) {
            for (int aux = 1; aux <= aux2; aux++)
                System.out.print(aux2);
            System.out.println();
        }
    }
}


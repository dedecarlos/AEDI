package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
        double num, denom, serie = 0;
        int termo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        termo = teclado.nextInt();

        for (int aux = 1; aux <= termo; aux++) {
            num = (aux * 2 - 2) + (aux * 3);
            denom = aux * 6 + 1;
            serie += num / denom;
        }
        serie = 5 * serie;
        System.out.println(serie);
        teclado.close();
    }
}

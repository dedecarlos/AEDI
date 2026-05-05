package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C09EX04 {
    public static void main(String[] args) {
        double num, denom, serie = 0;
        int termo;

        Scanner teclado =  new Scanner(System.in);
        System.out.println("Digite um numero: ");
        termo = teclado.nextInt();

        for (int aux = 1; aux <= termo; aux++) {
            num = (aux * 4 - 3) * (aux * 4 - 2);
            denom = (aux * 4 - 1) * (aux * 4);
            serie += num / denom;
        }
        serie = Math.sqrt(serie);
        System.out.println(serie);
        teclado.close();
    }
}

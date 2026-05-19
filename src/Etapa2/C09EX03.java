package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args) {
        double num, denom, serie = 0;
        int termo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        termo = teclado.nextInt();

        for (int aux = 1; aux <= termo; aux++) {
            num = 1 + Math.sqrt(aux * 4);
            denom = aux * 3;
            serie += num /  denom;
        }
        System.out.println(serie);
        teclado.close();
    }
}

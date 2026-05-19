package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        double num, denom, serie = 0;
        int termo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        termo = teclado.nextInt();

        for (int aux = 1; aux <= termo; aux++) {
            num = Math.pow(3, aux + 1);
            denom = (9 + aux) * Math.sqrt(Math.pow(aux, 4));
            serie += num / denom;
        }
        serie = 100 - (Math.pow(serie, 3));
        System.out.println(serie);
        teclado.close();
    }
}

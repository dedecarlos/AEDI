package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX13 {
    public static void main(String[] args){
        double num, denom, serie = 0, cont = 1, termos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos termos terá a série? ");
        termos = teclado.nextDouble();

        do  {
            num = cont * Math.pow((cont * 9 + 1), cont * 2);
            denom = Math.pow(7, cont - 1);
            serie += num / denom;
            cont++;
        } while (cont <= termos);
        serie = 71 + Math.cbrt(serie);
        System.out.println(serie);
        teclado.close();
    }
}

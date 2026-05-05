package Etapa2;

//FUNCAO: Calcula a funcao f(x) de numeros impares de 1 ate o numero informado pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX01 {
    static void main() {
        int termos,  cont = 0, soma = 0;
        double media, fx = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            if (aux % 2 == 1) {
                fx = Math.pow(aux, 2) + (4 * aux - 2) / 5.0;
                soma += fx;
                cont++;
                System.out.println(fx);
            }
        }
        media = (float) soma / cont;
        System.out.println(media);
        teclado.close();
    }
}

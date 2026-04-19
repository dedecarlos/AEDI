package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args) {
        int X, N;
        double num, denom, serie = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X ");
        X = teclado.nextInt();
        System.out.println("Informe o valor de N ");
        N = teclado.nextInt();

        for (int aux = 1; aux <= N; aux++) {
            num = Math.pow(X, aux);
            denom = aux;
            serie += num /  denom;
        }
        serie = Math.log(X) + serie;
        System.out.printf("A soma é %1.0f " ,serie);
        teclado.close();
    }
}

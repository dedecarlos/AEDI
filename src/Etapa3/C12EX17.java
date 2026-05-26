package Etapa3;

//FUNÇÃO: Pede ao usuário 10 numeros inteiros e calcula a media dos numeros pares
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10], soma = 0, cont = 0, media;

        for (int aux = 0; aux < numeros.length; aux++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numeros.length; aux++) {
            if (numeros[aux] % 2 == 0) {
                System.out.print(numeros[aux] + " ");
                soma += numeros[aux];
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("\nA media dos numeros pares é: " + media);
        teclado.close();
    }
}
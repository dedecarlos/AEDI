package Etapa3;

//FUNÇAO: Imprime somente os numeros que sao maiores que a ultima entrada de um vetor e calcula a media dos numeros impressos
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10], soma = 0, cont = 0;
        double media;

        for (int aux = 0; aux < numeros.length; aux++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[aux] = teclado.nextInt();
        }
        for  (int aux = 0; aux < numeros.length; aux++) {
            if (numeros[aux] > numeros[9]) {
                System.out.print(numeros[aux] + " ");
                soma += numeros[aux];
                cont ++;
            }
        }
        media = (float) soma / cont;
        System.out.println("\n"+media);
        teclado.close();
    }
}

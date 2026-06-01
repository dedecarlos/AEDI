package Etapa3;

//FUNÇAO: Imprime os valores de um vetor que estao nos indices impares primeiro em seguida os dos pares
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[20];

        for (int aux = 0; aux < vetor.length; aux++) {
            System.out.println("Digite um numero: ");
            vetor[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < vetor.length; aux++) {
            if (aux % 2 == 0) {
                System.out.print(vetor[aux] + " ");
            }
        }
        for  (int aux = 0; aux < vetor.length; aux++) {
            if (aux % 2 != 0) {
                System.out.print(vetor[aux] + " ");
            }
        }
        teclado.close();
    }
}

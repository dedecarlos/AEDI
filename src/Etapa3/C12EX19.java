package Etapa3;

//FUNÇAO: Copia o conteudo de um vetor de forma decrescente em um segundo vetor
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        for (int aux = 0; aux < vetor1.length; aux++) {
            System.out.println("Digite um numero: ");
            vetor1[aux] = teclado.nextInt();
        }
        for  (int aux = 0; aux < vetor1.length; aux++) {
            vetor2[aux] = vetor1[vetor1.length - aux];
        }
        for (int aux = 0; aux < vetor1.length; aux++) {
            System.out.print(vetor2[aux] + " ");
        }
        teclado.close();
    }
}

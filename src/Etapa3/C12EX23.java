package Etapa3;

//FUNÇAO: Salva os numeros de um vetor que sao multiplos de 3 em outro vetor e imprime
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[vetor1.length], cont = 0;

        for  (int aux = 0; aux < vetor1.length; aux++) {
            System.out.println("Digite um numero inteiro: ");
            vetor1[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < vetor1.length; aux++) {
            if (vetor1[aux] % 3 == 0){
                vetor2[cont] = vetor1[aux];
                cont++;
            }
        }
        for (int aux = 0; aux < cont; aux++) {
            System.out.print(vetor2[aux] + " ");
        }
        teclado.close();
    }
}

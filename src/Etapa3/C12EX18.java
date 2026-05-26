package Etapa3;

//FUNÇAO: Le 10 numeros inteiros e imprime a multiplicação por um numero real informado pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];
        double num;

        for (int aux = 0; aux < numeros.length; aux++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[aux] = teclado.nextInt();
        }
        System.out.println("Digite um numero real: ");
        num = teclado.nextDouble();
        for (int aux = 0; aux < numeros.length; aux++) {
            System.out.print((numeros[aux] * num) + " ");
        }
        teclado.close();
    }
}

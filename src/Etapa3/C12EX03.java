package Etapa3;

//FUNÇAO: Eleva ao quadrado 10 numeros digitados pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args) {
        int vet[] = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("Informe um numero inteiro: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < vet.length; aux++) {
            vet[aux] = (int) Math.pow(vet[aux], 2);
            System.out.print(vet[aux] + " ");
        }
        teclado.close();
    }
}

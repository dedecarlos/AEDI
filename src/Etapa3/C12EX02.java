package Etapa3;

//FUNÇAO: Conta quantos numeros digitados pelo usuario sao maiores que 5 e menores que 10
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX02 {
    public static void main(String[] args) {
        int vet[] = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.println("Informe um numero inteiro: ");
            vet[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < vet.length; aux++) {
            if (vet[aux] > 5 && vet[aux] < 10) {
                System.out.print(vet[aux]+" ");
            }
        }
        teclado.close();
    }
}

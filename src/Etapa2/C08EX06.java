package Etapa2;

//FUNÇAO: Pede ao usuario 10 numeros inteiros e calcula quantos são pares,
//quantos são divisiveis por 3 e qual a soma dos numeros divisiveis por 4
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX06 {
    public static void main(String[] args) {
        int num, soma = 0, divisao = 0;
        Scanner teclado = new Scanner(System.in);

        for (int repete = 1; repete <= 10; repete++) {
            System.out.println("Digite um numero inteiro: ");
            num = teclado.nextInt();
            if (num % 2 == 0) {
                System.out.println(num+ " é par");
            }
            else
                System.out.println(num+ " é impar");
            if (num % 4 == 0) {
                soma += num; //soma += num para ele somar os numeros que sao divisiveis por 4
            }
            if (num % 3 == 0) {
                divisao++;
            }
        }
        System.out.println("A soma dos numeros divisiveis por 4 é de: " +soma);
        System.out.println("A quantidade de numeros divisiveis por 3 é de: " +divisao);
        teclado.close();
    }
}

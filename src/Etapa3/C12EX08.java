package Etapa3;

//FUNÇÃO: Calcula a soma dos numeros em certas posições
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[20];

        for (int aux = 0; aux < numeros.length; aux++) {
            System.out.println("Digite um numero inteiro de 1 a 20: ");
            numeros[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < 10; aux++) {
            System.out.println(numeros[aux] + numeros[aux + 10]);
        }
        teclado.close();
    }
}

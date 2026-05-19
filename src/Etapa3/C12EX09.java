package Etapa3;

//FUNÇÃO: Pede ao usuário 10 numeros inteiros e caalcula quais são divisores da soma de todos os numeros lidos
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10], soma = 0;

        for (int aux = 0; aux < numeros.length; aux++) {
            System.out.println("Digite um numero inteiro: ");
            numeros[aux] = teclado.nextInt();
            soma += numeros[aux];
        }
        for (int aux = 0;  aux < numeros.length; aux++) {
            if (soma % numeros[aux] == 0) {
                System.out.print(numeros[aux]+" ");
            }
        }
        teclado.close();
    }
}

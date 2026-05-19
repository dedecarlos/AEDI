package Etapa3;

//FUNÇAO: Conta quantos numeros digitados pelo usuario sao divisiveis por 5 e 7 ao mesmo tempo
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args) {
        int numero, cont = 0, vet[] = new int [10];

        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < vet.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            numero = teclado.nextInt();
            if (numero % 5 == 0 && numero % 7 == 0) {
                cont++;
            }
        }
        System.out.println("Quantidade de números divisiveis por 5 e 7 ao mesmo tempo é = "+cont);
        teclado.close();
    }
}
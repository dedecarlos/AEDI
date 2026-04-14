package Etapa2;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.math.BigInteger;
import java.util.Scanner;

public class C08EX20 {
    public static void main(String[] args) {
        int numN;
        double calc = 0, soma = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de repetições: ");
        numN = teclado.nextInt();

        for (int i = 0; i <= numN; i++) {
            soma += calc;
            calc = Math.pow(2,i);
            System.out.printf("%1.0f",calc);
            System.out.println();
        }
        System.out.printf("A soma é %1.0f " ,soma);
        teclado.close();
    }
}

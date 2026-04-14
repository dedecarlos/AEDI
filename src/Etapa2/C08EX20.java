package Etapa2;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.math.BigInteger;
import java.util.Scanner;

public class C08EX20 {
    public static void main(String[] args) {
        int numN;
        BigInteger calc =  BigInteger.ONE;
        BigInteger soma = BigInteger.ZERO;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de repetições: ");
        numN = teclado.nextInt();

        for (int i = 1; i <= numN; i++) {
            System.out.println(calc);
            soma = soma.add(calc); //funcao 2^n - 1 ou BigInteger.TWO.pow(numN).subtract(BigInteger.ONE);
            calc = calc.multiply(BigInteger.TWO); //Mesmo que calc *= 2
        }
        System.out.println("A soma é " +soma);
        teclado.close();
    }
}

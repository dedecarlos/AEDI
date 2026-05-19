package Etapa2;

import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args) {
        int numero, tabuada = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero de 1 a 9");
        numero = teclado.nextInt();

        for (int aux = 1; aux <= 9; aux++) {
            tabuada = aux * numero;
            System.out.println(tabuada);
        }
        teclado.close();
    }
}

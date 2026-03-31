package Etapa1;

import java.util.Scanner;

//FUNCAO: Decompoe um numero inteiro de 4 digitos e imprime de forma invertida
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX14 {
    public static void main(String[] args) {
        int numero, n1, n2, n3, n4;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um numero com 4 digitos: ");
        numero = teclado.nextInt();

        if (numero >= 1000 & numero <= 9999) {
            n1 = numero / 1000;
            n2 = numero / 100 % 10;
            n3 = numero % 100 / 10;
            n4 = numero % 10;
            System.out.println(n4 + "" + n3 + "" + n2 + "" + n1);
        }
        else {
            System.out.println("NUMERO TEM QUE TER 4 DIGITOS");
        }
    }
}

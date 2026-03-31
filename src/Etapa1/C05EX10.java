package Etapa1;
import java.util.Scanner;

//FUNCAO: Pede um numero inteiro de 5 digitos e imprime o resultado como 5 numeros inteiros separados
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX10 {
    public static void main(String[] args) {
        int numero, d1, d2, d3, d4, d5;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro com 5 digitos: ");
        numero = teclado.nextInt();
        teclado.close();

        d1 = numero / 10000;
        d2 = numero / 1000 % 10;
        d3 = numero / 100 % 10;
        d4 = numero % 100 / 10;
        d5 = numero % 10;
        System.out.println(d1+"\n");
        System.out.println(d2+"\n");
        System.out.println(d3+"\n");
        System.out.println(d4+"\n");
        System.out.println(d5);
        teclado.close();
    }
}

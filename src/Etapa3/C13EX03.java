package Etapa3;

//FUNÇAO: Decompoe um numero de acordo com a posição informada pelo usuario e imprime o resultado
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero (-1 para encerrar): ");
        int numero =  teclado.nextInt();
        while (numero != -1){
            System.out.println("Digite a posição da decomposição: ");
            int posicao = teclado.nextInt();
            int resultado = funcao(numero, posicao);
            System.out.println("Digito na posição " + posicao + " é " + resultado);
            System.out.println("Digite um numero (-1 para encerrar): ");
            numero =  teclado.nextInt();
        }
        teclado.close();
    }
    public static int funcao(int numero, int posicao) {
        int resultado = numero / (int) Math.pow(10, posicao - 1);
        return resultado % 10;
    }
}

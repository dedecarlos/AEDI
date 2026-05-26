package Etapa3;

import java.util.Scanner;

public class C13EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero (-1 para encerrar): ");
        int numero =  teclado.nextInt();
        while (numero != -1){
            System.out.println("Digite a posição da decomposição: ");
            int posicao = teclado.nextInt();
        }

    }
    public static int funcao(int x, int posicao) {
        int resultado = x % posicao;
        return resultado;
    }
}

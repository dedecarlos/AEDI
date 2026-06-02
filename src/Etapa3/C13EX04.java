package Etapa3;

//FUNÇAO: Pede para o usuario adivinhar um numero aleatorio de 0 a 100 e no final imprime a quantidade de tentativas
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Random;
import java.util.Scanner;

public class C13EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(101), numero, cont = 0;

        do{
            System.out.print("Digite um numero: ");
            numero = teclado.nextInt();
            if (numero < num){
                System.out.println("Numero abaixo do desejado");
            } else if (numero > num){
                System.out.println("Numero acima desejado");
            } else {
                System.out.println("Bingo");
            }
            cont++;
        }while (num != numero);
        System.out.println("Total de tentativas: " + cont);
        teclado.close();
    }
}

package Etapa2;

//FUNÇÃO: Calcula e imprime o valor da multa de acordo com os valores digitados pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args) {
        int valor, soma = 0, cont = 0;
        double media, multa = 0;

        Scanner teclado =  new Scanner(System.in);
        System.out.println("Para finalizar digite -1");

        do {
            System.out.println("Digite um valor: ");
            valor = teclado.nextInt();
            if (valor != -1){
                multa =  valor * 0.1;
                System.out.printf("A multa a ser aplica é: R$%1.2f" ,multa);
                System.out.println();
                soma += multa;
                cont++;
            }
        } while (valor != -1);
        media = (float) soma / cont;
        System.out.printf("A média dos valores da multa é: R$%1.2f" ,media);
        teclado.close();
    }
}

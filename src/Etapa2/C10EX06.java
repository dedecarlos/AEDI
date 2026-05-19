package Etapa2;

//FUNÇÃO: Calcula a distancia entre pontos X e Y em uma reta R
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args) {
        double valorA, valorB, valorC, valorX, valorY, distancia;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A da reta R: ");
        valorA = teclado.nextDouble();
        System.out.println("Digite o valor de B da reta R: ");
        valorB = teclado.nextDouble();
        System.out.println("Digite o valor de C da reta R: ");
        valorC = teclado.nextDouble();

        do {
            System.out.println("Digite o valor do ponto X: ");
            valorX = teclado.nextDouble();
            System.out.println("Digite o valor do ponto Y: ");
            valorY = teclado.nextDouble();
            distancia = ((valorA * valorX) + (valorB * valorY) + valorC) / Math.sqrt(Math.pow(valorA,2) + Math.pow(valorB,2));
            System.out.println("A distancia é:  " + distancia);

        } while (distancia != 0);
        System.out.println("A cordenada X é: " +valorX+"\nA cordenada Y é: "+valorY);
        teclado.close();
    }
}

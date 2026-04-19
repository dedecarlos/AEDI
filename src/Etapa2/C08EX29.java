package Etapa2;

//FUNCAO: Calcula o valor da funcao X^Y sem utilizar metodos do java
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX29 {
    public static void main(String[] args) {
        int X, Y, funcao_XY = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        X = teclado.nextInt();
        System.out.println("Digite o valor de Y: ");
        Y = teclado.nextInt();

        for (int aux = 1; aux <= Y; aux++){
            funcao_XY = funcao_XY * X;
        }
        System.out.println("X^Y = "+funcao_XY);
        teclado.close();
    }
}

package Etapa3;

//FUNÇÃO: Cria um metodo para calcular a distância
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX01 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        double distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de X1: ");
        x1 = teclado.nextInt();
        System.out.println("Informe o valor de X2: ");
        x2 = teclado.nextInt();
        System.out.println("Informe o valor de Y1: ");
        y1 = teclado.nextInt();
        System.out.println("Informe o valor de Y2: ");
        y2 = teclado.nextInt();
        distancia = funcao(x1, y1, x2, y2);
        System.out.println("A distância entre os pontos é: " + distancia);
        teclado.close();
    }

    public static double funcao(int x1, int y1, int x2, int y2) {
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow((y1 - y2), 2.0));
        return distancia;
    }
}

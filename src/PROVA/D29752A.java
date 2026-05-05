//ANGELO CARLOS MACHADO SANTOS

package PROVA;

import java.util.Scanner;

public class D29752A {
    public static void main(String[] args) {
        int X, Y, Z;
        double funcao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        X = teclado.nextInt();
        System.out.println("Digite o valor de Y: ");
        Y = teclado.nextInt();
        System.out.println("Digite o valor de Z: ");
        Z = teclado.nextInt();
        teclado.close();

    
        funcao = 4 * Math.pow(X, 4) - 2 * (Y + 1) / (Z - 1) + Math.pow(X - Y + 4 * Math.pow(Z,2),1.0/5) + Math.sqrt(1 - X) / 4 + Math.pow(X,2) - Math.pow((Y - Z),5);

        System.out.println("O valor da função é: "+funcao);
    }
}

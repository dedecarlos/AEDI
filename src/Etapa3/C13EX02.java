package Etapa3;

import java.util.Scanner;

public class C13EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X (-1 para encerrar): ");
        int x  = teclado.nextInt();
        while (x != -1) {
            System.out.println("O valor da função f(x) é: " + C13EX02funcao.funcao(x));
            System.out.println("Digite o valor de X (-1 para encerrar): ");
            x  = teclado.nextInt();
        }
        teclado.close();
    }
}

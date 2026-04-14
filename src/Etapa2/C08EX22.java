package Etapa2;

//FUNCAO: Confima se o numero digitado pelo usuario é primo ou não
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args) {
        int num, cont = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero maior que 0: ");
        num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            if  (num % i == 0 && num % 1 == 0)
                cont++;
        }
        if (cont <= 2)
            System.out.println(num+ " é primo");
        else
            System.out.println(num+ " não é primo");
        teclado.close();
    }
}

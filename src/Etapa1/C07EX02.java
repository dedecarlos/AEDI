package Etapa1;

import java.util.Scanner;

//FUNCAO: Calcula a media das notas e imprime o conceito do aluno
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C07EX02 {
    public static void main(String[] args) {
        int nota1,  nota2, nota3, notaFinal;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        nota1 = teclado.nextInt();
        System.out.println("Digite o valor da segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.println("Digite o valor da terceira nota: ");
        nota3 = teclado.nextInt();
        teclado.close();

        notaFinal = (nota1 + nota2 + nota3) / 3; //Nao esquecer de colocar parentesess

        switch (notaFinal) {
            case 1, 2, 3, 4 -> System.out.println("Conceito E");
            case 5, 6 -> System.out.println("Conceito D");
            case 7 -> System.out.println("Conceito C");
            case 8 -> System.out.println("Conceito B");
            case 9, 10 -> System.out.println("Conceito A");
        }
    }
}

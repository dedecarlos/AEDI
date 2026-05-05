package Etapa1;

import java.util.Scanner;

//FUNÇÃO: Calcula o peso ideal de uma pessoa de acordo com sua altura e os valores de IMC
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX08 {
    public static void main(String[] args) {
        double altura, peso1, peso2, IMC1=20, IMC2=25;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();
        teclado.close();

        if (IMC1 >= 20 & IMC2 <= 25) {
            peso1 = IMC1 * Math.pow(altura, 2.0);
            peso2 = IMC2 * Math.pow(altura, 2.0);
            System.out.printf("Peso ideal está entre " + peso1 + " e %1.2f" , peso2);
        }

    }
}


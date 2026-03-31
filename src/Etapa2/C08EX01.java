package Etapa2;

import java.util.Scanner;

//FUNCAO: Calcular a área de um círculo, utilizando a fórmula A = π * r^2.O programa deve solicitar ao usuário o valor do raio e exibir a área correspondente. O processo deve ser repetido 10 vezes para permitir o cálculo de áreas de diferentes círculos.
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX01 {
    public static void main(String[] args) {
        double area, raio, pi = 3.1416;
        Scanner teclado = new Scanner(System.in);

        for (int calculo = 1; calculo <= 10; calculo++) {
            System.out.println("Digite o valor do Raio do circulo: ");
            raio = teclado.nextDouble();
            area = pi * Math.pow(raio, 2);
            System.out.println("A área é de: " + area);
        }
        teclado.close();
    }
}

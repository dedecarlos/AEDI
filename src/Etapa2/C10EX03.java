package Etapa2;

//FUNÇÃO: Calcula o valor da função S de acordo com os valores do angulo e dos raios informados pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args) {
        int angulo, raio;
        double funcaoS;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do angulo");
        angulo = teclado.nextInt();

        do {
            System.out.println("Informe o valor do raio (raio = -1 encerra o programa)");
            raio = teclado.nextInt();
            if (raio != -1) {
                funcaoS = (angulo * 3.1416 * Math.pow(raio, 2)) / 360;
                System.out.println("O valor da função S é: " + funcaoS);
            }
        } while (raio != -1);
        teclado.close();
    }
}

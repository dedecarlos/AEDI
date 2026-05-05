package Etapa2;

//FUNCAO: Calcula e imprime em uma tabela o peso ideal de uma pessoa de acordo com sua altura
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {
        double altura, imc = 0;
        String tabela = "| %-10d | %-10f | %-17s |%n";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe sua altura:");
        altura = teclado.nextDouble();

        System.out.printf("| %-10s | %-10s | %15s |%n", "PESO", "   IMC", "SITUAÇÃO CORPOREA");

        for (int i = 60; i <= 100; i++){
            imc = i / Math.pow(altura,2);
            if (imc < 20)
                System.out.printf(tabela, i, imc, "Abaixo do peso");
            else if (imc <= 25)
                System.out.printf(tabela, i, imc, "Peso ideal");
            else
                System.out.printf(tabela, i, imc, "Acima do peso");
        }
        teclado.close();
    }
}

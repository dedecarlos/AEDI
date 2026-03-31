package Etapa1;

import java.util.Scanner;

//FUNCÃO: Calcula o peso ideal de acordo com a altura e o sexo do usuário
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX09 {
    public static void main(String[] args) {
        double altura, peso_ideal_Homem, peso_ideal_Mulher;
        String sexo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu altura: ");
        altura = teclado.nextDouble();
        System.out.println("Digite seu sexo: ");
        sexo = teclado.next();

        if (sexo.equalsIgnoreCase("M")) {
            peso_ideal_Homem = 72.7 * altura - 58;
            System.out.printf("Peso ideal é %1.3f" , peso_ideal_Homem);
        }

        else if (sexo.equalsIgnoreCase("F")) {
            peso_ideal_Mulher = 62.1 * altura - 44.7;
            System.out.printf("Peso ideal é %1.3f" , peso_ideal_Mulher);
        }
    }
}

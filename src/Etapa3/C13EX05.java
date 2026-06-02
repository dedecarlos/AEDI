package Etapa3;

//FUNCAO: Calcula funcoes de um angulo
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o angulo: ");
        int angulo = teclado.nextInt();
        double radiano = Math.toRadians(angulo);
        System.out.println("O seno = " + Math.sin(radiano) + ", cosseno = " + Math.cos(radiano)
                      + ", tangente = " + Math.tan(radiano) + ", arco seno = " + (1 / Math.sin(radiano))
        + ", arco cosseno = " + (1 / Math.cos(radiano)) + ", arco tangente = " + (1 / Math.tan(radiano)));
        System.out.println(Math.asin(radiano)+", "+Math.acos(radiano)+", "+Math.atan(radiano));
        teclado.close();
    }
}

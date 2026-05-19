package Etapa3;

//FUNÇÃO: Calcula a ordem da largada em dupla de uma corrida de acordo com a posição de chegada dos corredores
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX04 {
    public static void main() {
        int corredor1, corredor2, corredores[] = new int[20];

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o numero dos corredore de acordo com a ordem de chegada");

        for (int aux = 0; aux < corredores.length; aux++) {
            System.out.println("Corredor posição " + (aux + 1) + ":");
            corredores[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < 10; aux++) {
            corredor1 =  corredores[aux];
            corredor2 = corredores[aux + 10];
            System.out.println("A ordem de largada em duplas será: Dupla " + (aux + 1) + " = " + corredor1 + " e " +  corredor2);
        }
        teclado.close();
    }
}

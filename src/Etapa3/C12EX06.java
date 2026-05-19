package Etapa3;

//FUNÇÃO: Lê os nomes dos meses e imprime de tras pra frente
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String meses[] = new String[12];

        for (int aux = 0; aux < meses.length; aux++) {
            System.out.println("Digite o mês: ");
            meses[aux] = teclado.nextLine();
        }
        for (int aux = meses.length - 1;  aux >= 0; aux--) {
            System.out.print(meses[aux] + " ");
        }
        teclado.close();
    }
}
package Etapa3;

//FUNÇAO: Imprime os meses do ano em ordem alfabetica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String meses[] = new String[12], tempMes;

        for (int aux = 0; aux < meses.length; aux++) {
            System.out.println("Digite o nome do mes " + (aux + 1));
            meses[aux] = teclado.nextLine();
        }
        for (int aux = 0; aux < meses.length - 1; aux++) {
            for  (int aux2 = 0; aux2 < meses.length - 1; aux2++) {
                if (meses[aux2].compareToIgnoreCase(meses[aux2 + 1]) > 0) {
                    tempMes = meses[aux2];
                    meses[aux2] = meses[aux2 + 1];
                    meses[aux2 + 1] = tempMes;
                }
            }
        }
        for (int aux = 0; aux < meses.length; aux++) {
            System.out.print(meses[aux] + " ");
        }
        teclado.close();
    }
}

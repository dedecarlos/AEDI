package Etapa3;

//FUNÇAO: Pesquisa se o numero do bilhete de loteria do usuario foi premiado
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bilhetes[] = new int[100], sorteado, pos = -1;

        for (int aux = 0; aux < bilhetes.length; aux++) {
            System.out.println("Informe o numero do bilhete: ");
            bilhetes[aux] = teclado.nextInt();
        }
        System.out.println("Informe o numero do bilhete sorteado: ");
        sorteado = teclado.nextInt();
        for (int aux = 0; aux < bilhetes.length; aux++) {
            if (sorteado == bilhetes[aux]) {
                pos = aux;
            }
        }
        if (pos == -1){
            System.out.println("Nenhum numero encontrado");
        }
        else {
            System.out.println("Bilhete " + bilhetes[pos] + " foi premiado");
        }
        teclado.close();
    }
}

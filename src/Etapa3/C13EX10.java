package Etapa3;

//FUNÇAO: Le um nome e imprime usando o metodo split String
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome completo: ");
        String nome = teclado.nextLine();
        String letras[] = nome.split("");

        for (int aux = 0; aux < letras.length; aux++) {
            System.out.println(letras[aux]);
        }
    }
}

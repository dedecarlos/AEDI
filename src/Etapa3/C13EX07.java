package Etapa3;

//FUNCAO: Informa o nome de familia de uma pessoa usando o metodo String.split()
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = teclado.nextLine();
        String[] nomes = nomeCompleto.split(" ");
        String sobrenome = nomes[nomes.length - 1];

        System.out.println("O nome de família é: " + sobrenome);

        teclado.close();
    }
}

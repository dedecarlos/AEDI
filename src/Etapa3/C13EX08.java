package Etapa3;

//FUNCAO: Imprime o nome de um autor de acordo com as normas da ABNT
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome completo do autor: ");
        String nomeCompleto = teclado.nextLine().trim();
        String[] nomes = nomeCompleto.split(" ");
        String sobrenome = nomes[nomes.length - 1].toUpperCase();

        StringBuilder iniciais = new StringBuilder();
        for (int aux = 0; aux < nomes.length - 1; aux++) {
            iniciais.append(nomes[aux].toUpperCase().charAt(0)).append(". ");
        }

        System.out.println("Nome formatado: " + sobrenome + ", " + iniciais.toString().trim());

        teclado.close();
    }
}

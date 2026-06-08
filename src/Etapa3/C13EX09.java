package Etapa3;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase curta: ");
        String frase = teclado.nextLine().trim();

        String[] palavras = frase.split(" ");

        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                String formatada = palavra.substring(0, 1).toUpperCase() +
                        palavra.substring(1).toLowerCase();
                resultado.append(formatada).append(" ");
            }
        }

        System.out.println("Frase formatada: " + resultado.toString());

        teclado.close();
    }
}

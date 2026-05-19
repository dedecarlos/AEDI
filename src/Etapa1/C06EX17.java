package Etapa1;

import java.util.Scanner;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX17 {
    public static void main(String[] args) {
        String pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6, pergunta7, pergunta8, pergunta9;
        boolean apto=true;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Você tem curso técnico de programação?");
        pergunta1 = teclado.nextLine();
        System.out.print("Você tem curso superior de programação?");
        pergunta2 = teclado.nextLine();
        System.out.print("Você tem menos de 3 anos de experiência em programação?");
        pergunta3 = teclado.nextLine();
        System.out.print("Você se considera uma pessoa criativa?");
        pergunta4 = teclado.nextLine();
        System.out.print("Você prefere liderar a ser liderado?");
        pergunta5 = teclado.nextLine();
        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe?");
        pergunta6 = teclado.nextLine();
        System.out.print("Você é autodidata (aprende sozinho)?");
        pergunta7 = teclado.nextLine();
        System.out.print("Você aceitaria uma remuneração inicial de R$1500?");
        pergunta8 = teclado.nextLine();
        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?");
        pergunta9 = teclado.nextLine();
        teclado.close();

        // Item 1: curso técnico + mais de 3 anos de experiência
        if (pergunta1.equals("VERDADEIRO") && pergunta2.equals("FALSO") && pergunta3.equals("FALSO")) {
            apto = true;
        } else if (pergunta4.equals("VERDADEIRO") &&
                pergunta6.equals("FALSO") &&
                pergunta7.equals("VERDADEIRO") &&
                pergunta9.equals("FALSO")) {
            apto = true;
        } else {
            apto = false;
        }

        // Item 2: se só aceita liderar, não pode aceitar salário de até R$1500
        if (pergunta5.equals("VERDADEIRO") && pergunta8.equals("VERDADEIRO")) {
            apto = false;
        }

        // Resultado final
        if (apto) {
            System.out.println("\nParabéns! Você está apto para exercer a função de programador na empresa.");
        } else {
            System.out.println("\nInfelizmente, você não está apto para exercer a função de programador na empresa.");
        }
    }
}

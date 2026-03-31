package Etapa1;
import java.util.Scanner;

public class C06EX16 {
    public static void main(String[] args) {
        int faltas, idade;
        double prova1, prova2, prova3, notaTrabalho, media, peso1, peso2, peso3, notaFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de faltas: ");
        faltas = teclado.nextInt();

        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();

        System.out.print("Digite a nota da prova 1: ");
        prova1 = teclado.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        prova2 = teclado.nextDouble();

        System.out.print("Digite a nota da prova 3: ");
        prova3 = teclado.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        notaTrabalho = teclado.nextDouble();

        if (faltas <= 5) {
            peso1 = 3;
    }
    else if (faltas <= 10) {
        peso1 = 2;
    }
    else {
        peso1 = 1;
    }
    double menor = prova1;

    if (prova2 < menor) {
        menor = prova2;
    }
    else {
        menor = prova3;
    }
    media = (prova1 + prova2 + prova3 - menor) / 2;

    if (idade <=17){
        peso2 = 1;
    }
    else if (idade <= 50) {
        peso2 = 2;
    }
    else {
        peso2 = 3;
    }

    notaFinal = media * peso1 + notaTrabalho * peso2;

    if (notaFinal <= 50) {
        System.out.println("Reprovado");
    }
    else if (notaFinal <= 70) {
        System.out.println("Regular");
    }
    else if (notaFinal <= 90) {
        System.out.println("Muito Bom");
    }
    else {
        System.out.println("Excelente");
    }
    teclado.close();
    }

}

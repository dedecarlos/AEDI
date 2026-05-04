package Etapa2;

//FUNÇÃO: Calcula o tempo para infectar a população inteira de uma cidade
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C10EX07 {
    public static void main(String[] args) {
        double pessoasInfectadas = 1, contaminacao;
        int diasTotais = 0, populacao;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da população da ciadade: ");
        populacao = teclado.nextInt();

        do {
            contaminacao = pessoasInfectadas * 0.003;
            pessoasInfectadas += contaminacao;
            diasTotais++;

        } while (pessoasInfectadas < populacao);
        int anos = diasTotais / 365;
        int meses = diasTotais % 365 / 30;
        int dias =  diasTotais % 365 % 30;

        System.out.println("Para uma populacao de "+populacao+" demoraria "+anos+", "+meses+", "+dias+" para contaminar toda a populacao");
        teclado.close();
    }
}

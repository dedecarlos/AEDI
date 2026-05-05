package Etapa2;

//FUNÇÃO: Calcula os dados de um arquivo txt
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.text.DecimalFormat;
import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
        String cidade, cidadPopMenor = "", percentualFormatado;
        int cont = 0, cont2 = 0, totalCidades = 0, cidadesMaisMulheres = 0;
        long populacao, populacaoTotal = 0, numEleitores, numEleitoresTotal = 0, quantHomens, quantHomensTotal = 0, mediaHomens, quantMulheres, populacaoMenor = 0;
        double percentualEleitores;

        Scanner arquivo = new Scanner(C08EX13.class.getResourceAsStream("c10ex08.txt"));

        do {
            cidade = arquivo.nextLine();
            totalCidades++;
            populacao = arquivo.nextLong();
            populacaoTotal += populacao;
            numEleitores = arquivo.nextLong();
            numEleitoresTotal += numEleitores;
            quantHomens = arquivo.nextLong();
            quantHomensTotal += quantHomens;
            quantMulheres = arquivo.nextLong();
            arquivo.nextLine();
            if (quantHomens + quantMulheres != populacao) {
                System.out.println("\n" + cidade + " possui soma de homens e mulhere diferente da população\n");
            }
            if (quantHomens < quantMulheres) {
                cidadesMaisMulheres++;
            }
            if (totalCidades == 1 || populacao < populacaoMenor) {
                populacaoMenor = populacao;
                cidadPopMenor = cidade;
            }

        } while (!cidade.equalsIgnoreCase("Zimbabue de Minas"));
        percentualEleitores = (float) (numEleitoresTotal * 100) / populacaoTotal;
        //Formata o valor para 3 casa apos a virgula
        percentualFormatado = new DecimalFormat("##,###00.000").format(percentualEleitores);
        mediaHomens = quantHomensTotal / totalCidades;
        System.out.println("O total de cidades é: " + totalCidades);
        System.out.println("A população total do estado é: " + populacaoTotal);
        System.out.println("O percentual de eleitores é: " + percentualFormatado + "%");
        System.out.println("O total de cidades com mais mulheres que homens é: " + cidadesMaisMulheres);
        System.out.println("A média de homens é: " + mediaHomens);
        System.out.println("A cidade com menor população é: " + cidadPopMenor);
        arquivo.close();
    }
}

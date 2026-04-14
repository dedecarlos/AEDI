package Etapa2;

//FUNÇÃO: Calcula porcentagem de eleitores, quantidade e diferença entre homens e mulheres em diversas cidades a partir de dados em um arquivo txt
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.text.DecimalFormat;
import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) {
        String cidade, cidadPopMenor = "", percentualFormatado;
        int cont = 0, cont2 = 0;
        long populacao, numEleitores, quantHomens, quantMulheres, populacaoMenor = 0;
        double percentualEleitores;

        Scanner arquivo = new Scanner(C08EX13.class.getResourceAsStream("c08ex13.txt"));

        for (int repete = 1; repete <= 5; repete++) {
            cidade = arquivo.nextLine();
            populacao = arquivo.nextLong();
            numEleitores = arquivo.nextLong();
            quantHomens = arquivo.nextLong();
            quantMulheres = arquivo.nextLong();
            arquivo.nextLine();

            if (quantHomens + quantMulheres != populacao) {
                System.out.println("\n"+cidade+" possui soma de homens e mulhere diferente da população\n");
            }
            if (populacao > 1000000) {
                cont++;
            }
            if (quantMulheres > quantHomens) {
                cont2++;
            }
            if (repete == 1 || populacao < populacaoMenor) {
                populacaoMenor = populacao;
                cidadPopMenor = cidade;
            }
            percentualEleitores = (float) (numEleitores * 100) / populacao;
            //Formata o valor para 1 casa apos a virgula
            percentualFormatado = new DecimalFormat("##,#00.0").format(percentualEleitores);
            System.out.println("A porcentagem de eleitores em "+cidade+" é de "+percentualFormatado+"%\n");
        }
        System.out.println("Total de cidades com população acima de 1 milhão de habitantes = "+cont+"\n");
        System.out.println("Cidades com mais mulheres que homens = "+cont2+"\n");
        System.out.println("Cidade com menor populção = "+cidadPopMenor+"\n");
        arquivo.close();
    }
}

package Etapa3;

//FUNÇÃO: Lê os nomes e notas dos alunos de uma turma e calcula a media da turma e imprime quais alunos ficaram acima da media
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas[] = new int[50], soma = 0;
        double media;
        String nomes[] = new String[50];

        for (int aux = 0; aux < nomes.length; aux++) {
            System.out.println("Informe o nome do aluno: ");
            nomes[aux] = teclado.nextLine();
            System.out.println("Informe a nota do aluno: ");
            notas[aux] = teclado.nextInt();
            teclado.nextLine();
            soma += notas[aux];
        }
        //Se preencher o vetor, não há necesside de criar um contador
        media = soma / notas.length;
        for  (int aux = 0; aux < nomes.length; aux++) {
            if (notas[aux] > media) {
                System.out.println(nomes[aux]);
            }
        }
        teclado.close();
    }
}

package Etapa3;

//FUNÇÃO: Lê os nomes e notas dos alunos de uma turma e calcula a maior nota e imprime o nome do aluno
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas[] = new int[50], notaMaior = 0;
        String nomes[] = new String[notas.length], nomeMaior = "";

        for (int aux = 0; aux < nomes.length; aux++) {
            System.out.println("Digite o nome do aluno: ");
            nomes[aux] = teclado.nextLine();
            System.out.println("Digite a nota do aluno: ");
            notas[aux] = teclado.nextInt();
            teclado.nextLine();
            if  (notas[aux] > notaMaior) {
                notaMaior = notas[aux];
                nomeMaior = nomes[aux];
            }
        }
        System.out.println(nomeMaior+" foi o aluno com a maior nota");
        teclado.close();
    }
}

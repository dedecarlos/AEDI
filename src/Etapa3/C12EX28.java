package Etapa3;

//FUNÇAO: Cria uma lista com os nomes e RAs de alunos e permite o usuario realizar pesquisas
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();
        String nome, tempNome;
        List<Integer> listaRA = new ArrayList<Integer>();
        int RA, tempRA;

        do {
            System.out.println("Digite o nome do aluno: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                nomes.add(nome);
                System.out.println("Digite o RA do aluno: ");
                RA = teclado.nextInt();
                listaRA.add(RA);
                teclado.nextLine();
            }
        } while (!nome.equalsIgnoreCase("X"));
        for (int aux = 0; aux < nomes.size() - 1; aux++) {
            for (int aux2 = aux + 1; aux2 < nomes.size() -1; aux2++) {
                if (nomes.get(aux2).compareToIgnoreCase(nomes.get(aux2 + 1)) > 0) {
                    tempNome = nomes.get(aux2);
                    nomes.set(aux2, nomes.get(aux2 + 1));
                    nomes.set(aux2 + 1, tempNome);
                    tempRA = listaRA.get(aux2);
                    listaRA.set(aux2, listaRA.get(aux2 + 1));
                    listaRA.set(aux2 + 1, tempRA);
                }
            }
        }
        System.out.println("Digite o nome do aluno que deseja pesquisar: ");
        nome = teclado.nextLine();
        int pos = -1;
        for (int aux = 0; aux < nomes.size(); aux++) {
            if (nomes.get(aux).equalsIgnoreCase(nome)){
                pos = aux;
                break;
            }
        }
        if (pos == -1){
            System.out.println("Nome não encontrado!");
        }
        else{
            System.out.println("RA: " + listaRA.get(pos) + " está na posição " + (pos +1));
        }
        teclado.close();
    }
}

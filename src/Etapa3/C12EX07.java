package Etapa3;

//FUNÇÃO: Pede os nomes e notas dos alunos de uma escola e imprime os conceitos
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        String nomes[] = new String[50], conceito[] = new String[50];

        for (int aux = 0; aux < nomes.length; aux++) {
            System.out.println("Digite o nome do aluno: ");
            nomes[aux] = teclado.nextLine();
            System.out.println("Digite o nota do aluno: ");
            nota = teclado.nextInt();
            teclado.nextLine();
            if (nota <= 30){
                conceito[aux] = "D";
            } else if (nota <= 60){
                conceito[aux] = "C";
            }  else if (nota <= 80){
                conceito[aux] = "B";
            } else {
                conceito[aux] = "A";
            }
        }
        for (int aux = 0; aux < conceito.length; aux++) {
            System.out.println(nomes[aux]+ " teve conceito "+conceito[aux]);
        }
        teclado.close();
    }
}

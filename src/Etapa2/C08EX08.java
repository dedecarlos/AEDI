package Etapa2;

//FUNÇÃO: Imprime se o aluno foi Aprovado ou Reprovado de acordo com a nota e as faltas
//e calcula a media das notas dos aprovados e a quantidade de alunos com mais de 16 faltas
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args) {
        int nota, faltas, soma = 0, contFaltas = 0, cont1 = 0;
        double media;
        Scanner teclado = new Scanner(System.in);

        for (int repete = 1; repete <= 50; repete++) {
            System.out.println("Digite a nota do aluno: ");
            nota = teclado.nextInt();
            System.out.println("Digite o número de faltas do aluno: ");
            faltas = teclado.nextInt();
            if (faltas > 16)
                contFaltas++;

            if (nota >= 65 && faltas <= 16) {
                System.out.println("Aluno aprovado!");
                soma += nota;
                cont1++;
            }
            else {
                System.out.println("Aluno reprovado!");
            }
        }
        media = (float) soma / cont1;
        System.out.println("A média das notas dos aprovados é "+media);
        System.out.println("A quantidade de alunos com mais de 16 faltas é de "+contFaltas);
        teclado.close();
    }
}
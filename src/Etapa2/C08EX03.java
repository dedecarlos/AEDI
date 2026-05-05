package Etapa2;

import java.util.Scanner;

//FUNCAO: Ler a nota e o número de faltas de 50 alunos, e determinar se cada aluno foi aprovado ou reprovado. A aprovação é baseada em uma nota mínima de 65 e um limite máximo de 16 faltas. O programa deve permitir que o usuário interrompa a entrada de dados a qualquer momento digitando -1 para a nota do aluno.
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX03 {
    public static void main(String[] args) {
        int nota, faltas, contadorAprovados=0, contadorReprovados=0;

        Scanner teclado = new Scanner(System.in);
       
        for (int repete = 1; repete <= 50; repete++) {
            System.out.println("Digite a nota do aluno: ");
            nota = teclado.nextInt();
            System.out.println("Digite o número de faltas do aluno: ");
            faltas = teclado.nextInt();
            teclado.nextLine();
            if (nota >= 65 && faltas <= 16)
                System.out.println("Aluno aprovado!");
            contadorAprovados++;
        }
        contadorReprovados = 50 -  contadorAprovados;

        System.out.println("Número de alunos aprovados: "+contadorAprovados);
        System.out.println("Número de alunos reprovados: "+contadorReprovados);
        teclado.close();
    }
    
}

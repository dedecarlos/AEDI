package Etapa2;

//FUNÇÃO: Pede ao usuário os nomes e idades dos alunos de uma sala e calcula a soma e média de idades
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args) {
        int idade, soma = 0, somaIdade12, somaIdade30, cont1 = 0, cont2 = 0;
        double media;
        Scanner teclado = new Scanner(System.in);

        for (int repete = 1; repete <=50; repete++) {
            System.out.println("Digite o nome do aluno:");
            System.out.println("Digite a idade do aluno:");
            idade = teclado.nextInt();
            soma += idade;
            if (idade <= 12)
                cont1++;
            else if (idade >= 30)
                cont2++;
        }
        somaIdade12 = cont1;
        System.out.println(cont1+" tem até 12 anos");
        somaIdade30 = cont2;
        System.out.println(cont2+" tem acima de 30 anos");
        media = soma / 50.0;
        System.out.println(media+" é a média das idades");
        teclado.close();
    }
}

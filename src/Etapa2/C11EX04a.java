package Etapa2;

//FUNÇAO: Le os dados de 230 multas e calcula diferentes fatores
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX04a {
    static void main() {
        String nome, sexo, pessoaMaisVelha = "";
        int idade, idadeMaisVelha = 0, pontos, idadeMedia, somaIdade = 0, contIdade = 0, contMulheres = 0, contHomens = 0;
        double multa, multaTotal = 0, percentualHomens;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 3; aux++) {
            System.out.println("Informe o nome do condutor: ");
            nome = teclado.nextLine();
            System.out.println("Informe o sexo do condutor: ");
            sexo = teclado.nextLine();
            if (sexo.equalsIgnoreCase("M")) {
                contHomens++;
            }
            System.out.println("Informe a idade: ");
            idade = teclado.nextInt();
            somaIdade += idade;
            contIdade++;
            System.out.println("Informe a quantidade de pontos: ");
            pontos = teclado.nextInt();
            System.out.println("Informe o valor da multa: ");
            multa = teclado.nextDouble();
            multaTotal += multa;
            teclado.nextLine();
            if (sexo.equalsIgnoreCase("f") && pontos == 7) {
                contMulheres++;
            }
            if (aux == 1 || idade < idadeMaisVelha) {
                idadeMaisVelha = idade;
                pessoaMaisVelha = nome;
            }
        }
        idadeMedia = somaIdade / contIdade;
        percentualHomens = (float) (contHomens * 100) / 3;
        System.out.println("A idade média dos condutores é: " + idadeMedia);
        System.out.println("O valor total das multas é: " + multaTotal);
        System.out.println("O percentual de homens multados é: " + percentualHomens);
        System.out.println("A quantidade de mulheres que perderam 7 pontos é: " + contMulheres);
        System.out.println(pessoaMaisVelha + ", " + idadeMaisVelha + ", é a pessoa mais velha");
        teclado.close();
    }
}

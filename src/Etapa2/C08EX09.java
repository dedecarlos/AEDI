package Etapa2;

//FUNÇÃO: Pede o nome, idade e sexo da pessoa e calcula a soma e media das idades das mulheres e homens
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {
        int idade, rep, cont1 = 0,  cont2 = 0, somaM = 0, somaF = 0;
        String nome, sexo;
        double mediaM, mediaF;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas: ");
        rep = teclado.nextInt();

        for  (int repete = 1; repete <= rep; repete++) {
            System.out.print("Digite o nome da pessoa: ");
            nome = teclado.nextLine();
            teclado.nextLine();
            System.out.print("Digite a idade da pessoa: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Digite o sexo da pessoa, F ou M: ");
            sexo = teclado.nextLine();

            if (sexo.equalsIgnoreCase("f")) {
                somaF += idade;
                cont1++;
            }
                else {
                    somaM += idade;
                    cont2++;
                }
        }
        mediaM = (float) somaM / cont2;
        mediaF = (float) somaF / cont1;
        System.out.println("A média da idade dos homes é de "+mediaM+" e a média da idade das mulheres é de "+mediaF);
        teclado.close();
    }
}

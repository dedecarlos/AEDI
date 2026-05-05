package Etapa1;

import java.util.Scanner;

//FUNCAO: Imprime a quantidade de pontos dos times de acordo com o numero de Sets ganhos em uma partida
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX11 {
    public static void main(String[] args) {
        String equipe1, equipe2;
        int setsEquipe1, setsEquipe2, pontosEquipe1=0, pontosEquipe2=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome da equipe 1: ");
        equipe1 = teclado.nextLine();
        System.out.println("Digite o nome da equipe 2: ");
        equipe2 = teclado.nextLine();
        System.out.println("Sets ganhos pela Equipe 1: ");
        setsEquipe1 = teclado.nextInt();
        System.out.println("Sets ganhos pela Equipe 2: ");
        setsEquipe2 = teclado.nextInt();
        teclado.close();

        if (setsEquipe1 == 3 && (setsEquipe2 == 0 || setsEquipe2 == 1)) {
            pontosEquipe1 = 3;
            pontosEquipe2 = 0;
        } else if (setsEquipe2 == 3 && (setsEquipe1 == 0 || setsEquipe1 == 1)) {
            pontosEquipe2 = 3;
            pontosEquipe1 = 0;
        } else if (setsEquipe1 == 3 && setsEquipe2 == 2) {
            pontosEquipe1 = 2;
            pontosEquipe2 = 1;
        } else if(setsEquipe2 == 3 && setsEquipe1 == 2) {
            pontosEquipe2 = 2;
            pontosEquipe1 = 1;
        } else
            System.out.println("Placar inválido. Um dos times deve ter 3 sets.");

        System.out.println("Pontuação da partida:\n");
        System.out.println(equipe1 + ": " + pontosEquipe1 + " pontos");
        System.out.println(equipe2 + ": " + pontosEquipe2 + " pontos");

    }
}

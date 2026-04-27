package Etapa2;

//FUNÇAO: Calcula o resultado de uma eleiçao entre 3 candidatos, considerando a possibilidade de empate entre os 3 e votos nulos, e imprime o resultado final e um possivel segundo turno
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX05a {
    public static void main(String[] args) {
        int voto, contador1 = 0, contador2 = 0, contador3 = 0, nulos = 0, candidatoSegundoturno1 = 0, candidatoSegundoturno2 = 0;
        String nomeVencedor, nomeCandidato1 = "", nomeCandidato2 = "";
        Scanner teclado = new Scanner(System.in);

        // Primeira votação
        for (int repete = 1; repete <= 10; repete++) {
            System.out.println("Digite o numero do seu candidato: ");
            voto = teclado.nextInt();
            if (voto == 1)
                contador1++;
            else if (voto == 2)
                contador2++;
            else if (voto == 3)
                contador3++;
            else
                nulos++;
        }

        // Verificação de anulação
        if (nulos > contador1 && nulos > contador2 && nulos > contador3) {
            System.out.println("Eleição anulada");
        }

        // Resultado da primeira votação
        if (contador1 > contador2 && contador1 > contador3) {
            System.out.println("Fulano foi o ganhador");
        }
        else if (contador2 > contador1 && contador2 > contador3) {
            System.out.println("Beltrano foi o ganhador");
        }
        else if (contador3 > contador1 && contador3 > contador2) {
            System.out.println("Ciclano foi o ganhador");
        }

        // Empates → define segundo turno
        if (contador1 == contador2 && contador1 > contador3) {
            candidatoSegundoturno1 = 1; nomeCandidato1 = "Fulano";
            candidatoSegundoturno2 = 2; nomeCandidato2 = "Beltrano";
            System.out.println("Empate entre Fulano e Beltrano");
        }
        else if (contador2 == contador3 && contador2 > contador1) {
            candidatoSegundoturno1 = 2; nomeCandidato1 = "Beltrano";
            candidatoSegundoturno2 = 3; nomeCandidato2 = "Ciclano";
            System.out.println("Empate entre Beltrano e Ciclano");
        }
        else if (contador3 == contador1 && contador3 > contador2) {
            candidatoSegundoturno1 = 1; nomeCandidato1 = "Fulano";
            candidatoSegundoturno2 = 3; nomeCandidato2 = "Ciclano";
            System.out.println("Empate entre Fulano e Ciclano");
        }
        else {
            System.out.println("Empate entre os três candidatos");
        }

        // Zera contadores para o segundo turno
        contador1 = contador2 = contador3 = nulos = 0;

        // Segunda votação
        for (int repete = 1; repete <= 10; repete++) {
            System.out.println("Digite o numero do seu candidato ("+candidatoSegundoturno1+"-"+nomeCandidato1+", "+candidatoSegundoturno2+"-"+nomeCandidato2+"): ");
            voto = teclado.nextInt();
            if (voto == candidatoSegundoturno1)
                contador1++;
            else if (voto == candidatoSegundoturno2)
                contador2++;
            else
                nulos++;
        }

        // Resultado do segundo turno
        if (contador1 > contador2) {
            nomeVencedor = nomeCandidato1;
            System.out.println(nomeVencedor + " foi o vencedor");
        }
        else if (contador2 > contador1) {
            nomeVencedor = nomeCandidato2;
            System.out.println(nomeVencedor + " foi o vencedor");
        }
        else if (nulos > contador1 && nulos > contador2) {
            System.out.println("Eleição anulada");
        }
        else {
            System.out.println("Empate no segundo turno");
        }
    }
}

package Etapa1;

import java.util.Scanner;

//FUNCAO: Calcula e imprime a duracao de um jogo
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX13 {
    public static void main(String[] args) {
        int horaInicial, minutosInicial, horaFinal, minutosFinal, inicioEmMinutos, fimEmMinutos, duracao, horas, minutos;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a hora inicial: ");
        horaInicial = teclado.nextInt();
        System.out.println("Informe os minutos iniciais: ");
        minutosInicial = teclado.nextInt();
        System.out.println("Informe a hora final: ");
        horaFinal = teclado.nextInt();
        System.out.println("Informe os minutos finais: ");
        minutosFinal = teclado.nextInt();

        inicioEmMinutos = horaInicial * 60 + minutosInicial;
        fimEmMinutos = horaFinal * 60 + minutosFinal;
        duracao = fimEmMinutos - inicioEmMinutos;
        horas = duracao / 60;
        minutos = duracao % 60;

        System.out.println("Duracao: " + horas + " horas e " + minutos+ " minutos");
    }
}

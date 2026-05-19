package Etapa1;
import java.util.Scanner;

//FUNCAO: Calcula a duraccao de um evento de acordo com o tempo informado pelo usuário em segundos.
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX12 {
    public static void main(String[] args) {
        int segundos, horas, minutos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a duracao do evento em segundos: ");
        segundos = teclado.nextInt();

        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60; //Sobra da divisao das horas, dividido pelo total de minutos em 1h
        segundos = segundos % 60;
        System.out.println("O evento teve duracao de "+horas+"h, "+minutos+"min e "+segundos+"seg.");
        teclado.close();

    }
}

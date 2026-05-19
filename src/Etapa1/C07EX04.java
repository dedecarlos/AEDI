package Etapa1;

import java.util.Scanner;

//FUNCAO: Imprime o estado a que o time informado pertence
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C07EX04 {
    public static void main(String[] args) {
        String time, timeFormatado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do Time: ");
        time = teclado.next();
        timeFormatado = time.toUpperCase();
        teclado.close();

        switch (timeFormatado) {
            case "AMERICA", "ATLETICO", "CRUZEIRO", "VILLA NOVA" -> System.out.println("Minas Gerais");
            case "BOTAFOGO", "FLAMENGO", "FLUMINENSE", "VASCO" -> System.out.println("Rio de Janeiro");
            case "CORINTHIANS", "PALMEIRAS", "SANTOS", "SAO PAULO" -> System.out.println("Sao Paulo");
            case "GREMIO", "INTERNACIONAL", "JUVENTUDE" -> System.out.println("Rio Grande do Sul");
            case "NAUTICO", "SANTA CRUZ", "SPORT" -> System.out.println("Pernambuco");
        }
    }
}

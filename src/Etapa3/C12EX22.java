package Etapa3;

//FUNÇAO: Pesquisa a posicao de um carro em uma garagen de acordo com uma lista de nomes ou placas
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String placas[] = new String[100];
        String nomes[] = new String[placas.length];

        for (int aux = 0; aux < placas.length; aux++) {
            System.out.println("Digite o numero da placa do carro: ");
            placas[aux] = teclado.nextLine();
            System.out.println("Digite o nome do morador: ");
            nomes[aux] = teclado.nextLine();
        }
        System.out.println("Digite a placa ou nome do morador que deseja pesquisar: ");
        String pesquisa = teclado.nextLine();
        int pos = -1;
        for (int aux = 0; aux < placas.length; aux++) {
            if (pesquisa.equalsIgnoreCase(placas[aux]) || pesquisa.equalsIgnoreCase(nomes[aux])) {
                pos = aux;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Morador ou placa não encontrado");
        }
        else {
            System.out.println("Carro pesquisado encontra-se na vaga " + pos +1);
        }
        teclado.close();
    }
}

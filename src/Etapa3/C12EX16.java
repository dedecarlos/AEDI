package Etapa3;

//FUNÇÃO: Ordena uma lista de cidades de acordo com sua população e imprime as 10 maiores
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX16 {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        String cidades[] = new String [100], estados[] = new String [cidades.length], tempCidades, tempEstados;
        long populacao[] = new long[cidades.length], tempPop;

        for (int aux=0; aux < cidades.length; aux++) {
            System.out.println("Digite o nome da cidade " + (aux+1) + ":");
            cidades[aux] = teclado.nextLine();
            System.out.println("Digite o estado da cidade " + (aux+1) + ":");
            estados[aux] = teclado.nextLine();
            System.out.println("Digite a população da cidade " + (aux+1) + ":");
            populacao[aux] = teclado.nextLong();
            teclado.nextLine();
        }
        for (int aux=0; aux < populacao.length -1; aux++) {
            for (int aux2=0; aux2 < populacao.length -1; aux2++) {
                if (populacao[aux2] < populacao[aux2+1]) {
                    tempPop = populacao[aux2];
                    populacao[aux2] = populacao[aux2+1];
                    populacao[aux2+1] = tempPop;
                    tempCidades = cidades[aux2];
                    cidades[aux2] = cidades[aux2+1];
                    cidades[aux2+1] = tempCidades;
                    tempEstados = estados[aux2];
                    estados[aux2] = estados[aux2+1];
                    estados[aux2+1] = tempEstados;
                }
            }
        }
        for  (int aux=0; aux < 10; aux++) {
            System.out.println(cidades[aux]+", "+estados[aux]+" posição "+(aux+1)+" de maiores cidades com "+populacao[aux]+" de habitantes");
        }
        teclado.close();
    }
}

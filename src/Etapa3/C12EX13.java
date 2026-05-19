package Etapa3;

//FUNÇAO: Salva os nomes das pessoas em uma fila e imprime a posição da pessoa pesquisada
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomes[] = new String[10], nome;
        int pos = -1;

        for (int aux = 0; aux < nomes.length; aux++) {
            System.out.println("Digite o nome da pessoa na posição "+ (aux+1)+": ");
            nomes[aux] = teclado.nextLine();
        }
        System.out.println("Qual o nome deseja pesquisar? ");
        nome = teclado.nextLine();
        for (int aux = 0; aux < nomes.length; aux++) {
            if (nome.equalsIgnoreCase(nomes[aux])) {
                pos = aux;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Nenhum pessoa encontrada!");
        }
        else {
            System.out.println(nome+" está na posição "+(pos + 1)+" da fila");
        }
        teclado.close();
    }
}

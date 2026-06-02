package Etapa3;

//FUNCAO: Conta quantas pessoas possuem o nome de uma familia
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C13EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da Familia: ");
        String familia = teclado.nextLine().toUpperCase();
        int cont = 0;

        for (int aux = 0; aux < 5; aux++){
            System.out.println("Digite o nome completo da " + (aux + 1) + "º pessoa: ");
            String nomeCompleto = teclado.nextLine().toUpperCase();
            if (nomeCompleto.endsWith(familia)){
                cont++;
            }
        }
        System.out.println(cont + " possuem o nome da Familia " + familia);
        teclado.close();
    }
}

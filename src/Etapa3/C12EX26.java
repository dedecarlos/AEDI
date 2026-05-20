package Etapa3;

//FUNÇÃO: Reajuste de valores de salarios de uma lista que são abaixo de 1000
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();
        String nome;
        List<Double> salarios = new  ArrayList<Double>();
        double salario, indice, reajuste;

        do {
            System.out.println("Digite um nome (X para encerrar): ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                nomes.add(nome);
                System.out.println("Digite o sálario");
                salario = teclado.nextDouble();
                salarios.add(salario);
                teclado.nextLine();
            }
        } while (!nome.equalsIgnoreCase("X"));
        System.out.println("Qual o indice de reajuste salarial?");
        indice = teclado.nextDouble();
        for (int aux = 0; aux < salarios.size(); aux++) {
            if (salarios.get(aux) <= 1000) {
                reajuste = salarios.get(aux) * indice/100;
                salarios.set(aux, salarios.get(aux) + reajuste);
            }
        }
        for (int aux = 0; aux < salarios.size(); aux++) {
            System.out.printf(nomes.get(aux)+" tem salario de R$%.2f",salarios.get(aux));
        }
        teclado.close();
    }
}

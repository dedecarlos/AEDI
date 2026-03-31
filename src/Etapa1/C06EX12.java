package Etapa1;

import java.util.Scanner;

//FUNCAO: Calcula e imprime o valor total de custos com estocagem e embalagem de uma fabrica de bolas
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX12 {
    public static void main(String[] args) {
        int bolasProduzidas, bolasDefeito, bolasValidas, meses, caixasNecessarias, galpoesNecessarios;
        double precoCaixa, aluguelMensal, custoEmbalagem, custoEstocagem, custoTotal;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de bolas produzidas: ");
        bolasProduzidas = teclado.nextInt();
        System.out.print("Quantidade de bolas defeito: ");
        bolasDefeito = teclado.nextInt();
        System.out.print("Preço unitário da caixa de papelão: ");
        precoCaixa = teclado.nextDouble();
        System.out.print("Quantidade de meses até a Copa: ");
        meses = teclado.nextInt();
        System.out.print("Valor mensal do aluguel de um galpão: ");
        aluguelMensal = teclado.nextDouble();
        teclado.close();

        bolasValidas = bolasProduzidas -  bolasDefeito;
        caixasNecessarias = (int) Math.ceil(bolasValidas / 10.0); //Math.ceil arredonda o numero pra cima, Math.round arredonda pra cima ou pra baixo, Math.floor arredonda pra baixo
        galpoesNecessarios = (int) Math.ceil(caixasNecessarias / 850.0); //Nao esquecer de colocar casa decimal
        custoEmbalagem = caixasNecessarias * precoCaixa;
        custoEstocagem = galpoesNecessarios * aluguelMensal * meses;
        custoTotal = custoEmbalagem + custoEstocagem;

        System.out.printf("O custo total será de: R$%.2f", custoTotal);

    }
}

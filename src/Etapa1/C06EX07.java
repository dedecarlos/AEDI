package Etapa1;

import java.util.Scanner;

//FUNCAO: Calcula o valor da Participacao de Lucro de um funcionario de acordo com o seu salario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX07 {
    public static void main(String[] args) {
        double salario, PLbruto, PLliquido, impRenda;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do Sálario: ");
        salario = teclado.nextDouble();
        teclado.close();

        if (salario <= 300) {
            PLbruto = 500 + (salario * 0.7);
            impRenda = PLbruto * 0.25;
            PLliquido = PLbruto - impRenda;
            System.out.printf("A Participacao de Lucro liquida é de: R$%1.2f ", PLliquido);
        } else if (salario <= 1000) {
            PLbruto = 200 + (salario * 0.5);
            impRenda = PLbruto * 0.25;
            PLliquido = PLbruto - impRenda;
            System.out.printf("A Participacao de Lucro liquida é de: R$%1.2f ", PLliquido);
        } else {
            PLbruto = salario * 0.3;
            impRenda = PLbruto * 0.25;
            PLliquido = PLbruto - impRenda;
            System.out.printf("A Participacao de Lucro liquida é de: R$%1.2f ", PLliquido);
        }
    }
}
package Etapa2;

//FUNÇÃO: Calcula e imprime o valor total e media dos proutos
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args) {
        double valores, valorTotal = 0, media;
        int soma = 0, cont = 0, quantAcima1000 = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 0 para encerrar o programa");
        do {
            System.out.println("Digite o valor do primeiro serviço: ");
            valores = teclado.nextDouble();
            if (valores != 0) {
                valorTotal += valores;
                cont++;
                if (valores >= 1000) {
                    quantAcima1000++;
                }
            }
        } while (valores != 0);
        media = valorTotal / cont;
        System.out.printf("O valor total recebido é de: R$%1.2f",valorTotal);
        System.out.println("\nA média dos valores recebidos é de: R$"+media);
        System.out.println("A  quantidade de valores acima de R$1000,00 é: "+quantAcima1000);
        teclado.close();
    }
}

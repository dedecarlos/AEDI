package Etapa1;

import java.util.Scanner;

//FUNCAO: Calcula e imprime os valores da multa de acordo com a quantidade de imposto paga e os dias em atraso
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C07EX03 {
    public static void main(String[] args) {
        int diasAtraso;
        double imposto, multa;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do imposto: ");
        imposto = teclado.nextDouble();
        System.out.println("Digite os dias de atraso: ");
        diasAtraso = teclado.nextInt();
        teclado.close();

        switch (diasAtraso) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Isento de multa");
                break;
                case 6: case 7: case 8:
                    multa = (int) (imposto * 0.02);
                System.out.printf("O valor da multa é de: R$%.2f", multa);
                break;
                case 9: case 10:
                        multa = (int) (imposto * (0.1 + (0.005 * diasAtraso)));
                System.out.printf("O valor da multa é de: R$%.2f", multa);
                break;
                default:
                    multa = (int) (imposto * 1.5 + (1 * diasAtraso));
                    System.out.printf("O valor da multa é de: R$%.2f", multa);
        }
    }
}

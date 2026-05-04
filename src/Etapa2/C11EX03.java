package Etapa2;

//FUNÇÃO: Calcula o valor total de multas e pontos aplicados pelo detran de uma cidade
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX03 {
    static void main() {
        int dia, pontos, cont = 0;
        double multa, somaMulta = 0;
        String placa;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o dia da multa");
        dia = teclado.nextInt();
        while (dia != 99) {
            System.out.println("Digite a placa: ");
            placa = teclado.next();
            teclado.nextLine();
            System.out.println("Digite o numero de pontos: ");
            pontos = teclado.nextInt();
            if (pontos == 3) {
                multa = 42;
                System.out.printf("O valor da multa da placa " + placa + ", com " + pontos + " pontos é de: R$%1.2f" , multa);
                System.out.println();
                somaMulta += multa;
            } else if (pontos == 5) {
                multa = 108;
                System.out.printf("O valor da multa da placa " + placa + ", com " + pontos + " pontos é de: R$%1.2f" , multa);
                System.out.println();
                somaMulta += multa;
            } else if (pontos == 8) {
                multa = 479;
                System.out.printf("O valor da multa da placa " + placa + ", com " + pontos + " pontos é de: R$%1.2f" , multa);
                System.out.println();
                somaMulta += multa;
                if (pontos == 8 && dia <= 15)
                    cont++;
            }
            System.out.println("Digite o dia da multa");
            dia = teclado.nextInt();
        }
        System.out.println("A quantidade de multas de pontuação 8 da primeira quinzena do mes é: " + cont);
        System.out.printf("O valor total arrecadado com multas é: R$%1.2f", somaMulta);
        teclado.close();
    }
}

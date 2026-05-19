package Etapa1;

import java.util.Scanner;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX15 {
    public static void main(String[] args) {
        int codigoPacote, diasPPV;
        double extras, valorFixo=0, valorPPV=0, impostos=0, subtotal, valorImposto, total;
        String cidade;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o código do pacote (1-Basic, 2-Advanced, 3-Premium): ");
        codigoPacote = teclado.nextInt();
        System.out.print("Digite a quantidade de dias de consumo de canais pay-per-view: ");
        diasPPV = teclado.nextInt();
        System.out.print("Digite o valor dos serviços extras: ");
        extras = teclado.nextDouble();
        System.out.print("Digite a cidade do assinante: ");
        cidade = teclado.next();
        teclado.close();

        if (codigoPacote == 1) { // Basic
            valorFixo = 65.00;
            valorPPV = diasPPV * 1.20;
            if (valorPPV > 65.00) {
                valorPPV = 65.00; // limite
            }
        }
        if (codigoPacote == 2) { // Advanced
            valorFixo = 104.00;
            valorPPV = diasPPV * 2.10;
        }
        if (codigoPacote == 3) { // Premium
            valorFixo = 137.00;
            valorPPV = 0; // isento
        }

        // Pacotes (Tabela 1)
        if (codigoPacote == 1) { // Basic
            if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                impostos = 0.00;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
            if (cidade.equalsIgnoreCase("Sao Paulo")) {
                impostos = 0.01;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
            if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                impostos = 0.015;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
            else {
                impostos = 0.02;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
        }
        // Pacotes (Tabela 2)
        if (codigoPacote == 2) { // Advanced
            if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                impostos = 0.00;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
            if (cidade.equalsIgnoreCase("Sao Paulo")) {
                impostos = 0.01;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
            if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                impostos = 0.015;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            } else {
                impostos = 0.02;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
        }
        // Pacotes (Tabela 3)
        if (codigoPacote == 3) { // Premium
            if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                impostos = 0.00;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
            if (cidade.equalsIgnoreCase("Sao Paulo")) {
                impostos = 0.01;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
            if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                impostos = 0.015;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            } else {
                impostos = 0.02;
                total = valorFixo + valorPPV + extras + impostos / (valorFixo + valorPPV + extras);
                System.out.printf("Valor da conta: R$%.2f", total);
            }
        }
    }
}

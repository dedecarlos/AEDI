//ANGELO CARLOS MACHADO SANTOS

package PROVA;

import java.text.NumberFormat;
import java.util.Scanner;

public class D29752C {
    public static void main(String[] args) {
        double taxaResidencial, quantPulsos, gastosPulsos, ISS, valorConta;
        String valorContaStr;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da taxa residencial: ");
        taxaResidencial = teclado.nextDouble();
        System.out.println("Digite o valor da quantidade de pulsos consumido: ");
        quantPulsos = teclado.nextDouble();
        teclado.close();

        if (quantPulsos <= 100) {
            gastosPulsos = 0;
        } else if (quantPulsos <= 1000) {
            gastosPulsos = 100;
        } else {
            gastosPulsos = quantPulsos * 0.05;
        }

        //Calcula o valor do ISS
        ISS = (taxaResidencial + gastosPulsos) * 0.06;

        //Calcula o valor da conta
        valorConta = taxaResidencial + gastosPulsos + ISS;

        //Converte a variavel valorConta para String para usar a configuração de moeda  do computador
        valorContaStr = NumberFormat.getCurrencyInstance().format(valorConta);

        //Imprime o valor da conta
        System.out.println("Valor da conta: " + valorContaStr);
    }
}

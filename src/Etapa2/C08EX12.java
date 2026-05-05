package Etapa2;

//FUNÇÃO: Calcula o faturamento total de uma empresa de acordo com a quantidade de vendas dos produtos
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.text.NumberFormat;
import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args) {
        int codigoProduto, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
        double faturamento;
        String faturamentoFormatado;

        Scanner teclado = new Scanner(System.in);

        for (int repete = 1; repete <= 11; repete++) {
            System.out.print("Digite o codigo do produto: ");
            codigoProduto = teclado.nextInt();

            if (codigoProduto == 1) {
                contador1++;
            }
            else if (codigoProduto == 2) {
                contador2++;
            }
            else if (codigoProduto == 3) {
                contador3++;
            }
            else if (codigoProduto == 4) {
                contador4++;
            }
            else
                contador5++;
        }
        faturamento = (float) contador1 * 1565 + contador2 * 1890 + contador3 * 2150 + contador4 * 2963 + contador5 * 3750;
        faturamentoFormatado = NumberFormat.getCurrencyInstance().format(faturamento); //Usa a configuração atual do Windows para moedas
        System.out.println("Faturamento: " + faturamento);
        teclado.close();
    }
}

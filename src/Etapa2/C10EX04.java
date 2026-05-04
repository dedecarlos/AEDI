package Etapa2;

//FUNCAO: Calcula diversos parametros de acordo com dados informados pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args) {
        double taxaBDI, bdi, precoUnitario, custoParcial, custoTotal = 0, precoFinal;
        int quantidade;
        String nomeMaterial;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da taxa do BDI: ");
        taxaBDI = teclado.nextInt();
        System.out.println("Digite 'FIM' para encerrar");

        do {
            System.out.println("Material: ");
            nomeMaterial = teclado.nextLine();
            teclado.nextLine();
            if (!nomeMaterial.equalsIgnoreCase("FIM")) {
                System.out.println("Quantidade: ");
                quantidade = teclado.nextInt();
                System.out.println("Preço Unitario: ");
                precoUnitario = teclado.nextDouble();
                custoParcial = quantidade * precoUnitario;
                custoTotal += custoParcial;
                System.out.printf("Custo Parcial = R$%1.2f", custoTotal);
                System.out.println();
            }
        } while (!nomeMaterial.equalsIgnoreCase("FIM"));
        bdi = custoTotal * (taxaBDI / 100);
        precoFinal = custoTotal + bdi;
        System.out.printf("O custo total é de: R$%1.2f", custoTotal);
        System.out.println();
        System.out.printf("O BDI é de: R$%1.2f", bdi);
        System.out.println();
        System.out.printf("O preço final é: R$%1.2f", precoFinal);
        teclado.close();
    }
}

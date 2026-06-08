package Etapa3;

import java.util.Scanner;

public class C13EX01extra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu salario: ");
        double salario = teclado.nextDouble();
        while (salario != 0) {
            System.out.println("Informe o numero de dependentes: ");
            int dependentes = teclado.nextInt();
            double imposto = calculoImposto(salario, dependentes);
            System.out.println(imposto);
            System.out.println("Informe o seu salario: ");
            salario = teclado.nextDouble();
        }
        teclado.close();
    }
    public static double calculoImposto(double salario, int dependentes) {
        double imposto;
        if (salario <= 1000) {
            imposto = 0;
            System.out.println("Isento de imposto");
        }
        else if (salario <= 5000) {
            imposto = (salario - (dependentes * 150)) * 0.1;
            System.out.println("O valor do imposto a ser pago é: ");
        }
        else if (salario <= 10000) {
            imposto = (salario - (dependentes * 150)) * 0.15;
            System.out.println("O valor do imposto a ser pago é: ");
        }
        else {
            imposto = (salario - (dependentes * 150)) * 0.2;
            System.out.println("O valor do imposto a ser pago é: ");
        }
        return imposto;
    }
}

package Etapa2;

//FUNÇAO: Calcula a folha de pagamentos e premio de produtividade de uma empresa
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX08 {
    public static void main() {
        String nome, nomeMaiorSalario = "", cargo, cargoMaiorSalario = "";
        int horasTrabalhadas, valorHoraTrabalhada = 10, premioProdutividade = 0, somaHoras = 0, contFuncionarios = 0, mediaHorasTrabalhadas, contAte100 = 0, contAte500 = 0, contMais500 = 0;
        double totalReceber = 0, totalPagamento = 0, maiorSalario = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite o nome do funcionario: ");
            nome = teclado.next();
            System.out.println("Digite o cargo do funcionario: ");
            cargo = teclado.next();
            System.out.println("Digite a quantidade de horas trabalhadas: ");
            horasTrabalhadas = teclado.nextInt();
            contFuncionarios++;
            somaHoras += horasTrabalhadas;
            if (horasTrabalhadas <= 100){
                premioProdutividade = 1000;
                contAte100++;
            } else if (horasTrabalhadas <= 500){
                premioProdutividade = 10 * horasTrabalhadas;
                contAte500++;
            } else {
                premioProdutividade = (horasTrabalhadas / 10) * 100;
                contMais500++;
            }
            totalReceber = horasTrabalhadas * valorHoraTrabalhada + premioProdutividade;
            System.out.printf(nome+ " receberá RS%1.2f", totalReceber);
            if (contFuncionarios == 1 || totalReceber > maiorSalario){
                maiorSalario = totalReceber;
                nomeMaiorSalario = nome;
                cargoMaiorSalario = cargo;
            }
            totalPagamento += totalReceber;
        } while (!nome.equalsIgnoreCase("Angelo"));
        mediaHorasTrabalhadas = somaHoras / contFuncionarios;
        System.out.println("A média de horas trabalhadas é: " + mediaHorasTrabalhadas);
        System.out.println(nomeMaiorSalario+", "+cargoMaiorSalario+" tem o maior salario");
        System.out.println(contAte100+" funcionario(s) com premio até 100h\n"+contAte500+" funcionario(s) com premio até 500h\n"+contMais500+" funcionario(s) com premio mais de 500h");
        System.out.printf("O valor total da folha de pagamentos é R$%1.2f",totalPagamento);
        teclado.close();
    }
}

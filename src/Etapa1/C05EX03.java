package Etapa1;
import java.util.Scanner;

//FUNÇÃO: Calcula o valor do salario liquido e do imposto de renda da pessoa de acordo com o valor do sálario e do número de dependentes
//ALUNO: ANGELO CARLOS MACHADO SANTOS

public class C05EX03 {
    public static void main(String[] args) {

        double salario, numDependentes, salLiquido, impRenda;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do seu Salario: ");
        salario = teclado.nextDouble();
        System.out.print("Digite o número de Dependentes: ");
        numDependentes = teclado.nextDouble();

        salLiquido = salario - (numDependentes * 60.00);
        impRenda = salLiquido * 0.15;

        System.out.printf("Salario Líquido R$%.2f", salLiquido);
        System.out.printf("\nImposto de Renda R$%.2f", impRenda);
        teclado.close();

    }
}

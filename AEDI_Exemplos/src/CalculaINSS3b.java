import java.util.Scanner;

public class CalculaINSS3b {
    public static void main(String[] args) {
        double salario, inss;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor do seu salário: ");
        salario = teclado.nextDouble();
        inss = salario * 8 / 100;
        System.out.printf("O valor do INSS = R$%1.2f",inss);
        teclado.close();
    }
}

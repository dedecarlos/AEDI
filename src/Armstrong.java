import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int original = num;
        int soma = 0;

        // Conta quantos dígitos o número tem
        int temp = num;
        int qtdDigitos = 0;
        while (temp > 0) {
            qtdDigitos++;
            temp /= 10;
        }

        // Calcula a soma dos dígitos elevados à quantidade de dígitos
        temp = num;
        while (temp > 0) {
            int digito = temp % 10;
            int potencia = 1;
            int i = 0;
            while (i < qtdDigitos) {
                potencia *= digito;
                i++;
            }
            soma += potencia;
            temp /= 10;
        }

        // Verifica se é Armstrong
        if (soma == original) {
            System.out.println(original + " é um número de Armstrong.");
        } else {
            System.out.println(original + " não é um número de Armstrong.");
        }

        sc.close();
    }
}

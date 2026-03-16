import java.util.Scanner;

//FUNCAO: Calcula o valor de F(x) de acordo com o valor de X dado pelo usuário
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX07 {

    public static void main(String[] args) {
        int x;
        double fx;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        x = teclado.nextInt();
        teclado.close();

        fx = Math.sqrt(Math.pow((x / 4.0 + 1), 2) + (1 / 5.0) * x); //Nao esquecer de colocar decimal na formula, senao o resultado será numero inteiro

        System.out.println("O valor da função de X é: " + fx);
    }
}

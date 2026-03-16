import java.util.Scanner;

//FUNÇÃO: Calcula o valor de X dado pelo usuário
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX01 {
    public static void main(String[] args) {
        double valorX, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        valorX = teclado.nextDouble();

        fx = Math.pow(valorX,3) + (4 * valorX) +10; //fx: X^3 + 4X + 10

        System.out.print("X = "+fx);
        teclado.close();

    }
}

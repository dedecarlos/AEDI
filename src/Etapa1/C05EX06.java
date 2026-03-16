import java.util.Scanner;

//FUNÇÃO: Calcula a distancia com os valores informados pelo usuário das varives A, B, C, x, y
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX06 {
    public static void main(String[] args) {

        int A, B, C, x, y, R;
        double distancia;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = teclado.nextInt();
        System.out.println("Digite o valor de B: ");
        B = teclado.nextInt();
        System.out.println("Digite o valor de C: ");
        C = teclado.nextInt();
        System.out.println("Digite o valor de X: ");
        x = teclado.nextInt();
        System.out.println("Digite o valor de Y: ");
        y = teclado.nextInt();
        teclado.close();

        R = A * x + B * y + C;
        distancia = R / Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));

        System.out.println(distancia);

    }
}

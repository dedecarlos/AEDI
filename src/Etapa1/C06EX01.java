package Etapa1;
import java.util.Scanner;

//FUNCAO: Calcula o valor de F(x) dado o valor de X.
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX01 {
    public static void main(String[] args) {
        double x, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        x = teclado.nextInt();
        teclado.close();

        //Calcula o valor de F(x)
        if (x < 4) {
            fx = ((5 * x) + 3 )/ Math.sqrt(16 - Math.pow(x,2));
            System.out.println("O valor de F(x) = " +fx);
        }
        else {
            if (x == 4) {
                fx = 0;
                System.out.println("O valor de F(x) = "+fx);
            }
            else {
                fx = ((5 * x) + 3 )/ Math.sqrt(Math.pow(x,2.0) - 16);
                System.out.println("O valor de F(x) = " +fx);
            }
        }

    }
}

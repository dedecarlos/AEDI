package Etapa1;
import java.util.Scanner;

//FUNÇÃO: Calcula o valor da distância de acordo com os valores de X e Y
//ALUNO: ANGELO CARLOS MACHADO SANTOS

public class C05EX04 {
    public static void main(String[] args) {

        int x1, y1, x2, y2;
        double distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor de X: ");
        x1 = teclado.nextInt();
        System.out.println("Digite o primeiro valor de Y: ");
        y1 = teclado.nextInt();
        System.out.println("Digite o segundo valor de X: ");
        x2 = teclado.nextInt();
        System.out.println("Digite o segundo valor de Y: ");
        y2 = teclado.nextInt();

        distancia =  Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.println("Distância: "+distancia);
        teclado.close();
    }
}

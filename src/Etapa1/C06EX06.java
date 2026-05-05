package Etapa1;
import java.util.Scanner;

//FUNÇÃO: Calcula e imprime se haverá raizes ou não
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX06 {
    public static void main(String[] args) {
        double delta, raiz1, raiz2, a, b, c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a =  teclado.nextDouble();
        System.out.println("Digite o valor de B: ");
        b =  teclado.nextDouble();
        System.out.println("Digite o valor de C: ");
        c =  teclado.nextDouble();
        teclado.close();

        delta = Math.pow(b, 2) - (4 * a * c);


        if (delta > 0){
            raiz1 = ((-b + Math.sqrt(delta)) / (2.0 * a));
            raiz2 = ((-b - Math.sqrt(delta)) / (2.0 * a));
            System.out.println("Teremos 2 raizes: "+raiz1+", "+raiz2);
        }
        else if (delta == 0){
            raiz1 = ((-b + Math.sqrt(delta)) / (2.0 * a));
            System.out.println("Teremos 1 raiz: "+raiz1);
        }
        else
            //delta < 0
            System.out.println("Não teremos raizes");

    }
}

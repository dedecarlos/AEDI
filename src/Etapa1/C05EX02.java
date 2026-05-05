package Etapa1;
import java.util.Scanner;

//FUNCAO: Calcula o valor da area e o volume de acordo com o valor do Raio dado pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX02 {
    public static void main(String[] args) {

        double area, volume, raio;
        Scanner input = new Scanner(System.in);
        System.out.print("Raio: ");
        raio = input.nextDouble();

        area = 4 * 3.1416 * Math.pow(raio, 2);
        volume = 4 * 3.1416 * Math.pow(raio, 3) / 3.0;
        System.out.println("Area = " + area); //Se usar o printf aqui ele arredonda-rá o resultado final
        System.out.printf("\nVolume: %1.1f", volume);
        input.close();
    }
}

package Etapa1;
import java.util.Scanner;

//FUNÇÃO: Calcula os valores de Fahrenheit e Kelvin pelo valor dado de celcius
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX05 {
    public static void main(String[] args) {

        int celcius, kelvin, fahrenheit;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius: ");
        celcius = teclado.nextInt();

        kelvin = celcius + 273;
        fahrenheit = (celcius * 9 + 160) / 5;

        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin : " + kelvin);

        teclado.close();

    }
}

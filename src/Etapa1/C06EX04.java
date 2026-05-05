package Etapa1;

import java.util.Scanner;

//FUNÇÃO: Calcula o IMC da pessoa e imprime uma mensagem informando se o peso é ideal ou não
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX04 {
    public static void main(String[] args) {
        double altura, peso, IMC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = teclado.nextDouble();
        teclado.close();

        IMC = peso / Math.pow(altura, 2.0);
        if (IMC <= 18)
            System.out.println("Pessoa está desnutrida");
        else if (IMC <= 20)
            System.out.println("Pessoa está abaixo do peso");
        else if (IMC <= 25)
            System.out.println("Pessoa está no peso ideal");
        else if (IMC <= 27)
            System.out.println("Pessoa está acima do peso");
        else
            System.out.println("Pessoa está obesa");
    }
}

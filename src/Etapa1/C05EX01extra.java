package Etapa1;
import java.util.Scanner;

//FUNCAO: O programa olha um numero dado pelo usuario e compara para ver se é um palindromo
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX01extra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero de 4 digitos: ");
        numero = teclado.nextInt();

        //Converte a variavel int para String
        String numStr = String.valueOf(numero);

        //Inverte o numero para a comparacao
        String invertido = new StringBuilder(numStr).reverse().toString();

        //Compara se sao palindromos
        if (numStr.equals(invertido)) {
            System.out.println("O numero "+numero+" é um palindromo");
        }
        else {
            System.out.println("O numero "+numero+" nao é um palindromo");
        }
    }
}

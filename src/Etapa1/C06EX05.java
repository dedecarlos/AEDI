package Etapa1;
import java.util.Scanner;

//FUNÇÃO: Imprime se um número é divisivel, simultaneamente, por 2 numeros diferentes
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX05 {
    public static void main(String[] args) {
        int num, num1=5, num2=7, resto1, resto2, result;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        num = teclado.nextInt();
        teclado.close();

        //Calcula o resto para cada numero e salva em sua variavel
        resto1 = num % num1;
        resto2 = num % num2;

        //Compara se os dois resultados do resto são iguais a 0 para dar a resposta
        if (resto1 == 0 &&  resto2 == 0)
            System.out.println(num+" é divisivel simultaneamente por 5 e 7");
        else
            System.out.println(num+" não é divisivel simultaneamente por 5 e 7");
    }
}

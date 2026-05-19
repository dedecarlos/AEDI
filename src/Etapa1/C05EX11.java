package Etapa1;
import java.util.Scanner;

//FUNCAO: Calcula os números do banco, agencia e sequencial de acordo com o número informado pelo usuário, usando divisao e sobra.
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX11 {
    public static void main(String[] args) {
    int numCheque, banco, agencia, sequencial;

    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número do Cheque: ");
        numCheque = teclado.nextInt();

        banco = numCheque / 10000 / 100;
        agencia =  numCheque / 1000 % 1000;
        sequencial = numCheque % 1000;

        System.out.println("Banco: "+banco+"\n");
        System.out.println("Agência: "+agencia+"\n");
        System.out.println("Sequencial: "+sequencial);
        teclado.close();

    }
}

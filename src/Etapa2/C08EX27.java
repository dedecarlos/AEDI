package Etapa2;

//FUNCAO: Imprime uma sequencia de caracteres onde cada linha dobra o valor da linha anterior ate 128 e depois decresce pela metade
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX27 {
    public static void main(String[] args) {
        String simbolo = "*";

        for (int aux3 = 1; aux3 <= 10; aux3++) {
            for (int aux2 = 1; aux2 <= 128; aux2 *= 2) { //dobra o valor de aux2
                for (int aux = 1; aux <= aux2 ; aux++)
                    System.out.print(simbolo);
                System.out.println();
                }
            for (int aux2 = 64; aux2 >= 1; aux2 /= 2) { //64 porque a sequencia nao repete a linha com 128
                for  (int aux = 1; aux <= aux2; aux++)
                    System.out.print(simbolo);
                System.out.println();
            }
        }
    }
}
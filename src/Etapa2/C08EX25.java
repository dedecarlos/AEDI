package Etapa2;

//FUNCAO: Imprime uma sequencia com o simbolo '*'
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX25 {
    public static void main(String[] args) {
        String simbolo = "*";
        for (int aux3 = 1; aux3 <= 10; aux3++) {
            for (int aux2 = 1; aux2 <= 10; aux2++) {
                for (int aux = 1; aux <= aux2; aux++)
                    System.out.print(simbolo);
                System.out.println();
            }
            for (int aux2 = 10; aux2 >= 1; aux2--) {
                for (int aux = 1; aux <= aux2; aux++)
                    System.out.print(simbolo);
                System.out.println();
            }
        }
    }
}

package Etapa2;

//FUNCAO: Imprime uma sequencia com o simbolo '*' com espaços extras em cada linha
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX26 {
    public static void main(String[] args) {
        String simbolo = "*";

        for (int aux = 1; aux <= 10; aux++) {
            for (int aux2 = 1; aux2 <= 10; aux2++) {
                for (int aux3 = 1; aux3 <= aux2; aux3++){
                    System.out.print(" ");
                }
                System.out.print(simbolo);
                System.out.println();
            }
            for (int aux2 = 10; aux2 >= 1; aux2--) {
                for (int aux3 = 1; aux3 <= aux2; aux3++){
                    System.out.print(" ");
                }
                System.out.print(simbolo);
                System.out.println();
            }
        }
    }
}

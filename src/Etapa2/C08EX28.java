package Etapa2;

//FUNÇÃO: Calcula se um numero é triangular ou não
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX28 {
    public static void main(String[] args) {
        int  mult = 0, media = 0, soma = 0, cont = 0;
        for (int aux = 1; aux <= 1000; aux++) {
            for (int aux2 = 1; aux2 <= aux; aux2++) {
                mult =  aux2 * (aux2 + 1) *  (aux2 + 2); //A formula pra saber se  é triangular é x * x+1 * x+2
                if (mult == aux) {
                    System.out.println(aux + " é um numero triangular");
                    soma += aux;
                    cont++;
                }
            }
        }
        media = soma / cont;
        System.out.println("A média é " +media);
    }
}

package Etapa2;

//FUNÇÃO: Checa se um numero é ou não palindromo e calcula e imprime o resultado da media dos palindromos
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX23 {
    public static void main(String[] args) {
        int num, dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, cont = 0, soma = 0, media = 0;

        System.out.println("São palíndromos:");

        for (int aux = 1000; aux <= 9999; aux++) {
            dig1 = aux / 1000;
            dig2 = aux / 100 % 10;
            dig3 = aux / 10 % 10;
            dig4 = aux % 10;
            if (dig1 == dig4 && dig2 == dig3){
                soma += aux;
                cont++;
                System.out.println(aux);
            }
        }
        media = soma / cont;
        System.out.println("A média é "+media);
    }
}

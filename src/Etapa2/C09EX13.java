package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX13 {
    public static void main(String[] args) {
        double num = 1, denom, serie = 0;

        for (int aux = 1; aux <= 10; aux++) {
            num *= aux;                         //Calcula o fatorial
            denom = Math.pow(2, aux) - 1;
            if (aux % 2 == 0)
                serie -= num / denom;
            else
                serie += num / denom;
        }
        System.out.println(serie);
    }
}

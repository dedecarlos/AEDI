package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX12 {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 10000; aux++) {
            num = 1;
            denom = aux * 2 - 1;
            if (aux % 2 == 0) {
                serie -= num / denom;
            }
            else {
                serie += num / denom;
            }
        }
        serie = 4 * serie;
        System.out.println(serie);
    }
}

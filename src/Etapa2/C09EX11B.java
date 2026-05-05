package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX11B {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux * 3 - 2;
            denom = Math.sqrt(aux * 3 + 4);
            serie += num / denom;
        }
        serie = 5.0 / 3 * serie;
        System.out.println(serie);
    }
}

package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX11E {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = Math.pow(aux, 2) * Math.sqrt(aux * 2 + 3);
            denom = Math.pow(aux + 1, aux);
            serie += num / denom;
        }
        serie = 2.0 / 3 * serie;
        System.out.println(serie);
    }
}

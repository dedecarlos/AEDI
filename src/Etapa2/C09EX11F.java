package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX11F {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = (aux * 2 - 1) * Math.pow(2, aux + 1);
            denom = Math.pow(aux * 5 - 3, 2);
            serie += num / denom;
        }
        serie = 5 * Math.sqrt(serie);
        System.out.println(serie);
    }
}

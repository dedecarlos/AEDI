package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX11A {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux + aux * 7 - 6;
            denom = Math.pow(4, aux - 1);
            serie += num / denom;
        }
        serie = Math.cbrt(serie);
        System.out.println(serie);
    }
}

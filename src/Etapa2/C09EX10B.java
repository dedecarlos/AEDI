package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX10B {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux * 2;
            denom = aux * 3;
            serie += num / denom;
        }
        serie = 1 + Math.sqrt(serie);
        System.out.println(serie);
    }
}

package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX10D {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux + (aux - 1);
            denom = Math.pow(aux, 2);
            serie += num / denom;
        }
        System.out.println(serie);
    }
}

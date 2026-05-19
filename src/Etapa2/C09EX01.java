package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS


public class C09EX01 {
    public static void main(String[] args) {
        double num, denom, serie = 0;

        for (int aux = 37; aux >= 1; aux--) {
            num = aux * (aux + 1);
            denom = 38 - aux;
            serie += num / denom;
        }
        System.out.println(serie);
    }
}

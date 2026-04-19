package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX07 {
    public static void main(String[] args) {
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 6; aux++) {
            num = (2 * aux - 2) + aux * 3;
            denom = aux * 6 + 1;
            serie += num / denom;
        }
        System.out.println(serie);
    }
}

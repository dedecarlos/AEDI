package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C09EX11C {
    public static void main(String[] args){
        double num, denom, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = (aux * 2 + 1) * Math.sqrt(aux * 4 + 1);
            denom = Math.pow(5, aux);
            serie += num / denom;
        }
        serie = Math.pow(serie, 2);
        System.out.println(serie);
    }
}

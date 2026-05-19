package Etapa2;

//FUNÇÃO: Calcula e imprime o valor de uma serie numerica e a quantidade de termos para alacancar o valor
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C11EX14 {
    public static void main(String[] args) {
        int termos = 1;
        double num, denom, serie = 0;


        for (int aux = 1; aux <= termos; aux++) {
            num = 1;
            denom = aux * 2 - 1;
            if (aux % 2 == 0) {
                serie -= num / denom;
            }
            else {
                serie += num / denom;
            }
            //verifica se o valor parcial da serie esta entre os valores para encontrar o pi de 3.1416 ou 3.1417 (pi/4)
            if (serie < 0.7854 || serie > 0.785425) {
                //senao incrementa o contador em mais 1 e continua
                termos++;
                continue;
            }
        }
        serie = 4 * serie;
        System.out.println(serie);
        System.out.println(termos);
    }
}

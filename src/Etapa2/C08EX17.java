package Etapa2;

//FUNÇÃO: Calcula o valor de uma função, com X variando entre 3 e 12
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX17 {
    public static void main(String[] args) {
        double fx;

        for (int aux = 3; aux <= 12; aux++) {
            fx = Math.sqrt(Math.pow(aux,2) - 3);
            System.out.println("X = "+aux+" f(x) = "+fx);
        }
    }
}

package Etapa2;

//FUNCAO: Calcula e imprime o valor de uma serie indo ate a potencia 99
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX24 {
    public static void main(String[] args) {
        double serie, soma = 0, potencia;

        for (int aux = 1; aux <= 99; aux+=2) {
            potencia = Math.pow(2, aux);
            soma += potencia;
        }
        serie = (1.0/3) * soma;
        System.out.println("Serie: "+serie);
    }
}

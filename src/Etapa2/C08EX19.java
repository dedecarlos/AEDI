package Etapa2;

//FUNÇÃO: Calcula a soma dos 100 primeiros valores da progressao numerica
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX19 {
    public static void main(String[] args) {
        int progressao = 0, soma = 0;

        for (int i = 1; i <= 100; i++) {
            progressao = i * i;
            soma += progressao;
            System.out.println(progressao);
        }
        System.out.println("Soma: " + soma);
    }
}

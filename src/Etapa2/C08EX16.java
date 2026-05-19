package Etapa2;

//FUNÇÃO: Calcula a media de numeros impares dentro do intervalo de 1000 a 2000
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX16 {
    public static void main(String[] args) {
        int soma = 0, cont = 0;
        long media = 0;

        for (int i = 1000; i <= 2000; i++) {
            if (i % 2 != 0 ) {
                soma += i;
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("A média de números impares dentro do intervalo de 1000 a 2000 = "+media);
    }
}

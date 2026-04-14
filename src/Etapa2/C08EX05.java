package Etapa2;

//FUNÇAO: Calcula o resultado de uma eleiçao entre 3 candidatos e imprime o resultado
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

//FUNÇÃO: Calcula e imprime o candidato vencedor em uma eleição usando 'for' 'contadores'
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C08EX05 {
    public static void main(String[] args) {
        int voto, contador1=0, contador2=0, contador3=0;
        Scanner teclado = new Scanner(System.in);

        for (int repete = 1; repete <= 100; repete++ ) {
            System.out.println("Digite o numero do seu candidato: ");
            voto = teclado.nextInt();
            if (voto == 1)
                contador1++;
            else if (voto == 2)
                contador2++;
            else if (voto == 3)
                contador3++;
        }
        if (contador1 > contador2 && contador1 > contador3) {
            System.out.println("Fulano foi o ganhador");
            System.out.println("A quantidade de votos do candidato venccedor foi: " + contador1 +
                    "\nA quantidade de votos do candidato Ciclano foi:" + contador2 +
                    "\nA quantidade de votos do candidato Beltrano foi: " + contador3);
        }
        else if (contador2 >  contador3 && contador2 > contador1) {
            System.out.println("Ciclano foi o ganhador");
            System.out.println("A quantidade de votos do candidato venccedor foi: " + contador2 +
                    "\nA quantidade de votos do candidato Fulano foi:" + contador1 +
                    "\nA quantidade de votos do candidato Beltrano foi: " + contador3);
        }
        else {
            System.out.println("Beltrano foi o ganhador");
            System.out.println("A quantidade de votos do candidato venccedor foi: " + contador3 +
                    "\nA quantidade de votos do candidato Ciclano foi:" + contador2 +
                    "\nA quantidade de votos do candidato Fulano foi: " + contador1);
        }
        teclado.close();
    }
}

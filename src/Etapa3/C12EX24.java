package Etapa3;

//FUNÇAO: Pesquisa a posicao e classificacao de times em uma tabela de campeonato
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String times[] = new String[20], temp_time;
        int pontuacao[] = new int[times.length], temp_pont;

        for (int aux = 0; aux < times.length; aux++) {
            System.out.println("Digite o time: ");
            times[aux] = teclado.nextLine();
            System.out.println("Digite a pontuação final do time: ");
            pontuacao[aux] = teclado.nextInt();
            teclado.nextLine();
        }
        for (int aux = 0; aux < times.length - 1; aux++) {
            for (int aux2 = 0; aux2 < times.length - 1; aux2++) {
                if  (pontuacao[aux2] < pontuacao[aux2 + 1]) {
                    temp_pont = pontuacao[aux2];
                    pontuacao[aux2] = pontuacao[aux2 + 1];
                    pontuacao[aux2 + 1] = temp_pont;
                    temp_time = times[aux2];
                    times[aux2] = times[aux2 + 1];
                    times[aux2 + 1] = temp_time;
                }
            }
        }
        System.out.println("Qual time deseja pesquisar? ");
        String time = teclado.next();
        int pos = -1;
        for (int aux = 0; aux < times.length; aux++) {
            if (times[aux].equalsIgnoreCase(time)) {
                pos = aux;
                break;
            }
        }
        if (pos +1 <= 4) {
            System.out.println(time + " esta na posição " + (pos + 1) + " e classificado para Libertadores");
        } else if (pos + 1 <= 12) {
            System.out.println(time + " esta na posição " + (pos + 1) + " e classificado para Sul-americana");
        } else {
            System.out.println(time  + " esta na posição " + (pos + 1) + " e Rebaixado");
        }
        teclado.close();
    }
}

package Etapa2;

//FUNÇAO: Le a quantidade de pessoas assistido TV e calcula o IBOPE de cada canal
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX06 {
    static void main() {
        String assistindoTV, nomeCanalMaisAssistido = "";
        int termos, canal, audienciaTotal, contCanal4 = 0, contCanal7 = 0, contCanal12 = 0, canalMaisAssistido = 0, somaAssistido = 0;
        double porcentCanal4, porcentCanal7, porcentCanal12, mediaAssistindoTV;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantas casas foram visitadas:");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            System.out.println("Esta assistindo TV?");
            assistindoTV = teclado.next();
            //Verifica se esta assistindo TV, senao, ignora o valor e pergunta novamente
            if (!assistindoTV.equalsIgnoreCase("SIM"))
                continue;
            somaAssistido++;
            System.out.println("Qual canal?");
            canal = teclado.nextInt();
            //Verifica se esta assistindo aos tres canais pesquisados, senao, ignora o valor e pergunta novamente
            if (canal != 4 && canal != 7 && canal != 12)
                continue;
            if (canal == 4)
                contCanal4++;
            else if (canal == 7)
                contCanal7++;
            else
                contCanal12++;
            if (contCanal4 > contCanal7 && contCanal4 > contCanal12) {
                if (aux == 1 || contCanal4 < canalMaisAssistido) {
                    canalMaisAssistido = contCanal4;
                    nomeCanalMaisAssistido = "Canal 4";
                }
            } else if (contCanal7 > contCanal12 && contCanal7 > contCanal4) {
                if (aux == 1 || contCanal7 < canalMaisAssistido) {
                    canalMaisAssistido = contCanal7;
                    nomeCanalMaisAssistido = "Canal 7";
                }
            } else if (aux == 1 || contCanal12 < canalMaisAssistido) {
                canalMaisAssistido = contCanal12;
                nomeCanalMaisAssistido = "Canal 12";
            }
        }
        porcentCanal4 = (float) (contCanal4 * 100) / termos;
        porcentCanal7 = (float) (contCanal7 * 100) / termos;
        porcentCanal12 = (float) (contCanal12 * 100) / termos;
        mediaAssistindoTV = (float) somaAssistido / termos;
        System.out.println("A audiencia total do canal 4 foi de "+contCanal4+", um total de "+porcentCanal4+"%");
        System.out.println("A audiencia total do canal 7 foi de "+contCanal7+",  um total de "+porcentCanal7+"%");
        System.out.println("A audiencia total do canal 12 foi de "+contCanal12+", um total de "+porcentCanal12+"%");
        System.out.println("O canal mais assistido foi o "+nomeCanalMaisAssistido);
        System.out.println("A média de pessoas assistido foi "+mediaAssistindoTV);
        teclado.close();
    }
}

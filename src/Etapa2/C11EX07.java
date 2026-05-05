package Etapa2;

//FUNÇAO: Calcula e imprime maior, menor e a media das temperaturas de uma cidade em determinado periodo
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX07 {
    public static void main() {
        int termos, dia = 0, contMaiorTemperatura = 0;
        double temperatura, maiorTemperatura = 0, menorTemperatura = 100, somaTemperatura = 0, mediaTemperatura;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos dias durou a pesquisa?");
        termos = teclado.nextInt();

        for (int aux = 1; aux <= termos; aux++) {
            System.out.println("Temperatura registrada");
            temperatura = teclado.nextDouble();
            somaTemperatura += temperatura;
            if (aux == 1 || temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
                contMaiorTemperatura = 1;
                if (maiorTemperatura == temperatura)
                    contMaiorTemperatura++;
            } else if (aux == 1 || temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }
        }
        mediaTemperatura = somaTemperatura / termos;
        System.out.println("Menor temperatura registrada: " + menorTemperatura);
        System.out.println("Maior temperatura registrada: " + maiorTemperatura);
        System.out.println("A média das temperaturas registradas é: " + mediaTemperatura);
        System.out.println("A maior temperatura foi registrada por " + contMaiorTemperatura + " dias");
        teclado.close();
    }
}

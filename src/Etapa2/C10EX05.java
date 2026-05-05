package Etapa2;

//FUNÇÃO: Calcula e imprime diversos fatores de acordo com dados informados pelo usuario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C10EX05 {
    public static void main() {
        double altura, peso, somaAltura = 0, alturaMedia;
        String sexo;
        int quantPessoas = 0, quantMulheres = 0, quantHomens = 0, mulheresPeso60 = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 0 para encerrar");

        do {
            System.out.println("Digite sua altura: ");
            altura = teclado.nextDouble();
            if (altura != 0) {
                System.out.println("Digite sua peso: ");
                peso = teclado.nextDouble();
                System.out.println("Digite seu sexo: ");
                sexo = teclado.next();
                teclado.nextLine();
                if (sexo.equalsIgnoreCase("M")) {
                    quantHomens++;
                    somaAltura += altura;
                }
                else if (sexo.equalsIgnoreCase("F")) {
                    quantMulheres++;
                }
                if (sexo.equalsIgnoreCase("F") && peso < 60) {
                    mulheresPeso60++;
                }
                quantPessoas++;
            }
        } while (altura != 0);
        alturaMedia = somaAltura / quantHomens;
        System.out.println("Total de pessoas pesquisadas: "+quantPessoas);
        System.out.println("A quantidade de mulheres é: "+quantMulheres);
        System.out.println("A altura media dos homens é: "+alturaMedia);
        System.out.println("A quantidade de mulheres abaixo de 60Kg é: "+mulheresPeso60);
        teclado.close();
    }
}

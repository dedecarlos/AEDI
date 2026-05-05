package Etapa2;

//FUNÇAO: Le e imprime o nome e o valor da mensalidade de cada aluno de uma escola e calcula o total das mensalidades pagas
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX05 {
    static void main() {
        String nome;
        int codigoOpcao, mensalidade, contIngles = 0, mensalidadeTotal1 = 0, mensalidadeTotal2 = 0, mensalidadeTotal3 = 0;
        double mensalidadeMedia;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite seu nome: ");
            nome = teclado.next();
            if (!nome.equalsIgnoreCase("FIM")) {
                System.out.println("Digite o codigo da opção de lingua: ");
                codigoOpcao = teclado.nextInt();
                if (codigoOpcao != 1 && codigoOpcao != 2 && codigoOpcao != 3) {
                    System.out.println("Codigo Invalido, tente novamente");
                    continue;
                }
                if (codigoOpcao == 1) {
                    mensalidade = 100;
                    System.out.println(nome + " tem mensalidade de: R$100,00");
                    contIngles++;
                    mensalidadeTotal1 += mensalidade;
                } else if (codigoOpcao == 2) {
                    mensalidade = 150;
                    System.out.println(nome + " tem mensalidade de: R$150,00");
                    mensalidadeTotal2 += mensalidade;
                } else if (codigoOpcao == 3) {
                    mensalidade = 120;
                    System.out.println(nome + " tem mensalidade de: R$120,00");
                    mensalidadeTotal3 += mensalidade;
                }
            }
        } while (!nome.equalsIgnoreCase("FIM"));
        mensalidadeMedia = (mensalidadeTotal1 + mensalidadeTotal2 + mensalidadeTotal3) / 3.0;
        System.out.println("A quantidade de aalunos matriculados no curso de Ingles é: " + contIngles);
        System.out.printf("A mensalidade média da escola é: R$%1.2f", mensalidadeMedia);
        System.out.println();
        System.out.println("O curso de Ingles tem mensalidade total de: R$" + mensalidadeTotal1 + "\nO curso de Frances tem mensalidade total de: R$" + mensalidadeTotal2 + "\nO curso de Espanhol tem mensalidade total de: R$" + mensalidadeTotal3);
        teclado.close();
    }
}

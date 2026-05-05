package Etapa2;

//FUNCAO: Calcula a categoria dos clientes de uma empresa de acordo com o total investido, usando do while
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX02b {
    static void main() {
        String nome, clienteMenorAplic = "";
        double aplicacao, aplicacaoMenor = 0, volumeTotalAplic = 0, somaBronze = 0, mediaBronze;
        int bronze = 0, ouro = 0, prata = 0, cont = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite o nome do cliente: ");
            nome = teclado.nextLine();
            System.out.println("Digite o valor da aplicação: ");
            aplicacao = teclado.nextDouble();
            teclado.nextLine();
            volumeTotalAplic += aplicacao;
            cont++;
            if (aplicacao <= 1000) {
                System.out.println(nome+" está na categoria Bronze");
                bronze++;
                somaBronze += aplicacao;
            }
            else if (aplicacao <= 5000) {
                System.out.println(nome+" está na categoria Prata");
                prata++;
            }
            else {
                System.out.println(nome+" está na categoria Ouro");
                ouro++;
            }
            if (cont == 1 || aplicacao < aplicacaoMenor){
                aplicacaoMenor = aplicacao;
                clienteMenorAplic = nome;
            }
        } while (!nome.equalsIgnoreCase("Reynaldo Duarte"));
        mediaBronze = somaBronze / bronze;
        System.out.println("O total de clientes Bronze é: "+bronze+"\nPrata é: "+prata+"\nOuro é: "+ouro);
        System.out.println("A média das aplicações dos clientes Bronze é: "+mediaBronze);
        System.out.printf("O volume total das aplicações é: R$%.2f",volumeTotalAplic);
        System.out.println();
        System.out.println(clienteMenorAplic+" é o cliente com menor aplicação");
        teclado.close();
    }
}

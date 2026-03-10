import java.util.Scanner;
import java.text.NumberFormat;


//FUNÇÃO: Calcula o valor da multa a ser paga pelo cliente e apresenta os valores em uma tabela
//AUTOR: ANGELO CARLOS MACHADO SANTOS


public class C04EX03 {
    public static void main(String[] args) {
        int quantidadePoluente;
        double multa1 = 0, multa2 = 0, multa3 = 0;
        String multa;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da quantidade de poluente em ppm: ");
        quantidadePoluente = teclado.nextInt();

        if (quantidadePoluente <= 50){
            multa1 = quantidadePoluente * 100;

        }
        if (quantidadePoluente > 50 &&  quantidadePoluente <= 200) {
            multa2 = quantidadePoluente * 300;

        }
        if (quantidadePoluente > 200) {
            multa3 = quantidadePoluente * 400;
        }

        System.out.println
                ("------------------------------------------------------------------------------------------------");
        System.out.println("|                       Quantidade de Poluente Emitido x Valor da Multa                         |");
        System.out.println
                ("------------------------------------------------------------------------------------------------");
        multa = NumberFormat.getCurrencyInstance().format(multa1); //Pegará a configuração corrente de moeda do Windows

        System.out.println("| Até 50, multa de " +multa+"                                                                      |");

        System.out.println
                ("------------------------------------------------------------------------------------------------");
        multa = NumberFormat.getCurrencyInstance().format(multa2); //Pegará a configuração corrente de moeda do Windows

        System.out.println("| De 51 até 200, multa de " +multa+"                                                               |");
        System.out.println
                ("------------------------------------------------------------------------------------------------");
        multa = NumberFormat.getCurrencyInstance().format(multa3); //Pegará a configuração corrente de moeda do Windows

        System.out.println("| Acima de 200, multa de " +multa+" por poluente emitido                                             |");
        System.out.println
                ("------------------------------------------------------------------------------------------------");
        teclado.close();
    }
}

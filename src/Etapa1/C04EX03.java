import java.util.Scanner;
//FUNÇÃO: Calcula o valor da multa a ser paga pelo cliente e da os valores em uma tabela
//AUTOR: ANGELO CARLOS MACHADO SANTOS
public class C04EX03 {
    public static void main(String[] args) {
        long quantidadePoluente, multa = 1000;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da quantidade de poluente: ");
        quantidadePoluente = teclado.nextLong();

        if  (quantidadePoluente <= 50){
            multa = 1000;
            if (quantidadePoluente > 50){
            multa = multa * 3;
            }
            if (quantidadePoluente > 100){
                multa = multa * 5;
            }
        }
        System.out.print(+multa);
    }
}

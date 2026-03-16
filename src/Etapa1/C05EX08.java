import java.util.Scanner;

//FUNCAO: Calcula o valor do raio R de acordo com os valores informados pelo usuário
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C05EX08 {
    public static void main(String[] args) {
        int area, angulo;
        double raio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor da área: ");
        area = teclado.nextInt();
        System.out.print("Informe o valor da angulo: ");
        angulo = teclado.nextInt();

        raio = Math.sqrt((360 * area) / (angulo * 3.1416));
        System.out.println("O valor do raio (R) é de: "+raio);
    }
}

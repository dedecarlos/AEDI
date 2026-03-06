import java.util.Scanner;

//Função: Imprime o nome completo do usuário e a idade
//Autor: ANGELO CARLOS MACHADO SANTOS

public class C04EX01 {
    public static void main(String[] args) {
        String sobrenome, primeiroNome, segundoNome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: "); //Usuario digita o nome
        primeiroNome = teclado.nextLine();
        System.out.print("Segundo nome: "); //Usuario digita o segundo nome
        segundoNome = teclado.nextLine();
        System.out.print("Sobrenome: "); //Usuario digita o sobrenome
        sobrenome = teclado.nextLine();
        System.out.print("Idade: "); //Usuario digita a idade
        idade = teclado.nextInt();

        System.out.print(sobrenome+", " +primeiroNome+ " " +segundoNome+ "\n");
        System.out.print(idade);
        teclado.close();

    }
}

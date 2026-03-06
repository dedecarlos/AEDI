import java.text.NumberFormat;
import java.util.Scanner;

//FUNCAO: Gerar ficha cadastral de um funcionario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C04EX02 {
public static void main(String[] args) {

    String nome, nome_empresa;
    long cpf, identidade, titulo_de_eleitor, cnh;
    float salario;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Nome: ");
    nome = teclado.nextLine();
    System.out.print("CPF: ");
    cpf = teclado.nextLong();
    System.out.print("Identidade: ");
    identidade = teclado.nextLong();
    System.out.print("Titulo de eleitor: ");
    titulo_de_eleitor = teclado.nextLong();
    System.out.print("Carteira de motorista: ");
    cnh = teclado.nextLong();
    teclado.nextLine();
    System.out.print("Nome da empresa: ");
    nome_empresa = teclado.nextLine();
    System.out.print("Salario: ");
    salario = teclado.nextFloat();


    System.out.print("FICHA FUNCIONAL DE: " +nome+ "\n");
    System.out.print("\n");
    System.out.print("Documentos:\n");
    System.out.print("CPF: ............................................. "+cpf+"\n");
    System.out.print("Identidade: ...................................... "+identidade+"\n");
    System.out.print("Titulo de eleitor: ............................... "+titulo_de_eleitor+"\n");
    System.out.print("Carteira de motorista: ........................... "+cnh+"\n");
    System.out.print("\n");
    System.out.print("Empresa: ......................................... "+nome_empresa+"\n");
    System.out.printf("Salario: ........................................ R$ %6.2f",salario);
teclado.close();
    }
}

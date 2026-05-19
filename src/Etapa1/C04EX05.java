package Etapa1;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Scanner;

//FUNÇÃO: Imprime uma tabela com informaçãoes disponiveis em um arquivo txt.
//AUTOR: Angelo Carlos Machado Santos

public class C04EX05 {
    public static void main(String[] args) {
        String nome, nome_empresa, cpf, salarioFormatado;
        int  identidade, titulo_de_eleitor, cnh;
        double salario;

        Scanner arquivo = new Scanner(
        C04EX05.class.getResourceAsStream("dados.txt")); //Lê os dados salvos no arquivo "dados.txt" e salva eles nas variaveis

        nome = arquivo.nextLine();
        cpf = arquivo.nextLine();
        identidade = arquivo.nextInt();
        titulo_de_eleitor = arquivo.nextInt();
        cnh = arquivo.nextInt();
        arquivo.nextLine();
        nome_empresa = arquivo.nextLine();
        salario = arquivo.nextFloat();
        arquivo.close();

        salarioFormatado = NumberFormat.getCurrencyInstance().format(salario); //Usa a configuração atual do Windows para moedas

        JOptionPane.showMessageDialog(null,"FICHA FUNCIONAL DE: " +nome+ "\n" +
                "                       Documentos: \n" +
                "CPF: ............................................. " +cpf+ "\n" +
                "Identidade: ...................................... " +identidade+ "\n" +
                "Titulo de Eleitor: ............................... " +titulo_de_eleitor+ "\n" +
                "CNH: ............................................... " +cnh+ "\n" +
                "\n" +
                "Nome da Empresa: ........................... " +nome_empresa+ "\n" +
                "Salario: ............................................ " +salarioFormatado);

    }
}

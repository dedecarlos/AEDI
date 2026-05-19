package Etapa1;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//FUNCAO: Calcula o valor da multa a ser paga pelo cliente e apresenta os valores em uma tabela
// /AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX02 {
    public static void main(String[] args) {
        double quantidadePoluente, multa;
        String quantPoluStr, multaStr;

        //Pede ao usuário que informe o valor desejado
        quantPoluStr = JOptionPane.showInputDialog(null,
                "Digite o valor da quantidade de poluente: ",
                "Quantidade de Poluente",
                JOptionPane.QUESTION_MESSAGE);

        quantidadePoluente = Double.valueOf(quantPoluStr);
        if (quantidadePoluente <= 1500)
            multa = 0;
        else
            if (quantidadePoluente <= 3500)
                multa = 3000;
            else
                multa = quantidadePoluente * 5000;

        //Formata o valor em decimal
        multaStr = new DecimalFormat("#,##0.00").format(multa);

        //Imprime os resultados em uma tabela
        JOptionPane.showMessageDialog(null, "Quantidade de Poluente: "+quantPoluStr+
                        "\nValor da Multa: R$" +multaStr,
                "Multa de Poluente",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

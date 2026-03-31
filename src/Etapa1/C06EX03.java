package Etapa1;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//FUNCAO: Calcula o valor do salario
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX03 {
    public static void main(String[] args) {
        double salario, valorFixo=240.00, comissao, vendas;
        String salarioStr, comissaoStr, vendasStr;

        vendasStr = JOptionPane.showInputDialog(null,
                "Qual o valor das Vendas: ",
                "Calculo Comisaso",
                JOptionPane.QUESTION_MESSAGE);

        //Converte o valor de uma String para Double
        vendas = Double.valueOf(vendasStr);

        //Calcula o valor do salario
        if (vendas <= 1000) {
            comissao = 0;
            salario = valorFixo + comissao;
        }

        else
            if (vendas <= 10000) {
                comissao = vendas * 0.1;
                salario = valorFixo + comissao;
            }

                else {
                comissao = 1000;
                salario = valorFixo + comissao;
            }

       //Converte e formata o valor de uma Double para String
       salarioStr = new DecimalFormat("#,##0.00").format(salario);

                //Imprime o resultado em uma mensagem para o usuario
                JOptionPane.showMessageDialog(null, "Salario: R$"+salarioStr,
                "Salario",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

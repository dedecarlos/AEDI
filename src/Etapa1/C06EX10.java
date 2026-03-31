package Etapa1;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

//FUNCAO: Calcula e imprime os valores de um investimento
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C06EX10 {
    public static void main(String[] args) {
        double capAplicado, diasAplicado, taxaDiaria, rendimento, impostRenda, valorResgatado;
        String cap_Str, dias_Str, taxa_Str, rendimento_Str, impostRend_Str, valorResgatado_Str;

        cap_Str = JOptionPane.showInputDialog(null,"Informe o Capital Aplicado", "Capital Aplicado",  JOptionPane.QUESTION_MESSAGE);
        capAplicado = Double.valueOf(cap_Str);
        dias_Str = JOptionPane.showInputDialog(null, "Informe quantos Dias ficou aplicaddo", "Dias Aplicado", JOptionPane.QUESTION_MESSAGE);
        diasAplicado = Double.valueOf(dias_Str);
        taxa_Str = JOptionPane.showInputDialog(null, "Informe a Taxa Diaria", "Taxa Diaria", JOptionPane.QUESTION_MESSAGE);
        taxaDiaria = Double.valueOf(taxa_Str);


        rendimento = capAplicado * (taxaDiaria / 100) * diasAplicado;
        impostRenda = rendimento * 0.15;
        valorResgatado = capAplicado + rendimento - impostRenda - 10;

        //Converte os valores para o formato de moeda do computador
        rendimento_Str = NumberFormat.getCurrencyInstance().format(rendimento);
        impostRend_Str = NumberFormat.getCurrencyInstance().format(impostRenda);
        valorResgatado_Str = NumberFormat.getCurrencyInstance().format(valorResgatado);

        JOptionPane.showMessageDialog(null, "Rendimento: " +rendimento_Str+ "\nImposto de Renda: "+impostRend_Str+"\nValor Resgatado: "+valorResgatado_Str);

    }
}
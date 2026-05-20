import javax.swing.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class CalculaINSS3c {
    public static void main(String[] args) {
        double salario, inss;
        String salarioStr, inssStr;
        salarioStr = JOptionPane.showInputDialog(null,
                "Informe o valor do seu salário:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        salario = Double.valueOf(salarioStr);
        inss = salario * 8 / 100;
        System.out.println("Salário: " + salario);
        System.out.println("Valor do INSS (1) = R$" + inss);
        System.out.printf("Valor do INSS (2) = R$%.2f",inss);
        inssStr = new DecimalFormat("#,##0.00").format(inss);
        JOptionPane.showMessageDialog(null,
                "Salário: "+salarioStr+"\nValor do INSS (3) = R$"+inssStr,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

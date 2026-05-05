import javax.swing.JOptionPane;
public class CalculaINSS3d {
    public static void main(String[] args) {
        double salario, inss;
        String salarioStr, inssStr;
        salarioStr = JOptionPane.showInputDialog(null,
                "Informe o valor do seu salário:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        salario = Double.valueOf(salarioStr);
        inss = salario * 0.08;
        inssStr = String.format("%1.2f",inss);
        JOptionPane.showMessageDialog(null,
                "Salário: "+salarioStr+"\nValor do INSS = R$"+inssStr,
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

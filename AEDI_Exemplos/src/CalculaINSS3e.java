import javax.swing.JOptionPane;
public class CalculaINSS3e {
    public static void main(String[] args) {
        double salario, inss;
        String salarioStr;
        salarioStr = JOptionPane.showInputDialog(null,
                "Informe o valor do seu salário:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE);
        salario = Double.valueOf(salarioStr);
        inss = salario * 0.08;
        JOptionPane.showMessageDialog(null,
                "Salário: "+salarioStr+
                        String.format("\nValor do INSS = R$%1.2f",inss),
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

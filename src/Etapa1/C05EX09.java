package Etapa1;
import javax.swing.JOptionPane;

public class C05EX09 {
    public static void main(String[] args) {

        double nota1, nota2, nota3, media;

        String  nota1str = JOptionPane.showInputDialog(null,
                "Informe a primeira Nota: ",
                "Nota 1",
                JOptionPane.QUESTION_MESSAGE
        );
        String nota2str = JOptionPane.showInputDialog(null,
                "Informe a segunda Nota: ",
                "Nota 2",
                JOptionPane.QUESTION_MESSAGE
        );
        String nota3str = JOptionPane.showInputDialog(null,
                "Informe a terceira Nota: ",
                "Nota 3",
                JOptionPane.QUESTION_MESSAGE
        );
        nota1 = Double.valueOf(nota1str);
        nota2 = Double.valueOf(nota2str);
        nota3 = Double.valueOf(nota3str);
        media = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / (2 + 3 + 5);//Nao esquecer dos parenteses antes para garantir a ordem da divisao e multiplicacao

        JOptionPane.showMessageDialog(null,
                "A média das notas é: " +media,
                "Media das notas",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

import javax.swing.JOptionPane;

public class jpane {
    public static void main(String[] args) {
        String[] nome = {"angelo", "carlos", "machado", "santos"};
        Object nomes;
       nomes = JOptionPane.showInputDialog(null,
                "Bem-vindo ao JOptionPane!",
        "Aula de Java",
                JOptionPane.QUESTION_MESSAGE,
                null,
                nome,
                "Selecione uma opcao"
        );
        System.out.println(nomes);
    }
}

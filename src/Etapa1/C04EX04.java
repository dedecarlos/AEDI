package Etapa1;
import javax.swing.JOptionPane;

//FUNÇÃO: Cria caixas de dialogo para entrada de dados no programa pelo usuário e imprime em uma nova caixa de dialogo.
//ALUNO: ANGELO CARLOS MACHADO SANTOS

public class C04EX04 {
    public static void main(String[] args) {

        String primeiroNome = JOptionPane.showInputDialog(null, //Caixa de dialogo, onde o usuário entrará seus dados
                "Digite seu Nome:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        String segundoNome = JOptionPane.showInputDialog(null, //Caixa de dialogo, onde o usuário entrará seus dados
                "Digite seu Segundo Nome:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        String sobrenome = JOptionPane.showInputDialog(null, //Caixa de dialogo, onde o usuário entrará seus dados
                "Digite seu Sobrenome:",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        String idadestg = JOptionPane.showInputDialog(null,  //Converte a variavel int em String
                "Qual sua Idade?",
                "Aula de Java",
                JOptionPane.QUESTION_MESSAGE
        );
        int idade = Integer.valueOf(idadestg);
        JOptionPane.showMessageDialog(null,sobrenome+", "+primeiroNome+" "+segundoNome+"\nIdade: "+idade+" anos"); //Imprime em uma nova caixa de dialogo os valores dados pelo usuário
    }
}

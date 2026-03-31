package Etapa2;

import javax.swing.JOptionPane;

public class C08EX04 {
    public static void main(String[] args) {
        int idade, contador1 = 0, contador2 = 0;
        String nome, idadeStr;
        for (int repete = 1; repete <= 50; repete++) {
            nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:", "Nome", JOptionPane.QUESTION_MESSAGE);
            idadeStr = JOptionPane.showInputDialog(null, "Digite a idade do aluno:", "Idade", JOptionPane.QUESTION_MESSAGE);
            idade = Integer.valueOf(idadeStr);
            if (idade <= 18) {
                contador1++;
            }
        }
        contador2 = 50 -  contador1; //Não precisa usar o else neste caso, só subtrair a quantidade de numeros - contador1

        JOptionPane.showMessageDialog(null, "Alunos com 18 anos ou menos: " + contador1, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Alunos com mais de 18 anos: " + contador2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
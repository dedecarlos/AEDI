package Etapa2;

//FUNÇÃO: Pede aos usuarios informações pessoais e compara e imnprine os resultados utilizando JOptionPane
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import javax.swing.*;
import java.text.NumberFormat;

public class C08EX11 {
    public static void main(String[] args) {
        String nome, nomeSalarioMaior = "", idadeStr, salarioStr, salarioFormatado;
        String[] botoesSexo = {"M", "F"}, botoesEstadoCivil = {"C", "S", "O"}, botoesCorOlhos = {"A", "C", "P", "O"}, botoesCorCabelo = {"L", "P", "C", "R"}, botoesEscolaridade = {"1", "2", "3", "4"};
        int idade, sexo, estadoCivil, escolaridade, corOlhos, corCabelo, contador = 0;
        double salario, salarioMaior = 0, salarioMenor = 0, diferencaSalario = 0;

        for (int repete = 1; repete <= 50; repete++) {

            nome = JOptionPane.showInputDialog(null, "Informe seu nome:", "Nome", JOptionPane.QUESTION_MESSAGE);
            idadeStr = JOptionPane.showInputDialog(null, "Informe sua idade:", "Idade", JOptionPane.QUESTION_MESSAGE);
            idade = Integer.valueOf(idadeStr);
            sexo = JOptionPane.showOptionDialog(null, "Informe seu sexo (M masculino ou F feminino:", "Sexo", 0, JOptionPane.QUESTION_MESSAGE, null, botoesSexo, "M");
            estadoCivil = JOptionPane.showOptionDialog(null, "Informe seu estado civil (C casado, S solteiro, O outros):", "Estado Civil", 0, JOptionPane.QUESTION_MESSAGE, null, botoesEstadoCivil, "C");
            corOlhos = JOptionPane.showOptionDialog(null, "Informe a cor do seus olhos (A azul, C castanhos, P preto, O outros", "Cor Olhos", 0, JOptionPane.QUESTION_MESSAGE, null, botoesCorOlhos, "A");
            corCabelo = JOptionPane.showOptionDialog(null, "Informe a cor do seu cabelo (L loiro, P preto, C castanho, R ruivo)", "Cor do Cabelo", 0, JOptionPane.QUESTION_MESSAGE, null, botoesCorCabelo, "L");
            salarioStr = JOptionPane.showInputDialog(null, "Informe seu salario:", "Salario", JOptionPane.QUESTION_MESSAGE);
            salario = Double.valueOf(salarioStr);
            escolaridade = JOptionPane.showOptionDialog(null, "Informe sua escolaridade (1 analfabeto, 2 fundamental, 3 médio, 4 superior)", "Escolariade", 0, JOptionPane.QUESTION_MESSAGE, null, botoesEscolaridade, "3");

            //Compara os dados informados e conta quantas pessoas possuem as caracteristicas
            if (sexo == 1 && corCabelo == 0 && corOlhos == 0 && idade >= 18 && idade <= 25 && estadoCivil == 1 && salario >= 10000 && escolaridade == 3)
                contador++;

            if (sexo == 0) {
                //Compara e salva as informações da pessoa com o maior salário
                if (repete == 1 || salario > salarioMaior) {
                    salarioMaior = salario;
                    nomeSalarioMaior = nome;
                }
                //Compara e salva as informações da pessoa com o menor salário
                if (repete == 1 || salario < salarioMenor) {
                    salarioMenor = salario;
                }
            }
            //Calcula a diferença salarial
            diferencaSalario = salarioMaior - salarioMenor;
        }
        salarioFormatado = NumberFormat.getCurrencyInstance().format(diferencaSalario); //Usa a configuração atual do Windows para moedas
        JOptionPane.showMessageDialog(null, "A quantidade de mulheres com especificas qualidades é de " + contador +
                        "\nO nome da pessoa com maior salário é: " + nomeSalarioMaior +
                        "\nA diferença entre o maior e o menor salário é de: " + diferencaSalario,
                "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}

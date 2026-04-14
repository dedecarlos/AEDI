package Etapa2;

//FUNCAO: Performa diversos calculos de acordo com dados em um arquivo txt
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.text.DecimalFormat;
import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        String nome, nomeMaior = "", cargo, cargoMaior = "", mediaFormatada;
        double salario, soma18Anos = 0, salarioMaior = 0, media = 0;
        int idade, cont = 0;

        Scanner arquivo = new Scanner(C08EX15.class.getResourceAsStream("c08ex15.txt"));

        for (int repete = 1; repete <=7; repete++){
            nome = arquivo.nextLine();
            cargo = arquivo.nextLine();
            salario = Double.parseDouble(arquivo.nextLine());
            idade = Integer.parseInt(arquivo.nextLine());

            //Analisa se o funcionario é senior ou não de acordo com sua idade e salario
            if (salario >= 10000 && idade >= 50){
                System.out.println(nome+" é um funcionario senior");
            }
            //Soma dos salarios dos funcionarios de até 18 anos
            if (idade <= 18){
                soma18Anos += salario;
                cont++;
            }
            //Analisa quem tem o maior salario
            if (repete == 1 || salario > salarioMaior){
                salarioMaior = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }
        //Calcula a media dos salarios dos funcionarios ate 18 anos
        media = (float) soma18Anos /  cont;
        //Formata o valor da media para duas casas apos a virgula
        mediaFormatada = new DecimalFormat("#,##0.00").format(media);
        //Imprime os resultados
        System.out.println("A média dos salarios dos funcionarios até 18 anos é de R$"+mediaFormatada+"\nO nome e o cargo do funcionario com o maior salario é "+nomeMaior+" - "+cargoMaior);
        arquivo.close();
    }
}

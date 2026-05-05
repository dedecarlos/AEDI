package Etapa2;

//FUNCAO: Le os nomes e registros dos funcionarios de uma empresa e calcula e imprime o ano e o setor que ele trabalha
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {
        String nome, nomePrimeiroFuncionario = "", nomeUltimoFuncionario = "", setorMaisFunc = "";
        int RF, rfAno, rfSetor, rfOrdem, contOrdem = 0, ordem, primeiroFunc = 0, ultimoFunc = 0, contGerencia = 0, contAdm = 0, contAdm2010 = 0, contPesq = 0, contObras = 0, maisFunc;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario (Digite FIM para encerrar): ");
        nome = teclado.nextLine();
        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.println("Digite o Registro Funcional (RF) do funcionario: ");
            RF = teclado.nextInt();
            teclado.nextLine();
            rfAno = RF / 10000;
            rfSetor = RF / 1000 % 10;
            rfOrdem = RF % 1000;
            contOrdem++;
            if (RF < 101001 || RF > 144999 || rfSetor < 1 || rfSetor > 4) {
                System.out.println("RF INVALIDO!");
                //Pede o nome novamente e ignora a pessoa com RF invalido
                System.out.println("Digite o nome do funcionario (Digite FIM para encerrar): ");
                nome = teclado.nextLine();
                continue;
            }
            if (rfSetor == 1)
                contGerencia++;
            else if (rfSetor == 2)
                contAdm++;
            else if (rfSetor == 3)
                contPesq++;
            else
                contObras++;
            if (rfAno == 10 && rfSetor == 2)
                contAdm2010++;
            //Calcula a ordem de contratação (precisa multiplicar por 1000 senao a soma da ordem atrapalha e outros valores nao dao certo)
            ordem = rfAno * 1000 + rfOrdem;
            if (contOrdem == 1 || ordem < primeiroFunc){
                primeiroFunc = ordem;
                nomePrimeiroFuncionario = nome;
            }
            if (contOrdem == 1 || ordem > ultimoFunc){
                ultimoFunc = ordem;
                nomeUltimoFuncionario = nome;
            }
            System.out.println("Digite o nome do funcionario (Digite FIM para encerrar): ");
            nome = teclado.nextLine();
        }
        //Usa a funcao Math.max para comparar os valores dos contadores e ver qual tem mais
        maisFunc = Math.max(Math.max(contGerencia, contAdm), Math.max(contPesq, contObras));
        if (maisFunc == contGerencia)
            setorMaisFunc = "Gerencia";
        else if (maisFunc == contAdm)
            setorMaisFunc = "Administração";
        else if (maisFunc == contPesq)
            setorMaisFunc = "Pesquisa";
        else
            setorMaisFunc = "Obras";
        System.out.println("Gerencia tem: "+contGerencia+", Administração tem: "+contAdm+", Pesquisa tem: "+contPesq+", Obras tem: "+contObras);
        System.out.println("A quantidade de funcionarios admitidos em 2010 que trabalham na Adm é: "+contAdm2010);
        System.out.println("O setor com mais funcioários alocados é "+setorMaisFunc);
        System.out.println(nomePrimeiroFuncionario+" foi o primeiro contratado e "+nomeUltimoFuncionario+" foi o ultimo");
        teclado.close();
    }
}

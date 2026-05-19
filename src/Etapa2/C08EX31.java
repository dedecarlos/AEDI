package Etapa2;

//FUNÇAO: Calcula e imprime dados relacionados aos salarios de engenheiros de acordo com dados de um arquivo txt
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {
        String nome, nomeSalMenor = " ", cargo, cargoSalMenor = " ";
        int quant, contadorC = 0, contadorP = 0, contadorO = 0, contadorA = 0, contadorA1 = 0, contadorX = 0, somaSalAcima = 0;
        double salario, salarioMenor = 0, somaAdm = 0, mediaAdm = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de entrevistados: ");
        quant = teclado.nextInt();
        Scanner arquivo = new Scanner(C08EX31.class.getResourceAsStream("c08EX31.txt"));

        for (int aux = 1; aux <= quant; aux++) {
            nome = arquivo.nextLine();
            cargo = arquivo.nextLine();
            salario = arquivo.nextDouble();
            arquivo.nextLine();

            //Analisa se o salario do Calculista está abaixo do mínimo
            if (cargo.equalsIgnoreCase("C") && salario < 2500)
                System.out.println(nome+ " Tem o salario abaixo do Minimo");
            else if (cargo.equalsIgnoreCase("C") && salario > 2500)
                contadorC++;
            if (cargo.equalsIgnoreCase("P") && salario < 4650)
                System.out.println(nome+ " Tem o salario abaixo do Minimo");
            else  if (cargo.equalsIgnoreCase("P") && salario > 4650)
                contadorP++;
            if (cargo.equalsIgnoreCase("O") && salario < 3200)
                System.out.println(nome+ " Tem o salario abaixo do Minimo");
            else if (cargo.equalsIgnoreCase("O") && salario > 3200)
                contadorO++;
            if (cargo.equalsIgnoreCase("A") && salario < 5100)
                System.out.println(nome+ " Tem o salario abaixo do Minimo");
            else  if (cargo.equalsIgnoreCase("A") && salario > 5100)
                contadorA++;
            if (cargo.equalsIgnoreCase("A")) {
                somaAdm += salario;
                contadorA1++;
            }
            if (cargo.equalsIgnoreCase("X") && salario >= 5000)
                contadorX++;
            if (aux == 1 || salario < salarioMenor) {
                salarioMenor = salario;
                nomeSalMenor = nome;
                cargoSalMenor = cargo;
                if (cargoSalMenor.equalsIgnoreCase("C"))
                    cargoSalMenor = "Calculista";
                else if (cargoSalMenor.equalsIgnoreCase("P"))
                    cargoSalMenor = "Projetista";
                else if (cargoSalMenor.equalsIgnoreCase("O"))
                    cargoSalMenor = "Obra";
                else if (cargoSalMenor.equalsIgnoreCase("A"))
                    cargoSalMenor = "Admistrador";
                else
                    cargoSalMenor = "Outros";
            }
        }
        somaSalAcima = contadorC + contadorP + contadorO + contadorA;
        mediaAdm = somaAdm / contadorA1;
        System.out.println("A quantidade de Engenheiros com salario acima do minimo é: " +somaSalAcima);
        System.out.printf("A média dos salarios dos Engenheiros de cargo Administrador é: R$%1.2f",mediaAdm);
        System.out.println();
        System.out.println("A quantidade de Engenheiros de cargo Outros que recebem acima de R$5000,00 é: " +contadorX);
        System.out.printf(nomeSalMenor+ ", " +cargoSalMenor+ ", recebe o menor salario, R$%1.2f", salarioMenor);
        arquivo.close();
    }
}

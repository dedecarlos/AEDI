package Etapa3;

//FUNÇAO: Cria uma lista com informações de CPFs e endereços e permite o usuario pesquisar e alterar a lista
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Long> listaCPF = new ArrayList<Long>();
        long cpf;
        List<String> listaEndereco = new ArrayList<String>();
        String endereco, resposta;

        do {
            System.out.println("Digite o numero do CPF (Digite 0 para encerrar): ");
            cpf = teclado.nextLong();
            if (cpf != 0){
                listaCPF.add(cpf);
                System.out.println("Digite o endereço: ");
                endereco = teclado.next();
                listaEndereco.add(endereco);
            }
        } while (cpf != 0);
        System.out.println("Digite o número do CPF que deseja pesquisar: ");
        cpf = teclado.nextLong();
        int pos = listaCPF.indexOf(cpf);
        if (pos >= 0){
            System.out.println("CPF encontrado! Deseja alterar o endereço ou excluir o CPF/Endereço? (A/E)");
            resposta = teclado.next();
            if (resposta.equalsIgnoreCase("A")){
                System.out.println("Informe o novo endereço: ");
                endereco = teclado.next();
                listaEndereco.set(pos, endereco);
                System.out.println("Endereço atualizado com sucesso!");
            }
            if (resposta.equalsIgnoreCase("E")){
                listaCPF.remove(pos);
                listaEndereco.remove(pos);
                System.out.println("CPF/Endereço  removido com sucesso!");
            }
        }
        else {
            System.out.println("CPF não encontrado! Deseja adicionar a lista? (S/N)");
            resposta = teclado.next();
            if (resposta.equalsIgnoreCase("S")){
                listaCPF.add(cpf);
                System.out.println("CPF adicionado com sucesso! Informe o endereço: ");
                endereco = teclado.next();
                listaEndereco.add(endereco);
            }
            else  if (resposta.equalsIgnoreCase("N")){
                System.out.println("CPF não foi adicionado!");
            }
        }
        for (int aux = 0; aux < listaCPF.size(); aux++) {
            System.out.println("CPF: " + listaCPF.get(aux) + "\nEndereço: " + listaEndereco.get(aux));
        }
        teclado.close();
    }
}

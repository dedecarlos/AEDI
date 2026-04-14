package Etapa2;

//FUNÇÃO: Calcula e imprime os custos totais e o insumo mais caro de um arquivo txt
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import javax.swing.*;
import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        String insumo, insumoMaior = "";
        double quantidade, precoUnitario, precoMaior = 0, custosParciais, custoTotal = 0, media = 0;

        Scanner arquivo = new Scanner(
                C08EX10.class.getResourceAsStream("custos_parciais.txt"));
        for (int repete =1;  repete <= 4; repete ++ ) {
            insumo = arquivo.nextLine();
            quantidade = arquivo.nextDouble();
            precoUnitario = arquivo.nextDouble();
            arquivo.nextLine();

            if (repete == 1 || precoUnitario > precoMaior) {
                precoMaior = precoUnitario;
                insumoMaior = insumo;
            }
            custosParciais = (float) quantidade * precoUnitario;
            custoTotal +=  custosParciais;
        }
        media = custoTotal / 4.0;
        JOptionPane.showMessageDialog(null, "O custo total do projeto será de: "+custoTotal+
                        "\nA média dos custos parciais é de: "+media+
                        "\nO insumo de maior valor é o: "+insumoMaior,
                "Resultados", JOptionPane.INFORMATION_MESSAGE);
        arquivo.close();
    }
}

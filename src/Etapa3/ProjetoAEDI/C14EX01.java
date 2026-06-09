package Etapa3.ProjetoAEDI;

//FUNCAO: Menu que usa o metodo de 4 outras classes
//AUTOR: ANGELO CARLOS MACHADO SANTOS

import javax.xml.transform.Source;
import java.util.Scanner;

public class C14EX01 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = 0;
        while(opcao != 9) {
            System.out.println("Digite 1 para calcular fatorial");
            System.out.println("Digite 2 para calcular hipotenusa");
            System.out.println("Digite 3 para calcular raiz quadrada");
            System.out.println("Digite 4 para calcular media");
            System.out.println("Digite 9 para sair");
            System.out.print(">>>>> ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: CalculaFatorial2.CalculaFatorial2(); break;
                case 2: CalculaHipotenusa.CalculaHipotenusa(); break;
                case 3: RaizQuadradaRepita.CalculaRaizQuadrada(); break;
                case 4: Somatorio3.CalculaMedia(); break;
                case 9: break;
                default:
                    System.out.println("Opcao invalida"); break;
            }
        }

        System.out.println("FIM DO PROGRAMA");
        teclado.close();
    }
}

//ANGELO CARLOS MACHADO SANTOS

package PROVA;

import java.util.Scanner;

public class D29752B {
    public static void main(String[] args) {
        int codigoRA, numAno_RA, numCurso_RA, numSeq_RA, soma, DV;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu Código do RA: ");
        codigoRA = teclado.nextInt();
        teclado.close();

        //Calcula os numeros do Ano, Curso e Sequenciais, multiplicando-os por 3, 6, 9 respectivamente
        numAno_RA = (codigoRA / 10000) * 3;
        numCurso_RA = (codigoRA / 1000 % 10) * 6;
        numSeq_RA = (codigoRA % 1000) * 9;

        //Calculo da soma dos numeros e do DV
        soma = numCurso_RA + numAno_RA + numSeq_RA;
        DV = soma % 5;

        //Imprime o numero DV ao usuario
        System.out.println("O número DV é: " + DV);
    }
}

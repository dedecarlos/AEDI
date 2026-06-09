package Etapa3.ProjetoAEDI;

public class Somatorio3 {
   public static void CalculaMedia (){
     int numero, soma = 0, cont = 0, rep; 
     double media;
     System.out.print("Quantos n�meros ser�o informados? ");
     rep = C14EX01.teclado.nextInt();
     for (int aux=1; aux<=rep; aux++) {
        System.out.print("Informe um n�mero inteiro: ");
        numero = C14EX01.teclado.nextInt();
        if (numero >= 1 && numero <= 100) {
           soma += numero;
           cont++;
        }
     }
     media = (float) soma / cont;
     System.out.println("A m�dia deu "+media);
   }
}


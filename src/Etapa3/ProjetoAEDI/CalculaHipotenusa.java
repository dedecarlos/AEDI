package Etapa3.ProjetoAEDI;

public class CalculaHipotenusa {
   public static void CalculaHipotenusa() {
     double hipotenusa, cateto1, cateto2;
     System.out.print("Informe o valor do cateto 1: ");
     cateto1 = C14EX01.teclado.nextDouble();
     System.out.print("Informe o valor do cateto 1 : ");
     cateto2 = C14EX01.teclado.nextDouble();
     hipotenusa = Math.pow(Math.pow(cateto1,2)+Math.pow(cateto2,2),1.0/2);
     System.out.print("Hipotenusa = "+hipotenusa);
   }
}
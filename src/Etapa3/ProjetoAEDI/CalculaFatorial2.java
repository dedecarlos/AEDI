package Etapa3.ProjetoAEDI;

public class CalculaFatorial2 {
   public static void CalculaFatorial2() {
     long fatorial = 1L, numero;
     System.out.print("Informe um n�mero inteiro: ");
     numero = C14EX01.teclado.nextLong();
     for (int aux=2; aux<=numero; aux++)
        fatorial *= aux;
     System.out.print("Fatorial de "+numero+" = "+fatorial);
   }
}

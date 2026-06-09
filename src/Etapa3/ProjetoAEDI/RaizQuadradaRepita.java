package Etapa3.ProjetoAEDI;

public class RaizQuadradaRepita {
   public static void CalculaRaizQuadrada() {
     int numero;
     double raiz;
     do {
       System.out.print("Informe um n�mero inteiro: ");
       numero = C14EX01.teclado.nextInt();
       raiz = Math.sqrt(numero);
       System.out.println("A raiz quadrada de "+numero+" = "+raiz);
     } while (numero != 0); 
   }
}


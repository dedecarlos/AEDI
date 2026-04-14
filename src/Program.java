public class Program {
    public static void main(String[] args) {
        String simbolo = "*";

        // Repetir a sequência 10 vezes
        for (int repeticao = 1; repeticao < 10; repeticao++) {
            int tamanho = 1;

            // Parte crescente
            for (int i = 1; i <= 8; i++) {
                for (int j = 0; j < tamanho; j++) {
                    System.out.print(simbolo);
                }
                System.out.println();

                // Aumenta o tamanho (dobrando ou somando)
                if (i == 1) tamanho = 2;
                else if (i == 2) tamanho = 4;
                else if (i == 3) tamanho = 8;
                else if (i == 4) tamanho = 20;
                else if (i == 5) tamanho = 44;
                else if (i == 6) tamanho = 92;
                else if (i == 7) tamanho = 128;
            }

            // Parte decrescente
            int[] decrescentes = {92, 44, 20, 8, 4, 2, 1};
            for (int valor : decrescentes) {
                for (int j = 0; j < valor; j++) {
                    System.out.print(simbolo);
                }
                System.out.println();
            }
        }
    }
}

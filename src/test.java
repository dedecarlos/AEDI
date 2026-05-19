public class test {
    public static void main(String[] args) {
        int termos = 10000;   // número de termos da série
        double soma = 0.0;

        for (int k = 0; k < termos; k++) {
            // cada termo é 1 / (2k+1), alternando sinal
            double termo = 1.0 / (2 * k + 1);

            if (k % 2 == 0) {
                soma += termo;   // termos pares (0,2,4...) são somados
            } else {
                soma -= termo;   // termos ímpares (1,3,5...) são subtraídos
            }
        }

         soma = 4 * soma;
        System.out.println("Valor aproximado de π com " + termos + " termos: " + soma);
    }
}

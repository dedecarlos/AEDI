public class RAIZ {
    public static void main(String[] args) {
        double numero = 64;

        // Raiz quadrada (já existe função pronta)
        double raizQuadrada = Math.sqrt(numero);

        // Raiz cúbica (também existe função pronta)
        double raizCubica = Math.cbrt(numero);

        // Raiz quarta
        double raizQuarta = Math.pow(numero, 1.0 / 4.0);

        // Raiz quinta
        double raizQuinta = Math.pow(numero, 1.0 / 5.0);

        // Raiz sexta
        double raizSexta = Math.pow(numero, 1.0 / 6.0);

        System.out.println("Número: " + numero);
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Raiz cúbica: " + raizCubica);
        System.out.println("Raiz quarta: " + raizQuarta);
        System.out.println("Raiz quinta: " + raizQuinta);
        System.out.println("Raiz sexta: " + raizSexta);
    }
}

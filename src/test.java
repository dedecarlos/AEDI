public class test {
    static void main(String[] args) {
        // Define o formato: String(15 char), Inteiro(10 char), Double(10 char com 2 casas decimais)
        String formato = "| %-15s | %-10d | %-10.2f |%n";

        // Cabeçalho
        System.out.println("-------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-10s |%n", "PRODUTO", "QTD", "PREÇO");
        System.out.println("-------------------------------------------");

        // Linhas de Dados
        System.out.printf(formato, "Caderno", 5, 12.50);
        System.out.printf(formato, "Caneta Azul", 120, 1.20);
        System.out.printf(formato, "Mochila", 1, 89.99);

        // Rodapé
        System.out.println("-------------------------------------------");
    }
}

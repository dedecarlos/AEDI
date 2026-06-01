package Etapa3;

//FUNÇAO: Le uma frase e imprime usando o metodo split String
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C12EX25 {
    public static void main(String[] args) {
        String frase = "Eu sou torcedor do Galão da Massa", palavras[] = frase.split(" ");

        for (int aux = 0; aux < palavras.length; aux++) {
            System.out.println(palavras[aux]);
        }
    }
}

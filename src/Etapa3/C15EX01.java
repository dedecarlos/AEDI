package Etapa3;

//FUNCAO: Cria uma ficha de alunos e imprime a situacao deles ao final
//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C15EX01 {
    public static void main(String[] args) {
        // Criando 3 objetos Aluno
        C15EX01aluno aluno1 = new C15EX01aluno("Maria Silva", 101, "Direito", 2024);
        C15EX01aluno aluno2 = new C15EX01aluno("João Pereira", 102, "Engenharia", 2023);
        C15EX01aluno aluno3 = new C15EX01aluno("Ana Costa", 103, "Medicina", 2022);

        // Testando métodos
        aluno1.exibirInfo();
        aluno1.atualizarNotas(23.0, 15.0, 22.0, 12 );
        aluno1.verificarAprovacao();

        aluno2.exibirInfo();
        aluno2.atualizarNotas(12, 22, 25, 15);
        aluno2.verificarAprovacao();

        aluno3.exibirInfo();
        aluno3.atualizarNotas(7.0, 17, 13, 25);
        aluno3.verificarAprovacao();
    }
}

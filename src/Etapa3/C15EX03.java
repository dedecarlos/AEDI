package Etapa3;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C15EX03 {
    public static void main(String[] args) {

        C15EX02exameespecial aluno1 = new C15EX02exameespecial("Maria Silva", 101, "Direito", 2024, "31/01/1992", 62);
        C15EX02exameespecial aluno2 = new C15EX02exameespecial("João Pereira", 102, "Engenharia", 2023, "23/01/1999", 45);
        C15EX02exameespecial aluno3 = new C15EX02exameespecial("Ana Costa", 103, "Medicina", 2022, "12/06/2000",34);

        aluno1.exibirInfo();
        aluno1.dataExameEspecial(aluno1.notas, aluno1.curso);

        aluno2.exibirInfo();
        aluno2.dataExameEspecial(aluno2.notas, aluno2.curso);

        aluno3.exibirInfo();
        aluno3.dataExameEspecial(aluno3.notas, aluno3.curso);

    }
}

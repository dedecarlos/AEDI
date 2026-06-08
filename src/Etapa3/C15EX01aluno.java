package Etapa3;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C15EX01aluno {
     String nome;
     int matricula;
     String curso;
     int anoIngresso;
     double notas;

    public C15EX01aluno(String nome, int matricula, String curso, int anoIngresso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    public void exibirInfo() {
        System.out.println("Aluno: " + nome + " | Matrícula: " + matricula +
                " | Curso: " + curso + " | Ano de ingresso: " + anoIngresso);
    }

    public void atualizarNotas(double prova1, double prova2, double prova3, double trabalhoFinal) {
        notas = (prova1 + prova2 + prova3 + trabalhoFinal);
        System.out.println("Media do aluno " + nome + " = " + notas);
    }

    public void verificarAprovacao() {
        if (notas >= 65.0) {
            System.out.println("Aluno aprovado!");
        }
        else  {
            System.out.println("Aluno reprovado!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public double getnotas() {
        return notas;
    }

    public void setnotas(double notas) {
        this.notas = notas;
    }
}

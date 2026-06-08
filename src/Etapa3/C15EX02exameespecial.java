package Etapa3;

//AUTOR: ANGELO CARLOS MACHADO SANTOS

public class C15EX02exameespecial extends C15EX01aluno {
    private String dataNascimento;
    private String dataExameEspecial;
    double notas;

    public C15EX02exameespecial(String nome, int matricula, String curso, int anoIngresso, String dataNascimento, double nota) {
        super(nome, matricula, curso, anoIngresso);
        this.dataNascimento = dataNascimento;
        this.notas = notas;

    }

    public void exibirInfo() {
        System.out.println("Aluno: " + nome + " | Data de Nascimento: " + dataNascimento + " | Matrícula: " + matricula +
                " | Curso: " + curso + " | Ano de ingresso: " + anoIngresso);
    }


    public void dataExameEspecial(double notas, String curso) {
        if (notas < 65 && curso.equalsIgnoreCase("Direito")){
            System.out.println("Exame Especial dia 23/06");
        }
        else if (notas < 65 && curso.equalsIgnoreCase("Engenharia")){
            System.out.println("Exame Especial dia 24/06");
        }
        else if (notas < 65 && curso.equalsIgnoreCase("Medicina")){
            System.out.println("Exame Especial dia 25/06");
        }
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataExameEspecial() {
        return dataExameEspecial;
    }

    public void setDataExameEspecial(String dataExameEspecial) {
        this.dataExameEspecial = dataExameEspecial;
    }

    public double getNota() {
        return notas;
    }

    public void setNota(double nota) {
        this.notas = nota;
    }
}

package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio02;

//  PARA OS ALUNOS (AlunoVo), SERÁ SOLICITADO APENAS: nome, idade, nota E curso
public class AlunoVo implements Comparable<AlunoVo>{

    private String nome;
    private int idade;
    private double nota;
    private String curso;

    private String classificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public AlunoVo(String nome, int idade, double nota, String curso, String classificacao) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.curso = curso;
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "" +
                "" + nome +
                " - " + idade +
                " - " + nota +
                " - " + classificacao
                ;
    }

    @Override
    public int compareTo(AlunoVo outroAluno) {
        if(this.nota == outroAluno.getNota() && this.idade < outroAluno.getIdade()){
            return 0;
        }else if(this.nota < outroAluno.getNota()){
            return 1;
        }else{
            return -1;
        }
    }

}

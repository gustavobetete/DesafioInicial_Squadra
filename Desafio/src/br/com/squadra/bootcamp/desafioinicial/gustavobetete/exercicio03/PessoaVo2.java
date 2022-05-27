package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio03;

public class PessoaVo2 {

    private String nome;
    private String sobrenome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public PessoaVo2(String nome, String sobrenome, int idade, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome +
                " - TEM " + idade +
                " ANOS E SALÁRIO DE " + salario;
    }

    // IMPRIMA:
    //        OTÁVIA RIBEIRO - TEM 26 ANOS E SALÁRIO DE 300000
}


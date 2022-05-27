package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio01;

public class PessoaVo {

        private String nome;
        private String sobrenome;
        private int idade;

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


    public PessoaVo(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "PessoaVo{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade + '\'' +
                '}';
    }
}


package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio03;

import br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio01.PessoaVo;

//CRIE UMA INTERFACE CHAMADA FilaDeBanco
//ESTA INTERFACE DEVE DEFINIR TRÊS MÉTODOS:
public interface FilaDeBanco {

    public void adicionarPessoa(PessoaVo2 pessoaVo);
    public PessoaVo2 atenderPessoa();
    public int getTamanhoFila();
}

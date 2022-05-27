package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio03;

import br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio01.PessoaVo;

import java.util.Comparator;

public class CompararIdade implements Comparator<PessoaVo2> {

    @Override
    public int compare(PessoaVo2 p1, PessoaVo2 p2) {
        if(p1.getIdade() == p2.getIdade()){
            return 0;
        }else if(p1.getIdade() < p2.getIdade()){
            return 1;
        }else{
            return -1;
        }
    }
}

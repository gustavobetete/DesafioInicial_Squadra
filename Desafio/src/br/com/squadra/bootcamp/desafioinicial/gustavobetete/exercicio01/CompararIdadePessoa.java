package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio01;

import java.util.Comparator;

public class CompararIdadePessoa implements Comparator<PessoaVo> {

    @Override
    public int compare(PessoaVo p1, PessoaVo p2) {
        if(p1.getIdade() == p2.getIdade()){
            return 0;
        }else if(p1.getIdade() < p2.getIdade()){
            return 1;
        }else{
            return -1;
        }
    }
}

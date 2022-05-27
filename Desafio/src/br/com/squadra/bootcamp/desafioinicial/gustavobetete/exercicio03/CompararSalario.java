package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio03;

import br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio01.PessoaVo;

import java.util.Comparator;

public class CompararSalario implements Comparator<PessoaVo2> {

    @Override
    public int compare(PessoaVo2 p1, PessoaVo2 p2) {
        if(p1.getSalario() > p2.getSalario()){
            return -1;
        }else if(p1.getSalario() < p2.getSalario()){
            return 1;
        }else{
            return 0;
        }
    }
}

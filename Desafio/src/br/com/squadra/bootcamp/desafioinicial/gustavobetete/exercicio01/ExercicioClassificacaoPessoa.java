package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio01;
/*

CRIE UMA COLEÇÃO DE PESSOAS (5 PESSOAS)
PARA CADA PESSOA, PEÇA: idade, nome, sobrenome
CLASSIFIQUE A PESSOA COM Comparator E EXIBA A LISTA DE PESSOAS CLASSIFICADA.
LEVAR EM CONSIDERAÇÃO APENAS A REGRA DA IDADE DA PESSOA (IDADE DESCENDENTE)

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioClassificacaoPessoa {

    public static void main(String[] args) {
        PessoaVo p1 = new PessoaVo("Dante", "de Oliveira", 54);
        PessoaVo p2 = new PessoaVo("Marina", "Silveira", 32);
        PessoaVo p3 = new PessoaVo("Avelino", "de Costa", 32);
        PessoaVo p4 = new PessoaVo("Roberto", "Campos", 71);
        PessoaVo p5 = new PessoaVo("Virgínio", "das Almas", 64);

        List<PessoaVo> pessoas = new ArrayList();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        System.out.println("Lista original");
        for(PessoaVo p : pessoas){
            System.out.println(p.toString());
        }
        System.out.println("-------------------------");

        System.out.println("Lista ordenada por idade descendente");

        Collections.sort(pessoas, new CompararIdadePessoa());
        for(PessoaVo p : pessoas){
            System.out.println(p.toString());
        }
    }

}

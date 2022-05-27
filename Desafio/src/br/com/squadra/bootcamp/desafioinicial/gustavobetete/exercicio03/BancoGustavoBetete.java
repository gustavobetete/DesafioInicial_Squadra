package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio03;

import br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio01.PessoaVo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//CRIE UMA CLASSE CHAMADA BancoWanderlucio QUE IMPLEMENTE ESTA INTERFACE

public class BancoGustavoBetete implements FilaDeBanco{

    List<PessoaVo2> filaDeRico = new ArrayList<>();
    List<PessoaVo2> filaDeMuitoIdoso = new ArrayList<>();
    List<PessoaVo2> filaDeIdoso = new ArrayList<>();
    List<PessoaVo2> filaNormal = new ArrayList<>();

    /**
     * DEVE ADICIONAR UMA PESSOA NA FILA DE ACORDO COM A PRIORIDADE DELA
     * O SISTEMA DE BANCO CRIA DIVERSAS FILAS INTERNAMENTE LEVANDO EM CONSIDERAÇÃO:
     * - filaDeRico - SÓ ENTRAM PESSOAS COM SALÁRIO MAIOR QUE 50.000. QUANTO MAIOR O SALÁRIO MAIOR A PRIORIDADE
     * - filaDeMuitoIdoso - SÓ ENTRAM CLIENTES MAIORES QUE 85 ANOS. QUANTO MAIOR A IDADE, MAIOR A PRIORIDADE
     * - filaDeIdoso - SÓ ENTRAM PESSOAS MAIORES DE 60 ANOS, DESDE DE QUE NÃO ESTEJAM NAS FILAS ACIMA. NESTA FILA, DEVE-SE RESPEITAR A ORDEM DE CHEGADA.
     * - filaNormal - É UMA FILA NORMAL PARA OS DEMAIS CLIENTES. RESPEITA A ORDEM DE CHEGADA
     */
    @Override
    public void adicionarPessoa(PessoaVo2 pessoaVo) {
        if(pessoaVo.getSalario() > 50000){
            filaDeRico.add(pessoaVo);
        }else if(pessoaVo.getIdade() > 85){
            filaDeMuitoIdoso.add(pessoaVo);
        }else if(pessoaVo.getIdade() > 60){
            filaDeIdoso.add(pessoaVo);
        }else{
            filaNormal.add(pessoaVo);
        }

        Collections.sort(filaDeRico, new CompararSalario());
        Collections.sort(filaDeMuitoIdoso, new CompararIdade());
    }

    /**
     * ESTE MÉTODO DEVE RETORNAR A PessoaVo QUE SERÁ ATENDIDA. LEVE EM CONSIDERAÇÃO AS REGRAS ACIMA
     * */

    @Override
    public PessoaVo2 atenderPessoa() {
        PessoaVo2 pessoaAtendida;
        if(filaDeRico.size() > 0){
            pessoaAtendida = filaDeRico.get(0);
            filaDeRico.remove(0);
            return pessoaAtendida;
        }else if(filaDeMuitoIdoso.size() > 0){
            pessoaAtendida = filaDeMuitoIdoso.get(0);
            filaDeMuitoIdoso.remove(0);
            return pessoaAtendida;
        }else if(filaDeIdoso.size() > 0){
            pessoaAtendida = filaDeIdoso.get(0);
            filaDeIdoso.remove(0);
            return pessoaAtendida;
        }else if(filaNormal.size() > 0){
            pessoaAtendida = filaNormal.get(0);
            filaNormal.remove(0);
            return pessoaAtendida;
        }
        return null;
    }

    /**
     * ESTE MÉTODO DEVOLVE O QUANTAS PESSOAS QUE AINDA ESTÃO ESTÃO AGUARDANDO ATENDIMENTO (TOTAL DE PESSOAS NAS FILAS)
     * */

    @Override
    public int getTamanhoFila() {
        int totalPessoas = filaDeRico.size() + filaDeMuitoIdoso.size() + filaDeIdoso.size() + filaNormal.size();
        return totalPessoas;
    }
}

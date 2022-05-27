package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio03;

/*CRIE UMA CLASSE PARA TESTAR A FILA DO SEU BANCO (BancoWanderlucio)

NESTA CLASSE TestandoBancoWanderlucio PERCORRA O BancoWanderlucio E IMPRIMA ATRAVÉS DO SEGUINTE COMANDO:
System.out.println(bancoWanderlucio.atenderPessoa());
        IMPRIMA:
        OTÁVIA RIBEIRO - TEM 26 ANOS E SALÁRIO DE 300000

 */
public class TestandoBancoGustavoBetete {


    public static void main(String[] args) {

        BancoGustavoBetete bancoGustavoBetete = new BancoGustavoBetete();

        PessoaVo2 pessoa1 = new PessoaVo2("Dante", "de Oliveira", 54, 51000);
        PessoaVo2 pessoa2 = new PessoaVo2("Marina", "Silveira", 65, 1160);
        PessoaVo2 pessoa3 = new PessoaVo2("Avelino", "de Costa", 22, 2300);
        PessoaVo2 pessoa4 = new PessoaVo2("Roberto", "Campos", 71, 60000);
        PessoaVo2 pessoa5 = new PessoaVo2("Virgínio", "das Almas", 87, 3400);

        bancoGustavoBetete.adicionarPessoa(pessoa1);
        bancoGustavoBetete.adicionarPessoa(pessoa2);
        bancoGustavoBetete.adicionarPessoa(pessoa3);
        bancoGustavoBetete.adicionarPessoa(pessoa4);
        bancoGustavoBetete.adicionarPessoa(pessoa5);

        System.out.println("Pessoas a serem atendidas:" + bancoGustavoBetete.getTamanhoFila());
        System.out.println(bancoGustavoBetete.atenderPessoa());
        System.out.println("Pessoas a serem atendidas:" + bancoGustavoBetete.getTamanhoFila());
        System.out.println(bancoGustavoBetete.atenderPessoa());
        System.out.println("Pessoas a serem atendidas:" + bancoGustavoBetete.getTamanhoFila());
        System.out.println(bancoGustavoBetete.atenderPessoa());
        System.out.println("Pessoas a serem atendidas:" + bancoGustavoBetete.getTamanhoFila());
        System.out.println(bancoGustavoBetete.atenderPessoa());
        System.out.println("Pessoas a serem atendidas:" + bancoGustavoBetete.getTamanhoFila());
        System.out.println(bancoGustavoBetete.atenderPessoa());
        System.out.println("Pessoas a serem atendidas:" + bancoGustavoBetete.getTamanhoFila());


    }
}

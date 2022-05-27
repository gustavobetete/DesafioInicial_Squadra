package br.com.squadra.bootcamp.desafioinicial.gustavobetete.exercicio02;

/*
UMA EMPRESA NOS CONTRATOU PARA FAZER UM PARA FAZER UM SISTEMA DE VESTIBULAR DE VAGAS EXCEDENTES.

PARA OS ALUNOS (AlunoVo), SERÁ SOLICITADO APENAS: nome, idade, nota E curso
TEMOS APENAS 3 VAGAS. ENTÃO SELECIONE OS ALUNOS QUE TIVERAM AS 3 MAIORES NOTAS.
CASO OS ALUNOS TENHAM NOTAS IGUAIS, VOCÊ DEVE DAR PREFERÊNCIA PARA OS ALUNOS MAIS VELHOS.
IMPRIMA A LISTA NO SEGUINTE MODELO:

CURSO DE MEDICINA

DANTE DE OLIVEIRA - 54 - 8.8 - APROVADO
MARINA SILVEIRA   - 32 - 8.8 - APROVADO
AVELINO DE COSTA  - 32 - 8.7 - APROVADO
ROBERTO CAMPOS    - 31 - 8.7 - REPROVADO
VIRGÍNIO DAS ALMAS- 64 - 8.5 - REPROVADO

Utilize AlunoVo ou DTO, mas utilize Comparable
 */

import java.util.ArrayList;
import java.util.Collections;

public class ExercicioVestibularExcedente  {


    public static void main(String[] args) {

        ArrayList<AlunoVo> listaAlunos = new ArrayList<>();

        AlunoVo a1 = new AlunoVo("Roberto Campos", 31, 8.7, "Medicina", "REPROVADO");
        AlunoVo a2 = new AlunoVo("Dante de Oliveira", 54, 8.8, "Medicina", "APROVADO");
        AlunoVo a3 = new AlunoVo("Avelino de Costa", 32, 8.7, "Medicina", "APROVADO");
        AlunoVo a4 = new AlunoVo("Virgínio das Almas", 64, 8.5, "Medicina", "REPROVADO");
        AlunoVo a5 = new AlunoVo("Marina Silveira", 32, 8.8, "Medicina", "APROVADO");

        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);
        listaAlunos.add(a5);

        System.out.println("lista original");
        System.out.println("CURSO DE MEDICINA");

        for(AlunoVo a : listaAlunos){
            System.out.println(a.toString());
        }
        System.out.println("---------------------");
        Collections.sort(listaAlunos, AlunoVo::compareTo);

        System.out.println("Lista ordenada");
        System.out.println("CURSO DE MEDICINA");
        for(AlunoVo a : listaAlunos){
            System.out.println(a.toString());
        }
    }

}

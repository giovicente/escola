package com.letscode.professores.utils;

import com.letscode.professores.enums.TipoVinculoProfessor;

public class Impressora {

    private final static String MENSAGEM_INSERCAO_NOME_PROFESSOR = "Insira o nome do(a) professor(a): ";
    private final static String MENSAGEM_RETORNO_NOME_PROFESSOR = "O nome do(a) professor(a) é ";

    private final static String MENSAGEM_RETORNO_INICIAL_PROFESSOR = "A inicial do(a) professor(a) é ";

    private final static String MENSAGEM_INSERCAO_IDADE_PROFESSOR = "Digite a idade do(a) professor(a): ";
    private final static String MENSAGEM_RETORNO_IDADE_PROFESSOR = "A idade do(a) professor(a) é ";

    private final static String MENSAGEM_INSERCAO_NUMERO_CADASTRO_PROFESSOR = "Digite o número de cadastro do(a) professor(a): ";
    private final static String MENSAGEM_RETORNO_NUMERO_CADASTRO_PROFESSOR = "O cadastro do(a) professor(a) é ";


    private final static String MENSAGEM_INSERCAO_SALARIO_PROFESSOR = "Digite o salário do(a) professor(a): ";
    private final static String MENSAGEM_RETORNO_SALARIO_PROFESSOR = "O salário do(a) professor(a) é %.2f %n";

    private final static String MENSAGEM_INSERCAO_RESPOSTA_PROFESSOR_AUXILIAR = "O(A) professor(a) é auxiliar? ";

    private final static String MENSAGEM_INSERCAO_TIPO_VINCULO = "Qual é o vínculo do(a) professor(a) [INTEGRAL ou MEIO_PERIODO]? ";
    private final static String MENSAGEM_RETORNO_TIPO_VINCULO = "O vínculo do(a) professor(a) é ";

    private final static String MENSAGEM_NOME_BONUS_SALARIO_FORMAT
            = "O nome do professor é %s. O bônus do professor é %.2f. O salário atualizado é %.2f.";

    private final static String MENSAGEM_CALCULO_HORAS_TRABALHADAS = "Para ganhar o salário, o professor trabalhou por %.2f horas.%n";

    public static void imprimirMsgInsercaoNomeProfessor() {
        System.out.print(MENSAGEM_INSERCAO_NOME_PROFESSOR);
    }

    public static void imprimirMsgInsercaoIdadeProfessor() {
        System.out.print(MENSAGEM_INSERCAO_IDADE_PROFESSOR);
    }

    public static void imprimirMsgInsercaoNumeroCadastroProfessor() {
        System.out.print(MENSAGEM_INSERCAO_NUMERO_CADASTRO_PROFESSOR);
    }

    public static void imprimirMsgInsercaoSalarioProfessor() {
        System.out.print(MENSAGEM_INSERCAO_SALARIO_PROFESSOR);
    }

    public static void imprimirMsgRespostaProfessorAuxiliar() {
        System.out.print(MENSAGEM_INSERCAO_RESPOSTA_PROFESSOR_AUXILIAR);
    }

    public static void imprimirMsgInsercaoTipoVinculo() {
        System.out.print(MENSAGEM_INSERCAO_TIPO_VINCULO);
    }

    public static void imprimirNomeProfessor(String nomeProfessor) {
        System.out.println(MENSAGEM_RETORNO_NOME_PROFESSOR + nomeProfessor);
    }

    public static void imprimirInicialNomeProfessor(String nomeProfessor) {
        System.out.println(MENSAGEM_RETORNO_INICIAL_PROFESSOR + nomeProfessor.charAt(0));
    }

    public static void imprimirIdadeProfessor(int idadeProfessor) {
        System.out.println(MENSAGEM_RETORNO_IDADE_PROFESSOR + idadeProfessor);
    }

    public static void imprimirNumeroCadastroProfessor(long numeroCadastroProfessor) {
        System.out.println(MENSAGEM_RETORNO_NUMERO_CADASTRO_PROFESSOR + numeroCadastroProfessor);
    }

    public static void imprimirSalarioProfessor(float salarioProfessor) {
        System.out.printf(MENSAGEM_RETORNO_SALARIO_PROFESSOR, salarioProfessor);
    }

    public static void imprimirTipoVinculoProfessor(TipoVinculoProfessor tipoVinculoProfessor) {
        System.out.println(MENSAGEM_RETORNO_TIPO_VINCULO + tipoVinculoProfessor.toString().replace('_', ' '));
    }

    public static void imprimirRetornoProfessorAuxiliar(boolean isProfessorAuxiliar) {
        System.out.println(MENSAGEM_INSERCAO_RESPOSTA_PROFESSOR_AUXILIAR + isProfessorAuxiliar);
    }

    public static void imprimirMensagemNomeBonusSalario(String nomeProfessor, float bonusProfessor, float salarioProfessor) {
        System.out.printf(MENSAGEM_NOME_BONUS_SALARIO_FORMAT, nomeProfessor, bonusProfessor, salarioProfessor);
    }

    public static void imprimirMensagemCalculoHoras(float horasTrabalhadas) {
        System.out.printf(MENSAGEM_CALCULO_HORAS_TRABALHADAS, horasTrabalhadas);
    }

}

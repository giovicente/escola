package com.letscode.variaveis;

import com.letscode.variaveis.enums.TipoVinculoProfessor;

public class Main {

    public static void main(String[] args) {

        // Variáveis para armazenar texto / caracteres
        String nomeProfessor = "Giovanni";
        char inicialNomeProfessor = 'G';

        // Variáveis para guardar números inteiros
        // byte, short
        int idadeProfessor = 29;
        long numeroCadastroProfessor = 5558790L;

        // Variáveis para guardar números decimais
        // double, float
        // para fins didáticos vamos de float... mas iremos falar de BigDecimal
        // double slarioProfessor = 1000d;
        float salarioProfessor = 1000.5f;

        // has
        boolean isProfessorAuxiliar = false;

        TipoVinculoProfessor tipoVinculoProfessor = TipoVinculoProfessor.MEIO_PERIODO;

        System.out.println("O nome do professor é " + nomeProfessor);
        System.out.println("A idade do professor é " + idadeProfessor);
        System.out.println("O cadastro do professor é " + numeroCadastroProfessor);
        System.out.printf("O salário do professor é %.2f %n", salarioProfessor);
        System.out.println("O vínculo do professor é "
                + tipoVinculoProfessor.toString().replace('_', ' '));

        final float VALOR_MINIMO_HORA_AULA = 45f;

        float fatorCalculoBonusProfessor = 0.1f;

        // + - * /
        float bonusProfessor = salarioProfessor * fatorCalculoBonusProfessor;

        // salarioProfessor = salarioProfessor + bonusProfessor;
        // salarioProfessor += bonusProfessor;

        System.out.printf("O nome do professor é %s. O bônus do professor é %.2f. " +
                "O salário atualizado é %.2f %n", nomeProfessor, bonusProfessor, (salarioProfessor += bonusProfessor));

        System.out.printf("Para ganhar o salário, o professor trabalhou por %.2f horas",
                (salarioProfessor / VALOR_MINIMO_HORA_AULA));

        // Equivale ao %n quando utilizamos a quebra de linha como argumento do printf
        System.out.print("\n");

        // salarioProfessor++ salarioProfessor--
        // ++salarioProfessor;
        System.out.println("Salário professor +1 -> " + ++salarioProfessor);
    }

}

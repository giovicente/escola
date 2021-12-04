package com.letscode.variaveis.service;

public class Calculadora {

    public static float calculaBonusProfessor(float salarioProfessor, float fatorCalculo) {
        return salarioProfessor * fatorCalculo;
    }

    public static float calcularHorasTrabalhadas(float salarioProfessor) {
        final float VALOR_MINIMO_HORA_AULA = 45f;
        return salarioProfessor / VALOR_MINIMO_HORA_AULA;
    }

}

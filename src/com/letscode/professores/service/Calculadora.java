package com.letscode.professores.service;

import com.letscode.professores.utils.Leitor;

public class Calculadora {

    public static float calculaBonusProfessor(float salarioProfessor, float fatorCalculo) {
        return salarioProfessor * fatorCalculo;
    }

    public static float calcularHorasTrabalhadas(float salarioProfessor) {
        final float VALOR_MINIMO_HORA_AULA = 45f;

        return salarioProfessor / VALOR_MINIMO_HORA_AULA;
    }

    public static float atualizarSalarioProfessor(float salarioProfessor, float bonusCalculado) {
        return salarioProfessor += bonusCalculado;
    }

}

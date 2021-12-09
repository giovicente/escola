package com.letscode.professores.service;

import com.letscode.professores.utils.Leitor;

public class Calculadora {

    public static float calculaBonusProfessor(float salarioProfessor, float fatorCalculo) {
        return salarioProfessor * fatorCalculo;
    }

    public static float calcularHorasTrabalhadas(float salarioProfessor, float valorHora) {
        final float VALOR_MINIMO_HORA_AULA = 45f;

//        do {
//            System.out.println("Valor da hora de aula abaixo do mínimo. Insira um valor igual ou maior que 45");
//            valorHora = Leitor.escanearValorHoraProfessor();
//        } while (valorHora < VALOR_MINIMO_HORA_AULA);

        while (valorHora < VALOR_MINIMO_HORA_AULA) {
            System.out.println("Valor da hora de aula abaixo do mínimo. Insira um valor igual ou maior que 45");
            valorHora = Leitor.escanearValorHoraProfessor();
        }

        return salarioProfessor / valorHora;
    }

    public static float atualizarSalarioProfessor(float salarioProfessor, float bonusCalculado) {
        return salarioProfessor += bonusCalculado;
    }

}

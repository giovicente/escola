package com.letscode.professores;

import com.letscode.professores.enums.TipoVinculoProfessor;
import com.letscode.professores.service.Calculadora;
import com.letscode.professores.utils.Impressora;
import com.letscode.professores.utils.Leitor;

public class Main {

    public static void main(String[] args) {

        String nomeProfessor = Leitor.escanearNomeProfessor();

        int idadeProfessor = Leitor.escanearIdadeProfessor();
        long numeroCadastroProfessor = Leitor.escanearNumeroCadastroProfessor();

        float salarioProfessor = Leitor.escanearSalarioProfessor();

        boolean isProfessorAuxiliar = Leitor.escanearRespostaProfessorAuxiliar();
        TipoVinculoProfessor tipoVinculoProfessor = Leitor.escanearTipoVinculo();

        Leitor.fecharScanner();

        tratarImpressoes(nomeProfessor, idadeProfessor, numeroCadastroProfessor, salarioProfessor,
                isProfessorAuxiliar, tipoVinculoProfessor);

        float fatorCalculoBonusProfessor = 0.1f;
        float bonusProfessor = Calculadora.calculaBonusProfessor(salarioProfessor, fatorCalculoBonusProfessor);

        salarioProfessor = Calculadora.atualizarSalarioProfessor(salarioProfessor, bonusProfessor);
        Impressora.imprimirMensagemNomeBonusSalario(nomeProfessor, bonusProfessor, salarioProfessor);

    }

    private static void tratarImpressoes(String nomeProfessor, int idadeProfessor, long numeroCadastroProfessor,
                                         float salarioProfessor, boolean isProfessorAuxiliar,
                                         TipoVinculoProfessor tipoVinculoProfessor) {
        Impressora.imprimirNomeProfessor(nomeProfessor);
        Impressora.imprimirInicialNomeProfessor(nomeProfessor);
        Impressora.imprimirIdadeProfessor(idadeProfessor);
        Impressora.imprimirNumeroCadastroProfessor(numeroCadastroProfessor);
        Impressora.imprimirSalarioProfessor(salarioProfessor);
        Impressora.imprimirTipoVinculoProfessor(tipoVinculoProfessor);
        Impressora.imprimirRetornoProfessorAuxiliar(isProfessorAuxiliar);
        Impressora.imprimirMensagemCalculoHoras(Calculadora.calcularHorasTrabalhadas(salarioProfessor));
    }

}

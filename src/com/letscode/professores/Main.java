package com.letscode.professores;

import com.letscode.professores.enums.TipoVinculoProfessor;
import com.letscode.professores.service.Calculadora;
import com.letscode.professores.utils.Impressora;
import com.letscode.professores.utils.Leitor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanOpcao = new Scanner(System.in);


        // tamanho do array == N; numero de índices == N-1
        // length == 4 indexes == 3
        //String[] disciplinas = {"POO", "Spring", "Algoritmos", "TDD"};
        String[] disciplinas = new String[4];

        System.out.println("Digite as disciplinas.");
        for (int i = 0; i < disciplinas.length; i++) {
            disciplinas[i] = scanOpcao.next();
        }

        for (int i = disciplinas.length - 1; i >= 0; i--) {
            System.out.println(disciplinas[i]);
        }

        int[] notas = {10, 10, 10};

        int opcao = 0;
        String nomeAuxiliar = "";
        String indicadorContinuidade = "";

        do {
            System.out.println("Digite a opção do Auxiliar - 1 - cadastra; 2 - consulta");
            opcao = scanOpcao.nextInt();

            switch (opcao) {
                case 1:
                    nomeAuxiliar = Leitor.escanearNomeProfessor();
                    break;
                case 2:
                    if (nomeAuxiliar.isEmpty()) {
                        System.out.println("Não há professor auxiliar cadastrado");
                    } else {
                        System.out.printf("O nome do auxiliar é %s.%n", nomeAuxiliar);
                    }
                    break;
                default:
                    System.out.println("Por favor, insira um valor válido");
                    break;
            }

            System.out.println("Operação realizada. Digite [S] para realizar uma nova operação. " +
                    "Digite qualquer outra tecla para sair.");
            indicadorContinuidade = scanOpcao.next();
        } while (indicadorContinuidade.equalsIgnoreCase("S"));


        String nomeProfessor = Leitor.escanearNomeProfessor();

        int idadeProfessor = Leitor.escanearIdadeProfessor();
        long numeroCadastroProfessor = Leitor.escanearNumeroCadastroProfessor();

        float salarioProfessor = Leitor.escanearSalarioProfessor();
        float valorHora = Leitor.escanearValorHoraProfessor();
        Impressora.imprimirMensagemCalculoHoras(Calculadora.calcularHorasTrabalhadas(salarioProfessor, valorHora));

        boolean isProfessorAuxiliar = Leitor.escanearRespostaProfessorAuxiliar();
        TipoVinculoProfessor tipoVinculoProfessor = Leitor.escanearTipoVinculo();

        tratarImpressoes(nomeProfessor, idadeProfessor, numeroCadastroProfessor, salarioProfessor,
                isProfessorAuxiliar, tipoVinculoProfessor, valorHora);

        float fatorCalculoBonusProfessor = 0.1f;
        float bonusProfessor = Calculadora.calculaBonusProfessor(salarioProfessor, fatorCalculoBonusProfessor);

        salarioProfessor = Calculadora.atualizarSalarioProfessor(salarioProfessor, bonusProfessor);
        Impressora.imprimirMensagemNomeBonusSalario(nomeProfessor, bonusProfessor, salarioProfessor);

        Leitor.fecharScanner();

    }

    private static void tratarImpressoes(String nomeProfessor, int idadeProfessor, long numeroCadastroProfessor,
                                         float salarioProfessor, boolean isProfessorAuxiliar,
                                         TipoVinculoProfessor tipoVinculoProfessor, float valorHora) {
        Impressora.imprimirNomeProfessor(nomeProfessor);
        Impressora.imprimirInicialNomeProfessor(nomeProfessor);
        Impressora.imprimirIdadeProfessor(idadeProfessor);
        Impressora.imprimirNumeroCadastroProfessor(numeroCadastroProfessor);
        Impressora.imprimirSalarioProfessor(salarioProfessor);
        Impressora.imprimirTipoVinculoProfessor(tipoVinculoProfessor);
        Impressora.imprimirRetornoProfessorAuxiliar(isProfessorAuxiliar);

    }

}

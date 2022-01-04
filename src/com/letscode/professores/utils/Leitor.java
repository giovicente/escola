package com.letscode.professores.utils;

import com.letscode.professores.enums.TipoVinculoProfessor;

import java.util.Scanner;

public class Leitor {

    private static Scanner scanEscola = new Scanner(System.in);

    public static String escanearNomeProfessor() {
        Impressora.imprimirMsgInsercaoNomeProfessor();
        String nomeProfessor = scanEscola.nextLine();
        return nomeProfessor;
    }

    public static int escanearIdadeProfessor() {
        Impressora.imprimirMsgInsercaoIdadeProfessor();
        return scanEscola.nextInt();
    }

    public static long escanearNumeroCadastroProfessor() {
        Impressora.imprimirMsgInsercaoNumeroCadastroProfessor();
        return scanEscola.nextLong();
    }

    public static float escanearSalarioProfessor() {
        Impressora.imprimirMsgInsercaoSalarioProfessor();
        return scanEscola.nextFloat();
    }

    public static boolean escanearRespostaProfessorAuxiliar() {
        Impressora.imprimirMsgRespostaProfessorAuxiliar();
        return scanEscola.nextBoolean();
    }

    public static TipoVinculoProfessor escanearTipoVinculo() {
        Impressora.imprimirMsgInsercaoTipoVinculo();
        return TipoVinculoProfessor.valueOf(scanEscola.next());
    }

    public static float escanearValorHoraProfessor() {
        System.out.print("Digite o valor / hora professor(a): ");
        return scanEscola.nextFloat();
    }

    public static String escanearNomeDisciplina(int i) {
        Impressora.imprimirMsgInsercaoDisciplina(i);
        return scanEscola.next();
    }

    public static void fecharScanner() {
        System.out.println("Fechando o scanner");
        scanEscola.close();
    }
}

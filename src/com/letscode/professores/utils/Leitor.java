package com.letscode.professores.utils;

import com.letscode.professores.enums.TipoVinculoProfessor;

import java.util.Scanner;

public class Leitor {

    private static Scanner scanProfessor = new Scanner(System.in);

    public static String escanearNomeProfessor() {
        Impressora.imprimirMsgInsercaoNomeProfessor();
        String nomeProfessor = scanProfessor.nextLine();
        return nomeProfessor;
    }

    public static int escanearIdadeProfessor() {
        Impressora.imprimirMsgInsercaoIdadeProfessor();
        return scanProfessor.nextInt();
    }

    public static long escanearNumeroCadastroProfessor() {
        Impressora.imprimirMsgInsercaoNumeroCadastroProfessor();
        return scanProfessor.nextLong();
    }

    public static float escanearSalarioProfessor() {
        Impressora.imprimirMsgInsercaoSalarioProfessor();
        return scanProfessor.nextFloat();
    }

    public static boolean escanearRespostaProfessorAuxiliar() {
        Impressora.imprimirMsgRespostaProfessorAuxiliar();
        return scanProfessor.nextBoolean();
    }

    public static TipoVinculoProfessor escanearTipoVinculo() {
        Impressora.imprimirMsgInsercaoTipoVinculo();
        return TipoVinculoProfessor.valueOf(scanProfessor.next());
    }

    public static float escanearValorHoraProfessor() {
        System.out.print("Digite o valor / hora professor(a): ");
        return scanProfessor.nextFloat();
    }

    public static void fecharScanner() {

        System.out.println("Fechando o scanner");
        scanProfessor.close();
    }
}

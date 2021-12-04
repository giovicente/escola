package com.letscode.variaveis.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner scanProfessor;

    public static String escanearNomeProfessor() {

        scanProfessor = new Scanner(System.in);
        Impressora.imprimirMsgInsercaoNomeProfessor();
        String nomeProfessor = scanProfessor.nextLine();

        return nomeProfessor;
    }

}

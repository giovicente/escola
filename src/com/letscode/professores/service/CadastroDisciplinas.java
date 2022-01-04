package com.letscode.professores.service;

import com.letscode.professores.utils.Leitor;

public class CadastroDisciplinas {

    public static void cadastrarDisciplina() {
        // tamanho do array == N; numero de índices == N-1
        // length == 4; indexes == 3
        // String[] disciplinas = {"POO", "Spring", "Algoritmos", "TDD"};
        String[] disciplinas = new String[4];

        for (int i = 0; i < disciplinas.length; i++) {
            disciplinas[i] = Leitor.escanearNomeDisciplina(i);
        }

        for (int i = disciplinas.length - 1; i >= 0; i--) {
            System.out.println(disciplinas[i]);
        }
    }
}

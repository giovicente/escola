package com.letscode.variaveis.enums;

public enum TipoVinculoProfessor {
    INTEGRAL("Integral"), MEIO_PERIODO("Meio período");


    private String descricao;

    TipoVinculoProfessor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

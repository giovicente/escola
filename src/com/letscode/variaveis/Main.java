package com.letscode.variaveis;

import com.letscode.variaveis.enums.TipoVinculoProfessor;
import com.letscode.variaveis.service.Calculadora;
import com.letscode.variaveis.utils.Impressora;
import com.letscode.variaveis.utils.Leitor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variáveis para armazenar texto / caracteres
        Scanner scanner = new Scanner(System.in);

        String nomeProfessor = Leitor.escanearNomeProfessor();

        char inicialNomeProfessor = nomeProfessor.charAt(0);

        // Variáveis para guardar números inteiros
        // byte, short
        System.out.print("Digite a idade do professor: ");
        Scanner scanIdade = new Scanner(System.in);
        int idadeProfessor = scanIdade.nextInt();
        long numeroCadastroProfessor = 5558790L;

        // Variáveis para guardar números decimais
        // double, float
        // para fins didáticos vamos de float... mas iremos falar de BigDecimal
        // double slarioProfessor = 1000d;
       System.out.println("Digite o salário: ");
       float salarioProfessor = scanner.nextFloat();

        // has
        System.out.print("O professor é auxiliar? ");
        boolean isProfessorAuxiliar = scanner.nextBoolean();

        TipoVinculoProfessor tipoVinculoProfessor = TipoVinculoProfessor.MEIO_PERIODO;

        System.out.println("O nome do professor é " + nomeProfessor);
        System.out.println("O nome do professor é " + inicialNomeProfessor);
        System.out.println("A idade do professor é " + idadeProfessor);
        System.out.println("O cadastro do professor é " + numeroCadastroProfessor);
        System.out.printf("O salário do professor é %.2f %n", salarioProfessor);
        System.out.println("O vínculo do professor é " + tipoVinculoProfessor.toString().replace('_', ' '));
        System.out.println("O professor é auxiliar? " + isProfessorAuxiliar);

        float fatorCalculoBonusProfessor = 0.1f;

        // + - * /
        float bonusProfessor = Calculadora.calculaBonusProfessor(salarioProfessor, fatorCalculoBonusProfessor);

        System.out.printf("O nome do professor é %s. O bônus do professor é %.2f. " +
                "O salário atualizado é %.2f %n", nomeProfessor, bonusProfessor, (salarioProfessor += bonusProfessor));

        Calculadora calculadora = new Calculadora();

        System.out.printf("Para ganhar o salário, o professor trabalhou por %.2f horas",
                calculadora.calcularHorasTrabalhadas(salarioProfessor));

        // Equivale ao %n quando utilizamos a quebra de linha como argumento do printf
        System.out.print("\n");

        // salarioProfessor++ salarioProfessor--
        // ++salarioProfessor;
        System.out.println("Salário professor +1 -> " + ++salarioProfessor);


    }

}

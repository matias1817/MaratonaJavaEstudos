package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.idade = 99;
        funcionario.nome = "zé";
        funcionario.salarios = new double[]{1000, 200, 0.5, 4000};

        funcionario.imprime();
        funcionario.imprimeMedia();
    }
}

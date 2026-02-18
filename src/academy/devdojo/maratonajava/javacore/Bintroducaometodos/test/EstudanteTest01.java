package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante01.nome = "Carla";
        estudante01.idade = 19;
        estudante01.sexo = 'F';

        estudante02.nome = "Carlo";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        imprimeEstudante.imprime(estudante01);
        imprimeEstudante.imprime(estudante02);

    }
}

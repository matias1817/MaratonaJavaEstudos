package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();

        calculadora1.somaDoisNumeros(12,2);
        calculadora1.subtraiDoisNumeros(10,5);
        calculadora1.multiplicaDoisNumeros(2, 4);
    }
}

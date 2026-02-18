package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,4,4,5};
        calculadora.somaArraay(numeros);
        calculadora.somaArraayVarArgs(1,2,3,4,5,56,7);
    }
}

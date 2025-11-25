package academy.devdojo.maratonajava.introducao;

public class Aula04Operadore {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        int resultado = numero1 * numero2;

        System.out.println(numero1 + numero2);

        //operadores relacionais e logicos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 1000;
        float valorPlaystattion = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystattion || valorTotalContaPoupança > valorPlaystattion;

        //atribuiçao = += -= *= /= %= ++ --
        double bonus = 1800;

        bonus += 1000;
        bonus -= 200;
        bonus *= 20;
        bonus /= 2;
        bonus %= 2;
        bonus++;




    }

}

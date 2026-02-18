package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int number1, int number2){
        System.out.println(number1 + number2);
    }

    public void subtraiDoisNumeros(int number1, int number2){
        System.out.println(number1 - number2);
    }
    public void multiplicaDoisNumeros(int number1, int number2){
        System.out.println(number1 * number2);
    }

    public double divideDoisNumeros(double number1, double number2){
        if (number2 != 0){
            return number1 / number2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double number1, double number2){
        if ( number2 == 0){
            System.out.println("não existe divisão por 0");
            return;
        }
        System.out.println(number1/number2);
    }

    public void alteraDoisNumeros (int number1, int number2){
        number1 = 99;
        number2 = 33;
        System.out.println("Dentro");
        System.out.println(number1);
        System.out.println(number2);
    }

    public void somaArraay(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaArraayVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }




}

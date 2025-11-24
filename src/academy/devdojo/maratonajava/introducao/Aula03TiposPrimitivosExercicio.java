package academy.devdojo.maratonajava.introducao;

/*
Pratica
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguite msg:

Eu <nome>, morando no endereco <endereco>,
confirmo que recebi o salario <salario>, na data <data>
 */


public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "matias";
        String endereco = "rua 2, bairro 1";
        String data = "11/09/2025";
        int salario = 7900;

        System.out.println("Eu "+ nome + " morando no enderco " + endereco );
        System.out.println("confirmo que recebi o salario " + salario + " na data " + data );
    }
}

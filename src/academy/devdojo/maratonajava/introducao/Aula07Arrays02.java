package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "personagem1";
        nomes[1] = "personagem2";
        nomes[2] = "personagem3";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}

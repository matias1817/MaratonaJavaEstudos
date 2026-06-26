package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime("monster");
        for(int episodio : anime.getEpisodios()){
            System.out.println(episodio + " ");
        }
    }
}

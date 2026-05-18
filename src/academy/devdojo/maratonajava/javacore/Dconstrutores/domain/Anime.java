package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {

    private String tipo;
    private int epsodio;
    private String nome;
    private String genero;
    private String estudio;

    public Anime (String name) {
        this.nome = name;
    }

    public Anime(String tipo, int epsodio, String nome, String genero) {
        this.tipo = tipo;
        this.epsodio = epsodio;
        this.nome = nome;
        this.genero = genero;
    }

    public Anime(String tipo, int epsodio, String nome, String genero, String estudio) {
        this(tipo, epsodio, nome, genero);
        this.estudio = estudio;
    }
    public Anime(){

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEpsodio(int epsodio){
        this.epsodio = epsodio;
    }
    public int getEpsodio(){
        return this.epsodio;
    }



    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodio);
        System.out.println(this.genero);
    }
}


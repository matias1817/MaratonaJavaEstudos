package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {

    private String tipo;
    private int epsodio;
    private String nome;
    private String genero;

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

    public void init(String nome, String tipo, int epsodio, String genero){
        this.init(nome, tipo, epsodio);
        this.genero = genero;
    }

    public void init(String nome, String tipo, int epsodio){
        this.nome = nome;
        this.tipo = tipo;
        this.epsodio = epsodio;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodio);
        System.out.println(this.genero);
    }
}

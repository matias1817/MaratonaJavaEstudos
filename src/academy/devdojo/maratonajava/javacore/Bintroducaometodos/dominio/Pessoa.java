package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    public String nome;
    public int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

    }
}

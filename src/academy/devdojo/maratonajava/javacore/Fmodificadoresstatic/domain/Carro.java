package academy.devdojo.maratonajava.javacore.Fmodificadoresstatic.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static  double velocidadeLimite =  250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("velocidade max: "+  this.velocidadeMax);
        System.out.println("velocidade limite: "+  Carro.velocidadeLimite);
        System.out.println("nome: "+ this.nome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}

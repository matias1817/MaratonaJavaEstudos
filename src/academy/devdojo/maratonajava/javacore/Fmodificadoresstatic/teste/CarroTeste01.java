package academy.devdojo.maratonajava.javacore.Fmodificadoresstatic.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadoresstatic.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro c1 = new Carro("fusca", 1000.0);
        Carro c2 = new Carro("celta", 400.0);
        Carro c3 = new Carro("gurgel", 200.0);


        Carro.setVelocidadeLimite(100);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}

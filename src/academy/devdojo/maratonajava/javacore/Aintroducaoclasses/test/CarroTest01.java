package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 1969;
        carro1.modelo = "Sport";
        carro1.Nome = "Fusca";

        carro2.ano = 1968;
        carro2.modelo = "GT 500";
        carro2.Nome = "Mustang";

        carro1 = carro2;

        System.out.println(carro1.ano);
        System.out.println(carro1.ano);
        System.out.println(carro1.ano);

        System.out.println(carro2.ano);
        System.out.println(carro2.ano);
        System.out.println(carro2.ano);
    }
}

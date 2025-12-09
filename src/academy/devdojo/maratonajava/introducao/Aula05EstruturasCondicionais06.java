package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //switch case para ver se é dia util
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("fim de semana");
                break;
            case 7:
                System.out.println("fim de semana");
                break;
            default:
                System.out.println("dia util");
                break;
        }
    }
}

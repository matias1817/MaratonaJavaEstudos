package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){

        int idade = 14;

        if (idade < 15){
            System.out.println("infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("juvenil");
        } else {
            System.out.println("aduto");
        }
    }
}

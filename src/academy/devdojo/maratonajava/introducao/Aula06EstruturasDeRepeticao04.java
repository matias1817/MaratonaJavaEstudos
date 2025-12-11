package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado valor de um carro quantas vezes ele pode ser parcelado
    //sendo que a parcela seja >= 1000

    public static void main(String[] args) {
        int valorCarro = 3000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {

            int valorParleca = valorCarro / parcela;

            if (valorParleca >= 1000){
                System.out.println("parcela" + parcela + " RS " + valorParleca);
            }

            if (valorParleca < 1000){
                break;
            }
        }
    }
}

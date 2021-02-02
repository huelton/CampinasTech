package exemplos;

public class TesteJava {
    public static void main(String[] args) {

        //cria uma copia da classe Carro
        Carro carro = new Carro();

        carro.setMarca("GM");
        carro.setModelo("Tracker 2021");
        carro.setCategoria("USV");

        System.out.println("Descrição do Carro");
        System.out.println("--------------------------");
        System.out.println("Marca: "+ carro.getMarca());
        System.out.println("Modelo: "+ carro.getModelo());
        System.out.println("Categoria: "+ carro.getCategoria());

    }
}

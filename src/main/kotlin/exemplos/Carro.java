package exemplos;

final class Carro {

    private String modelo;
    private String marca;
    private String categoria;

    public Carro() {
    }

    public Carro(String modelo, String marca, String categoria) {
        this.modelo = modelo;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private  String algumaCoisaPrivada(){
        return null;
    }
}

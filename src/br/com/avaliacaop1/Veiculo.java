package br.com.avaliacaop1;

public class Veiculo{
    protected String modelo;
    protected String placa;
    protected String combustivel;
    protected double valorVeiculo;

    public Veiculo(String modelo, String placa, String combustivel, double valorVeiculo){
        this.modelo = modelo;
        this.placa = placa;
        this.combustivel = combustivel;
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public String toString() {
        return "\nModelo: " + modelo + "Placa: " + placa + "Combustivel: " + combustivel + "Valor veiculo: "
        +valorVeiculo;
    }

    
}
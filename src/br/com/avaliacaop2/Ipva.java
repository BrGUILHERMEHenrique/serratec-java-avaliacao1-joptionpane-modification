package br.com.avaliacaop2;

import br.com.avaliacaop1.Veiculo;

public class Ipva extends Veiculo {
    private double valorIpva;
    private double taxaLicenciamento;

    public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
        super(modelo, placa, combustivel, valorVeiculo);
        this.taxaLicenciamento = taxaLicenciamento;
    }

    public double getValorIpva() {
        return valorIpva;
    }

    public void calculaIpva() {
        if (combustivel.equals("GNV")) {
            valorIpva = (valorVeiculo * 0.01) + taxaLicenciamento;
        } else if (combustivel.equals("flex")) {
            valorIpva = (valorVeiculo * 0.03) + taxaLicenciamento;
        } else if (combustivel.equals("gasolina")) {
            valorIpva = valorVeiculo * 0.04;
        }else{
	   valorIpva = valorVeiculo * 0.05;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nTx. de Lincenciamento: " + taxaLicenciamento + " Valor IPVA: " + valorIpva;
    }


}

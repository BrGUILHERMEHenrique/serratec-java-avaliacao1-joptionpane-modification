package main;

import javax.swing.JOptionPane;

import br.com.avaliacaop2.Ipva;

public class VeiculoMain {
    public static void main(String[] args) {
        int esc;
        do{
            Ipva veicule = new Ipva(JOptionPane.showInputDialog("Qual o modelo do veiculo: "), JOptionPane.showInputDialog("Qual é a placa: "),JOptionPane.showInputDialog("Qual o tipo de combustivel: "), Double.parseDouble(JOptionPane.showInputDialog("Qual o preço: ")), Double.parseDouble(JOptionPane.showInputDialog("Qual a taxa de licenciamento:")));
            veicule.calculaIpva();
    
            JOptionPane.showMessageDialog(null, veicule);
            esc = JOptionPane.showConfirmDialog(null,"Deseja fazer outra consulta?");
        }while(esc == 0);
    }


}
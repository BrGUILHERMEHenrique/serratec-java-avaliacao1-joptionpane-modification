package main;

//importing JOptionPane to make the windows
import javax.swing.JOptionPane;

import br.com.avaliacaop2.Ipva;

public class VeiculoMain {
    public static void main(String[] args) {
        int esc;//variable to recive the user choice
	//Here we start the loop to make all the questions to the user, and ends if the user choice no or cancel
        do{//execute the comands first and after receive the user response
            Ipva veicule = new Ipva(JOptionPane.showInputDialog("Qual o modelo do veiculo: "), JOptionPane.showInputDialog("Qual é a placa: "),JOptionPane.showInputDialog("Qual o tipo de combustivel: "), Double.parseDouble(JOptionPane.showInputDialog("Qual o preço: ")), Double.parseDouble(JOptionPane.showInputDialog("Qual a taxa de licenciamento:")));
            veicule.calculaIpva();//Calls the method to make the calculation
    
            JOptionPane.showMessageDialog(null, veicule);
            esc = JOptionPane.showConfirmDialog(null,"Deseja fazer outra consulta?");//stores the user response 
        }while(esc == 0);//using the user response, here we see if the response is YES(yes=0, no=1 and cancel=2), if esc is different of yes(0) the program stop

    }


}

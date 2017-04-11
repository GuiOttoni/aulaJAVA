package principal;

import javax.swing.JOptionPane;

import Builders.ElevadorBuilder;
import modelo.Elevador;

public class Principal {

	static String texto(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	static int inteiro(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static void main(String[] args) {
		Elevador e = new ElevadorBuilder().setAndarAtual(inteiro("Qual andar?"))
										  .setCapacidadePessoas(inteiro("Qual a capacidade de pessoas?"))
										  .setQtdePessoas(inteiro("Quantas pessoas tem no elevador?"))
										  .setTotalAndares(inteiro("Qual o total de andar?"))
				                          .Build();
		
		

	}

}

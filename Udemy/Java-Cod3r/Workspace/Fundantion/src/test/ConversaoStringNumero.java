package test;

import javax.swing.JOptionPane;


public class ConversaoStringNumero {

	//Convers�o de String para n�mero (CUIDADO: nem todas as strings s�o n�meros)
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero");
		
		
		System.out.println("Concatena��o dos valores no formato String: " + valor1 + valor2);
		
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma dos valores: " + soma);
		System.out.println("M�dia dos valores: " + soma / 2);
		
	}

}

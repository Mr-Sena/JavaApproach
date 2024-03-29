package test;


//Objeto(classe) Vs Primitivo (tipo)
public class Wrappers {

	public static void main(String[] args) {

		
		//Veja as classes que representa seus respectivos tipos primitivos!
		
		Integer inteiro = 10;
		
		Double pontoFlutuante = 5.5;
		
		//DIFEREN�A: As vari�veis declaradas com tipo primitivo n�o carregam comportamento (atrav�r da nota��o ponto) - por�m os "objetos" sim!
		
		System.out.println(inteiro.equals(10.0)); // Return: false -- Pois 10 � diferente de 10.0 (dada a nuance entre os tipos)
		
		System.out.println(pontoFlutuante.toString());// Double pra String!
		
		//Confirmando a transforma��o:
		System.out.print("Value in the Target is String: ");
		System.out.println(pontoFlutuante.toString() instanceof String);

		
		//Parse: Converte o tipo String com o seu conte�do para o tipo Boolean (Obs: qualquer coisa que n�o for True/true nesse argumento � false)
		Boolean bo = Boolean.parseBoolean("1");
		System.out.println(bo);
		
		//Tipo Primitivo char � associado a classe Character
		
	}
	
}

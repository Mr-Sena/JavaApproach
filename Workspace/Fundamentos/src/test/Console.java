package test;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		double prize = 65000.88;
		
		//Embora o tipo seja double, perceba que a formata��o assume a nomenclatura %. numero de casas decimais e finalmente f
		System.out.printf("Pr�mio: %.2f", prize);
		System.out.print("\nParab�ns!\nQuem dever� receber o valor na conta? ");
		
		//Criando uma inst�ncia para a leitura de entrada no sistema
		Scanner leia = new Scanner(System.in); // E em seguida j� fa�o a sua chamada para a resposta do usu�rio
		
		String winner = leia.nextLine();
		
		System.out.print("N�mero de telefone: ");
		int numberPhone = leia.nextInt(); // Repare que nesse caso � utilizado nextInt()
		
		System.out.printf("\nOk %s, entramos em contato para confirmar a transa��o\nFique ligado no n�mero passado (%d)", winner, numberPhone);
		
		//Assim que as leitura estiverem sido efetuada � uma boa pr�tica fechar a inst�ncia, veja:
		
		leia.close();
		
	}

}

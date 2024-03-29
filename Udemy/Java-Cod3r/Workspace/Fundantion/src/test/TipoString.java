package test;

public class TipoString {

	public static void main(String[] args) {

		String str = "Hi!";

		//Testes com a string
		System.out.println(str.charAt(1));

		System.out.println(str.startsWith("Oi!"));

		System.out.println(str.length());

		System.out.println(str.endsWith("!"));
		
		System.out.println(str.equalsIgnoreCase("hi!"));//IgnoraCase: Desconsidera minus. ou maisc.
		
		//Print formatado
		System.out.printf("\n\nValor atribu�do a str originalmente: %s \nPalavra traduzida: %s", str, str.replace("Hi", "Oi"));
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("Qual")); // Retorna -1, indicando que nao encontrou (por causa da letra maisc. )
		System.out.println("Frase qualquer".substring(6));//Substring pode argumentar dois par�metro inicio e fim, sendo o segundo opcional
		System.out.println("Frase qualquer".substring(6, 10));
		

	}

}

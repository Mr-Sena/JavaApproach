package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Marcelo");
		usuarios.put(2, "Joaquim");
		usuarios.put(30, "Robert");
		usuarios.put(0, "Jair");
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.isEmpty());
		
		//retorna as keys (n�o necessariamente possui uma ordem)
		System.out.println("KeySet: " + usuarios.keySet());
		
		//Valores:
		System.out.println(usuarios.values());
		//Resultado: retorno pela ordem crescente da chave
		
		//Keys and values
		System.out.println("entrySet:" + usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(30));

		System.out.println(usuarios.containsValue("Jo�o"));
		
		//Indexa��o por chave (Null se inexistente)
		System.out.println(usuarios.get(4));
		
		//Remo��o
		System.out.println(usuarios.remove(1));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values() ) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + "-> " + registro.getValue());
		}
		
	}

}

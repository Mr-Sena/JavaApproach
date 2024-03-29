package colecao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
	
	public static void main(String[] args) {
		
		//Conjunto heterog�neo (Aceita v�rios tipos de valores)
		Set hetero = new HashSet();
		
		hetero.add(2.17);
		hetero.add(null);
		hetero.add("Strings");
		
		System.out.println(hetero);
		
		
		
		//Agora, definindo um conjunto homog�neo:
		Set<Integer> homoInt = new HashSet<Integer>(); //Hashset nem sempre possu� um ordem para organizar seus elementos.
		
		Set<Integer> homogeneo = new TreeSet<>();//TreeSet sim
		
		//homoInt.add(2.17)    ...De modo que ele n�o aceita valores de outro tipo se n�o o especificado - int
		homoInt.add(1);
		homoInt.add(2);
		homoInt.add(3);
		homoInt.add(4);
		homoInt.add(0);
		
		homogeneo.add(1);
		homogeneo.add(0);
		homogeneo.add(-1);
		homogeneo.add(5);
		
		System.out.println(homoInt);
		
		System.out.println(homogeneo);
		
		
		
		Set<String> homoString = new TreeSet<>();
		
		
		homoString.add("XYZ");
		homoString.add("ABC");
		
		
		System.out.println(homoString);
		
		
		Set<Boolean> homoBoolean = new TreeSet<>();
		
		homoBoolean.add(true);
		homoBoolean.add(false);
		
		System.out.println(homoBoolean);
		
		//Conclus�o: A ordena��o no conjunto obdece uma prec�dencia, no caso do n�mero menor para o maior; no caso do literias de A a Z; no caso dos valores l�gicos de false a True
		
	}

}

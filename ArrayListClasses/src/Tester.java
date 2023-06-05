import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<String> pais = new ArrayList<>();
		pais.add("Joao");
		pais.add("Maria");
		
		ArrayList<String> filhos = new ArrayList<>();
		filhos.add("Pedro");
		filhos.add("Paulo");
		
		LinkedList<String> familia = new LinkedList<>();  // It works the same way as the ArrayList
		familia.addAll(pais);     // It copies the references
		familia.addAll(filhos);   // It copies the references
		System.out.println(pais);
		System.out.println(filhos);

		System.out.println(familia.get(0));  // "Joao"
		System.out.println(familia.get(3));  // "Paulo"
		System.out.println(familia);
		
		pais.clear();
		filhos.clear();
		
		Collections.shuffle(familia);
		System.out.println(familia);
		
		System.out.println(pais);    // empty array
		System.out.println(filhos);  // empty array
		
		Collections.sort(familia);
		System.out.println(familia);
		
		ArrayList<String> copiaFamilia = new ArrayList<>();
		Collections.copy(copiaFamilia, familia);
		System.out.println(copiaFamilia);

	}

}

import java.util.HashMap;

public class Contador {

	private HashMap<String, Integer> contadores;
	
	public Contador() {
		this.contadores = new HashMap<>();
	}
	
	public void contar(String key) {
		if (contadores.containsKey(key))
			contadores.put(key, contadores.get(key)+1);
		else
			contadores.put(key, 1);
	}
	
	public int totalizar(String key) {
		return contadores.containsKey(key) ? contadores.get(key) : 0;
	}
	
}

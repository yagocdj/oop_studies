
public class Moeda {
	private Moeda() {}
	
	public static double cotacaoDolar = 4.93;
	
	public static double realToDolar(double real) {
		return real / cotacaoDolar;
	}
	
	public static double dolatToReal(double dolar) {
		return dolar * cotacaoDolar;
	}
	
}


public class Q extends P {
	public int d;

	public Q(int a, int b, int c, int d) {
		super(a, b, c);
		this.d = d;
	}
	
	/* Para que um método possa sobrescrever outro, a
	 * assinatura dele dever ser igual a do método a
	 * ser sobrescrito. */
	@Override
	public int somar() {
		return super.somar() + d;
	}
	
}

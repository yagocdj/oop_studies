
public class Teste {

	public static void main(String[] args) {
		P p = new P(1, 3, 5);
		Q q = new Q(2, 4, 6, 8);
		
		System.out.println(p.somar());  // 9
		System.out.println(q.somar());  // 20
		System.out.println(p.a);        // 1
		System.out.println(q.a);        // 2

	}

}

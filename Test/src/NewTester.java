
public class NewTester {

	public static void main(String[] args) {
//		A a = new A();
//		a.escreva();
//		a.escreva(5);
		
		B b = new B();
		b.escreva();
		b.escreva(5);
	}
}

class A {
	public void escreva(int n) { System.out.println(n + 2); }
	
	public void escreva() { escreva(3); }
}

class B extends A {
	@Override
	public void escreva(int n) { super.escreva(n + 1); }
	
	@Override
	public void escreva() { super.escreva(); }
}

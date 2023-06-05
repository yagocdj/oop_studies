
public class Tester {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.soma());
		B b = new B();
		System.out.println(b.soma());
	}
}
class A {
	public int soma() {
		return 2 + 3 + bonus();
	}
	
	public int bonus() {
		return 2;
	}
}

class B extends A {
	public int soma() {
		return super.soma() + 1;
	}
	
	public int bonus() {
		return 3;
	}
}

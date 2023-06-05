
public class StackTest {

	public static void main(String[] args) {
		
		MyStack<String> s1 = new MyStack<>();
		
		try {
			s1.push("Joao");
			s1.push("Maria");
			s1.push("Jose");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			
			System.out.println("Top = " + s1.top());  // Jose
			
			s1.pop();  // unstacks "Jose"
			s1.pop();  // unstacks "Maria"
			
			System.out.println("Top = " + s1.top());  // Joao
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}


public class StackTest2 {

	public static void main(String[] args) {
		
		MyStack<Integer> s1 = new MyStack<>();
		
		try {
			s1.push(1);
			s1.push(3);
			s1.push(5);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
		
			System.out.println("Top = " + s1.top());  // 5
			
			s1.pop();  // unstacks 5
			s1.pop();  // unstacks 3
			
			System.out.println("Top = " + s1.top());  // 1
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

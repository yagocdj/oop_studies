import java.util.ArrayList;

public class MyStack<T> {  // parameterized class
	private ArrayList<T> data = new ArrayList<>();
	
	public void push(T object) {
		data.add(object);
	}
	
	public void pop() throws Exception {
		if (data.isEmpty()) {
			throw new Exception("Pop - empty stack");
		}
		int lastIndex = data.size() - 1;
		data.remove(lastIndex);
	}
	
	public T top() throws Exception {
		if (data.isEmpty()) {
			throw new Exception("Top - empty stack");
		}
		int lastIndex = data.size() - 1;
		return data.get(lastIndex);
	}
}

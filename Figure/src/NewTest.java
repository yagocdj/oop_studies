
public class NewTest {

	public static void main(String[] args) {
		Rectangle[] r = new Rectangle[4];
		
		for (int i = 0; i <= 3; i++)
			r[i] = new Rectangle(i, i, i);  // id, width, height
		
		System.out.println(r[2].calculateArea());

	}

}

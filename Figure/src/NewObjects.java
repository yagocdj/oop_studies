
public class NewObjects {

	public static void main(String[] args) {
		
		Rectangle r1, r2, r3;
		
		r1 = new Rectangle(1, 5, 30);
		r2 = r1;
		r3 = r1;
		
		r3.setWidth(7);
		// The following value for width will be applied
		r2.setWidth(8);

		/*
		 * Calculating the area of this rectangle will result in the same answer 
		 * for all the three references (they reference the same object).
		*/
		System.out.println(r1.calculateArea());
		System.out.println(r2.calculateArea());
		System.out.println(r3.calculateArea());
		
	}

}

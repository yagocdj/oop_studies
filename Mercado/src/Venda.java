
public class Venda {
	
	private String date;
	private String name;
	private int quantity;
	private double value;
	
	public Venda(String date, Produto product, int quantity) {
		this.date = date;
		this.name = product.getName();
		this.quantity = quantity;
		this.value = quantity * product.getPrice();	
		// Decrease the product's stock quantity
		product.setStockQuantity(product.getStockQuantity() - quantity);
	}
	
	@Override
	public String toString() {
		return "\nSale's date: " + this.date +
			   "\nSold product: " + this.name +
			   "\nSale's quantity: " + this.quantity +
			   "\nSale's value: " + this.value;
	}
}

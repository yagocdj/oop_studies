
public class Produto {
	
	private String name;
	private int stockQuantity;
	private double price;
	
	public Produto(String name, int stockQuantity, double price) {
		this.name = name;
		this.stockQuantity = stockQuantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\nProduct's name: " + this.name +
			   "\nProduct's price: " + this.price +
			   "\nProduct's stock quantity: " + this.stockQuantity;
	}
}

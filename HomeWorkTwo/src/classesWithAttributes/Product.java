package classesWithAttributes;

public class Product {
	private int id;
	private String productName;
	private String description;
	private double price;
	private int stockAmount;

	public Product() {
		System.out.println("çalýþmýyor gibi görünsemde tatlým ben buradayým :d");
	}

	public Product(int id, String productName, String description, double price, int stockAmount) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}

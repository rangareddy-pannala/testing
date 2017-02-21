package billing;

public class ItemInTheCart {

	private String item;
	private double price;

	public ItemInTheCart() {
		item = "";
		price = 0.0;
	}

	public String getProduct() {
		return item;
	}

	public double getPrice() {
		return price;
	}

	public ItemInTheCart(String inProduct, double inPrice) {
		item = new String(inProduct);
		price = inPrice;
	}

}

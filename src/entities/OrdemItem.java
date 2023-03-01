package entities;

public class OrdemItem {

	private Integer quantitiy;
	private Product product;

	public OrdemItem(Integer quantitiy, Product product) {
		this.quantitiy = quantitiy;
		this.product = product;

	}

	public Integer getQuantitiy() {
		return quantitiy;
	}

	public void setQuantitiy(Integer quantitiy) {
		this.quantitiy = quantitiy;

	}

	public Product getProduct() {
		return product;
	}

	// metodo de calculo

	public Double subTotal() {
		return quantitiy * product.getPrice();

	}

}

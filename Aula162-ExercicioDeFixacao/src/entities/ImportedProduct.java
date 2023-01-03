package entities;

public class ImportedProduct extends Product{

	private double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}



	public ImportedProduct(double customsFee) {
		
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return this.name+" $ "+(this.price+this.customsFee)+"  (Customs fee: $ "+this.customsFee+")";
	}
	
	
	
	
}

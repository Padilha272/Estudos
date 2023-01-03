package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	private Date ManufactureDate;
	
	public UsedProduct() {
		super();
	}
	
	

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}



	public Date getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return this.name+"  (used) $ "+this.price+" (Manufacture date: "+sdf.format(ManufactureDate)+")";
	}
}

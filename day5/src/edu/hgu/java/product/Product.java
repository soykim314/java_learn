package edu.hgu.java.product;

public class Product {
	
	private String sn;
	private String name;
	private String brand;
	private String type;
	
	
	//생성자, setter, getter, toString...., equals(sn, name)
	

	public Product(String sn, String name, String brand, String type) {
		super();
		this.sn = sn;
		this.name = name;
		this.brand = brand;
		this.type = type;
	}


	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}

	

	
	
	
	
}

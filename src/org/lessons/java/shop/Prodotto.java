package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private String id;
	private String name;
	private String description;
	private double price;
	private int vat;
	
	
	
	public Prodotto(String name , String description , double price , int vat) {
		setId();
		setName(name);
		setDescription(description);
		setPrice(price);
		setVat(vat);
	}
	
	
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompleteName() {
		return id + name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPriceWithVat() {
		double priceWithVat = getPrice() *(1 + getVat() / 100d);
		return priceWithVat;
	}
	
	public int getVat() {
		return vat;
	}
	
	
	
	private void setId() {
		int maxIdDigits = 8;
		Random rnd = new Random();
		Integer rndNumber;
		int idLng = this.id.length();
		do {
			rndNumber = rnd.nextInt();
			this.id = rndNumber + "";
			if(idLng<maxIdDigits) {
				int numOfZeros = maxIdDigits-idLng;
				for(int i=0 ; i<numOfZeros ; i++) {
					this.id = "0" + this.id;
				}
			}
		}while(rndNumber<=0 || idLng>maxIdDigits);
	}
	
	public void setName(String name) {
		if(name.length()<= 2) return;
		else this.name = name.trim();
	}
	
	public void setDescription(String description) {
		if(description.length()<=10) return;
		else this.description = description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setVat(Integer vat) {
		this.vat = vat;
	}

	public String toString() {
		
		return "[" + getId() + "]\n" 
				+ getName() + " - \"" + getCompleteName() + "\"" 
			+ "\n" + getDescription() 
			+ "\n" + String.format("%.2f", getPrice()) + "$ (" + getVat() + "%)"
				+ " --> " + String.format("%.2f", getPriceWithVat()) + "$";
	}
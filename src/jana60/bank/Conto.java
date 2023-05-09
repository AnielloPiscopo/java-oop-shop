package jana60.bank;

import java.util.Random;

public class Conto {
	private int number;
	private String ownerName;
	private double balance = 0;
	
	
	public Conto(String ownerName) {
		setNumber();
		setOwnerName(ownerName);
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	private void setNumber() {
		int min = 1;
		int max = 1000;
		Random rnd = new Random();
		this.number = rnd.nextInt(min , max);
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public void increaseBalance(double payment) {
		if(payment < 0) return;
		this.balance += payment;
	}
	
	public void decreaseBalance(double withdraw) {
		if(this.balance>0 && this.balance>=withdraw) this.balance -= withdraw ;
		else return;
	}
	
	
	public String toString() {
		return "Infomazione del conto :\n Codice Conto = " + getNumber() + "\n Nome del proprietario = " + getOwnerName() + "\n Bilancio attuale = " + String.format("%.2f", getBalance()) + "$";
	}
}

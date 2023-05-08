package jana60.bank;

public class Conto {
	private int number;
	private String ownerName;
	private double balance = 0;
	
	public Conto(int number , String ownerName) {
		setNumber(number);
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
	
	private void setNumber(int number) {
		this.number = number;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void increaseBalance(double payment) {
		this.balance += payment;
	}
	
	public void decreaseBalance(double withdraw) {
		if(withdraw>0) this.balance -= withdraw ;
		else return;
	}
}

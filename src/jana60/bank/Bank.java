package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int min = 1;
		int max = 1000;
		System.out.print("Inserisci il tuo nome");
		Scanner in = new Scanner(System.in);
		
		Random rnd = new Random();
		
		int bankAccountNumber = rnd.nextInt(min , max);
		
		String name = in.nextLine().trim();
		Conto bankAccount = new Conto(bankAccountNumber , name);
		int userChoise = 0;
		
		do {
			System.out.println("--------------------------");
			System.out.println(bankAccount);
			System.out.println("Digita il numero corrispodente per scegliere cosa fare\n"
					+ "1)versa una somma\n"
					+ "2)preleva del denaro\n"
					+ "3)esci");
			
			userChoise = in.nextInt();
			
			switch(userChoise) {
			case 1:
				System.out.print("Quanto vuoi versare? ");
				double payment = in.nextDouble();
				bankAccount.increaseBalance(payment);
				break;
			case 2:
				System.out.print("Quanto vuoi prelevare? ");
				double withdraw = in.nextDouble();
				bankAccount.decreaseBalance(withdraw);
				break;
			case 3:
				System.out.println("Sei uscito");
			}
		}while(userChoise!=3);
	}
}

package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto shish = new Prodotto("sfasf" , "asdasd" , 6.33 , 12);
		
		System.out.println(shish.getId());
		shish.setName("lol");
		System.out.println(shish.getName());
	}
}

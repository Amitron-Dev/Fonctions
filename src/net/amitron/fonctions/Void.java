package net.amitron.fonctions;

public class Void {

	public static void main(String[] args) {
		test();
		msg();
		send("Je suis exécuté en fonction de 'send' ! ");

	}
	
	public static void test() {
		// Mettre du code ici pour qu'il soit executé au dessus
	}
	
	public static void msg() {
		System.out.println("Salut");
	}
	
	public static void send(String msg) {
		System.out.println(msg);
	}

}

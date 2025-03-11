package net.amitron.fonctions;

public class Return {
	
	public static void main(String[] args) {
		msg(true); // Que va t- il se passer en console ?
		msg(false); // et ici ?
	}
	
	public static String msg(Boolean active) {
		if(active) {
			return "La fonction msg a été executé car elle est défini en true";
		}else {
			return null;
		}
	}

}

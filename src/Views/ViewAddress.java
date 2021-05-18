package Views;

import javax.swing.JOptionPane;

public class ViewAddress {
	static String aux;
	
	public static String setStreet() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o nome da rua: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		return aux;
	}
	
	public static Integer setNumber() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o número da residência: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		int op= Integer.parseInt(aux);
		return op;
	}
	
	public static String setZipCode() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o CEP: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		return aux;
	}
}

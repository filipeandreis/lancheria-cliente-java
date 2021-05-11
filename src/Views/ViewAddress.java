package Views;

import javax.swing.JOptionPane;

public class ViewAddress {
	public static String setStreet() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o nome da rua: ", "LANCHERIA", -1);
		return aux;
	}
	
	public static Integer setNumber() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o número da residência: ", "LANCHERIA", -1);
		int op= Integer.parseInt(aux);
		return op;
	}
	
	public static String setZipCode() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o CEP: ", "LANCHERIA", -1);
		return aux;
	}
}

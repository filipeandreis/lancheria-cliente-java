package Views;

import javax.swing.JOptionPane;

public class ViewProduct {
	static String aux;
	
	public static String setDescription() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o nome do lanche: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		return aux;
	}
	
	public static Double setPrice() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o preço: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		int op= Integer.parseInt(aux);
		return (double) op;
	}
}

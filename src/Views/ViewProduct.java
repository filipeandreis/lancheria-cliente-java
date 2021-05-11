package Views;

import javax.swing.JOptionPane;

public class ViewProduct {
	public static String setDescription() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o nome do lanche: ", "LANCHERIA", -1);
		return aux;
	}
	
	public static Double setPrice() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o preço: ", "LANCHERIA", -1);
		int op= Integer.parseInt(aux);
		return (double) op;
	}
}

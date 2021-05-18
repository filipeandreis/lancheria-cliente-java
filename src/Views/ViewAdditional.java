package Views;

import javax.swing.JOptionPane;

public class ViewAdditional {
	static String aux;
	
	public static String setDescription() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o adicional: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		return aux;
	}
}
package Views;

import javax.swing.JOptionPane;

public class ViewAdditional {
	public static String setDescription() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o adicional: ", "LANCHERIA", -1);
		return aux;
	}
}

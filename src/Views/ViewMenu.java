package Views;

import javax.swing.JOptionPane;
import Controllers.ClienteController;

public class ViewMenu {
	String aux;
	int op = 0;
	
	public void showMenu() {
		do {
			aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite '1' para acessar o sistema\nDigite '2' para sair\n\n", "LANCHERIA", -1);
			
			op = Integer.parseInt(aux);
			
			if(op == 1) {
				ClienteController clienteController = new ClienteController();
			} else if(op == 2) {
				System.exit(0);
			}
		} while(op != 1 || op != 2);
	}
}

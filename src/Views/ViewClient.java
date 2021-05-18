package Views;

import javax.swing.JOptionPane;

public class ViewClient {
	String aux;
	
	public String setName() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o nome do cliente: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		return aux;
	}
	
	public String setCpf() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o CPF do cliente: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		return aux;
	}
	
	public String setPhone() {
		aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o telefone do cliente: ", "LANCHERIA", -1);
		
		if(aux == null) {
			System.exit(0);
		}
		
		return aux;
	}
}

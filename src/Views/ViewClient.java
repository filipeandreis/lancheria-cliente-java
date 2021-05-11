package Views;

import javax.swing.JOptionPane;

public class ViewClient {
	public String setName() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o nome do cliente: ", "LANCHERIA", -1);
		return aux;
	}
	
	public String setCpf() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o CPF do cliente: ", "LANCHERIA", -1);
		return aux;
	}
	
	public String setPhone() {
		String aux = JOptionPane.showInputDialog(null, "LANCHERIA\n\nDigite o telefone do cliente: ", "LANCHERIA", -1);
		return aux;
	}
}

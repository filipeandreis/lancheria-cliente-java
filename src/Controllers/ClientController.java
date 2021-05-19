package Controllers;

import Models.Client;
import Views.ViewClient;

public class ClientController {
	public Client newClient() {
		
		ViewClient viewClient = new ViewClient();
		
		String name = viewClient.setName();
		String cpf = viewClient.setCpf();
		String phone = viewClient.setPhone();
		
		Client client = new Client(name, cpf, phone);
		
		return client;
	}
}
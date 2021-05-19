package Services;

import Models.Client;
import Models.Address;

public class RelClientAddress {
	private Client cliente;
	private Address endereco;
	
	public RelClientAddress(Client cliente, Address endereco){
		this.cliente = cliente;
		this.endereco = endereco;
	}
	
	public Client getCliente(){
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	
	public Address getEndereco() {
		return endereco;
	}
	public void setEndereco(Address endereco){
		this.endereco = endereco;
	}
}
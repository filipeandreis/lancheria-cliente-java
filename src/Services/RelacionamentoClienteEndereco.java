package Services;

import Models.Cliente;
import Models.Endereco;

public class RelacionamentoClienteEndereco {
	private Cliente cliente;
	private Endereco endereco;
	
	public RelacionamentoClienteEndereco(Cliente cliente, Endereco endereco){
		this.cliente = cliente;
		this.endereco = endereco;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}
}
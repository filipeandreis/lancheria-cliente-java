package Models;

public class Client {
	
	private String nome;
	private String cpf;
	private String telefone;
	private Address endereco;

	public Client (String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setcpf (String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public Address getEndereco() {
		return endereco;
	}
	
	public void setEndereco (Address endereco) {
		this.endereco = endereco;
	}
}
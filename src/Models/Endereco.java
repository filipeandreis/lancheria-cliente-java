package Models;

public class Endereco {
	private int numero;
	private String nome;
	private String cep;
	
	public Endereco(int numero, String nome, String cep) {
		this.numero=numero;
		this.nome=nome;
		this.cep=cep;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
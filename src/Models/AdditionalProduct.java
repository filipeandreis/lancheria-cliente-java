package Models;

public class AdditionalProduct {
	private String descricao;
	private int codigo;
	
	public AdditionalProduct(String descricao, int codigo){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
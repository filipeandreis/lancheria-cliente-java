package Models;

public class Produto {
	private int codigo;
	private String descricao;
	private Double valorUnitario;
	private AdicionalProduto marcaProduto;
	
	public Produto(int codigo, String descricao, Double valorUnitario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Double getValorUnitario() {
		return valorUnitario;
	}
	
	public AdicionalProduto getMarcaProduto() {
		return marcaProduto;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public void setMarcaProduto(AdicionalProduto marcaProduto) {
		this.marcaProduto = marcaProduto;
	}
}
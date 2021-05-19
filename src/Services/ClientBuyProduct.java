package Services;

public class ClientBuyProduct {
	private int codigo;
	private int quantPorProdutos;
	private RelProductAdditional relProdutoAdicionais;
	private RelClientAddress relCliEnd;
		
	public ClientBuyProduct(int codigo, int quantPorProdutos, RelProductAdditional relProdutoAdicionais, RelClientAddress relCliEnd) {
		this.codigo = codigo;
		this.quantPorProdutos = quantPorProdutos;
		this.relProdutoAdicionais = relProdutoAdicionais;
		this.relCliEnd = relCliEnd;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantPorProdutos() {
		return quantPorProdutos;
	}
	
	public void setQuantPorProdutos(int quantPorProdutos) {
		this.quantPorProdutos = quantPorProdutos;
	}

	public RelProductAdditional getProdutosCliente() {
		return relProdutoAdicionais;
	}
	
	public void setrelProdutoAdicionais(RelProductAdditional relProdutoAdicionais) {
		this.relProdutoAdicionais = relProdutoAdicionais;
	}

	public RelClientAddress getrelCliEnd() {
		return relCliEnd;
	}
	
	public void setrelClienteEndereço(RelClientAddress relCliEnd) {
		this.relCliEnd = relCliEnd;
	}
}
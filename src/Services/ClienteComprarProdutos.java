package Services;

public class ClienteComprarProdutos {
	private int codigo;
	private int quantPorProdutos;
	private RelacionamentoProdutoAdicionais relProdutoAdicionais;
	private RelacionamentoClienteEndereco relCliEnd;
		
	public ClienteComprarProdutos(int codigo, int quantPorProdutos, RelacionamentoProdutoAdicionais relProdutoAdicionais, RelacionamentoClienteEndereco relCliEnd) {
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

	public RelacionamentoProdutoAdicionais getProdutosCliente() {
		return relProdutoAdicionais;
	}
	
	public void setrelProdutoAdicionais(RelacionamentoProdutoAdicionais relProdutoAdicionais) {
		this.relProdutoAdicionais = relProdutoAdicionais;
	}

	public RelacionamentoClienteEndereco getrelCliEnd() {
		return relCliEnd;
	}
	
	public void setrelClienteEndereço(RelacionamentoClienteEndereco relCliEnd) {
		this.relCliEnd = relCliEnd;
	}
}
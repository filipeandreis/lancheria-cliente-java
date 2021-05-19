package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Models.Address;
import Models.AdditionalProduct;
import Models.Client;
import Models.Product;
import Services.ClientBuyProduct;
import Services.RelClientAddress;
import Services.RelProductAdditional;

public class ControllerAdapter {
	public void Adapt() {
		int i = 0;
		List<Product> produtos = new ArrayList<>();
		List<AdditionalProduct> adicionais = new ArrayList<>();
		List<ClientBuyProduct> carrinho = new ArrayList<>();
		
		Client client = new ClientController().newClient();
		Address address = new AddressController().newAddress();
		
		Product product = new ProductController().newProduct();
		produtos.add(product);
		
		AdditionalProduct additionalProduct = new AdditionalController().newAdditional();
		adicionais.add(additionalProduct);
		
		
		RelClientAddress relEndereco = new RelClientAddress(client, address);
		RelProductAdditional relAdicionais = new RelProductAdditional(produtos.get(0), adicionais.get(0));
		
		ClientBuyProduct carrinho1 = new ClientBuyProduct(1, 1, relAdicionais, relEndereco);
		carrinho.add(carrinho1);
		
					
		double valorTotalCompra = (carrinho1.getQuantPorProdutos() * carrinho1.getProdutosCliente().getProduto().getValorUnitario());
	
		JOptionPane.showMessageDialog(null,
				"--------- LANCHERIA ---------\n" +
				"\nCLIENTE:" +
				"\nNome: " + carrinho1.getrelCliEnd().getCliente().getNome() +
				"\nCPF: " + carrinho1.getrelCliEnd().getCliente().getcpf() +
				"\nTelefone: " + carrinho1.getrelCliEnd().getCliente().getTelefone()
		);
		
		JOptionPane.showMessageDialog(null,
				"ENDEREÇO:" +
				"\nRua: " + carrinho1.getrelCliEnd().getEndereco().getNome() +
				"\nNúmero: " + carrinho1.getrelCliEnd().getEndereco().getNumero() +
				"\nCEP: " + carrinho1.getrelCliEnd().getEndereco().getCep()
		);
		
		while (i < produtos.size()) {
			JOptionPane.showMessageDialog(null,
				"LANCHE " + (i+1) +
				"\nDescrição: " + carrinho.get(i).getProdutosCliente().getProduto().getDescricao() +
				"\nQuantidade: " + carrinho.get(i).getQuantPorProdutos() +
				"\nValor Unitário: " + carrinho.get(i).getProdutosCliente().getProduto().getValorUnitario() +
				"\nAdicionais: " + carrinho.get(i).getProdutosCliente().getAdicionaisProduto().getDescricao()
			);
			
			i++;
		}
		
		JOptionPane.showMessageDialog(null,
			"Valor total da compra: " + valorTotalCompra
		);
	}
}
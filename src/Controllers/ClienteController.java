package Controllers;

import Models.Produto;
import Models.Cliente;
import Models.Endereco;
import Models.AdicionalProduto;

import Services.ClienteComprarProdutos;
import Services.RelacionamentoClienteEndereco;
import Services.RelacionamentoProdutoAdicionais;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Views.ViewClient;
import Views.ViewAddress;
import Views.ViewProduct;
import Views.ViewAdditional;

public class ClienteController {
	public ClienteController() {
		int i = 0;
		List<Produto> produtos = new ArrayList<>();
		List<AdicionalProduto> adicionais = new ArrayList<>();
		List<ClienteComprarProdutos> carrinho = new ArrayList<>();
		ViewClient viewClient = new ViewClient();
		ViewAddress viewAdress = new ViewAddress();
		ViewProduct viewProduct = ViewProduct();
		ViewAdditional viewAdditional = ViewAdditional();
		
		String name = viewClient.setName();
		String cpf = viewClient.setCpf();
		String phone = viewClient.setPhone();
		
		String street = ViewAddress.setStreet();
		Integer number = ViewAddress.setNumber();
		String cep = ViewAddress.setZipCode();
		
		String product1 = ViewProduct.setDescription();
		Double price1 = ViewProduct.setPrice();
		String additional1 = viewAdditional.setDescription();
		
		String product2 = ViewProduct.setDescription();
		Double price2 = ViewProduct.setPrice();
		String additional2 = viewAdditional.setDescription();
		
		
		Cliente cliente = new Cliente(name, cpf, phone);
		Endereco endereco = new Endereco(number, street, cep);
		
		Produto produto1 = new Produto(1, product1, price1);
		produtos.add(produto1);
		
		Produto produto2 = new Produto(1, product2, price2);
		produtos.add(produto2);
		
		AdicionalProduto adicionais1 = new AdicionalProduto(additional1, 1);
		adicionais.add(adicionais1);
		
		AdicionalProduto adicionais2 = new AdicionalProduto(additional2, 1);
		adicionais.add(adicionais2);
		
		RelacionamentoProdutoAdicionais relAdicionais1 = new RelacionamentoProdutoAdicionais(produtos.get(0), adicionais.get(0));
		RelacionamentoProdutoAdicionais relAdicionais2 = new RelacionamentoProdutoAdicionais(produtos.get(1), adicionais.get(1));
		
		RelacionamentoClienteEndereco relEndereco = new RelacionamentoClienteEndereco(cliente, endereco);
		
		ClienteComprarProdutos carrinho1 = new ClienteComprarProdutos(1, 1, relAdicionais1, relEndereco);
		carrinho.add(carrinho1);
		
		ClienteComprarProdutos carrinho2 = new ClienteComprarProdutos(1, 2, relAdicionais2, relEndereco);
		carrinho.add(carrinho2);
		
		double valorTotalCompra = (carrinho1.getQuantPorProdutos() * carrinho1.getProdutosCliente().getProduto().getValorUnitario())
								+ (carrinho2.getQuantPorProdutos() * carrinho2.getProdutosCliente().getProduto().getValorUnitario());
		
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

	private static ViewProduct ViewProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	private static ViewAdditional ViewAdditional() {
		// TODO Auto-generated method stub
		return null;
	}

}
package Services;

import Models.AdicionalProduto;
import Models.Produto;

public class RelacionamentoProdutoAdicionais{
    private Produto produto;
    private AdicionalProduto adicionalProduto;

    public RelacionamentoProdutoAdicionais (Produto produto, AdicionalProduto adicionalProduto){
        this.adicionalProduto = adicionalProduto;
        this.produto = produto;
    }

    public Produto getProduto(){
        return produto;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public AdicionalProduto getAdicionaisProduto(){
        return adicionalProduto;
    }
    
    public void setAdicionalProduto(AdicionalProduto adicionalProduto){
        this.adicionalProduto = adicionalProduto;
    }
}
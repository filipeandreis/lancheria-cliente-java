package Services;

import Models.AdditionalProduct;
import Models.Product;

public class RelProductAdditional{
    private Product produto;
    private AdditionalProduct adicionalProduto;

    public RelProductAdditional (Product produto, AdditionalProduct adicionalProduto){
        this.adicionalProduto = adicionalProduto;
        this.produto = produto;
    }

    public Product getProduto(){
        return produto;
    }
    
    public void setProduto(Product produto){
        this.produto = produto;
    }

    public AdditionalProduct getAdicionaisProduto(){
        return adicionalProduto;
    }
    
    public void setAdicionalProduto(AdditionalProduct adicionalProduto){
        this.adicionalProduto = adicionalProduto;
    }
}
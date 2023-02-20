import java.util.List;
import java.util.ArrayList;

public class GerProduto {
    public List <Produto> bdProduto = new ArrayList <Produto>();
    
    public List<Produto> getProduto() {
        return bdProduto;
    }
    
    public Produto cadProduto(Produto prod) {
        bdProduto.add(prod);
        return prod;
    }
}
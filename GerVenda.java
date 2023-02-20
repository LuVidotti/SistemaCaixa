import java.util.ArrayList;
import java.util.List;

public class GerVenda {
    public List <Venda> bdVenda = new ArrayList<Venda>();
    
    public List<Venda> getVenda() {
        return bdVenda;
    }
    
    public Venda cadVenda(Venda venda) {
        bdVenda.add(venda);
        return venda;
    }
}
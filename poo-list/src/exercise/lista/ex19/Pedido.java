package exercise.lista.ex19;

import exercise.lista.ex19.pagamentos.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {


    private Pagamento pagamento = null;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Pagamento pagamento, List<Produto> produtos) {
        this.pagamento = pagamento;
        this.produtos = produtos;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto){

       produtos.add(produto);

    }






    @Override
    public String toString() {
        return "Pedido{" +
                "pagamento=" + pagamento +
                ", produtos=" + produtos +
                '}';
    }
}

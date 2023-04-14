package exercise.lista.ex19;

import exercise.lista.ex20.Contato;

public class Produto {
    private String nomeProduto;
    private double valorProduto;
    private int quantidadeEmEstoque;

    public Produto() {
    }

    public Produto(String nomeProduto, double valorProduto, int quantidadeEmEstoque) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public int setQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", valorProduto=" + valorProduto +
                '}';
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;

    }

}

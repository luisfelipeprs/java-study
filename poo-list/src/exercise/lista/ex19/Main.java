package exercise.lista.ex19;

import exercise.lista.ex19.pagamentos.Credito;
import exercise.lista.ex19.pagamentos.Dinheiro;
import exercise.lista.ex19.pagamentos.Pagamento;
import exercise.lista.ex19.pagamentos.Pix;

public class Main {


    public static void main(String[] args) {


        Pedido pedido = new Pedido();
        Produto pizza = new Produto();
        Produto cocaCola = new Produto();
        Pagamento pix = new Pix();



        pedido.setPagamento(pix);

        pizza.setNomeProduto("calabresa");
        pizza.setValorProduto(50);
        pedido.addProduto(pizza);
        cocaCola.setNomeProduto("Coca 2 litrao");
        cocaCola.setValorProduto(9);
        pedido.addProduto(cocaCola);




        System.out.println(pedido.toString());



    }








}

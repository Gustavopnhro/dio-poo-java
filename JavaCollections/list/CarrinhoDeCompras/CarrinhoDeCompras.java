package JavaCollections.list.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;
    

    //Construtor
    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }


    //adicionarItem
    public void adicionarItem(String item, int quantidade, double preco){
        carrinhoDeCompras.add(new Item(item, preco, quantidade));
    }

    //removerItem
    public void removerItem(String item){
        //Crie uma lista de itens a remover
        List<Item> listaRemover = new ArrayList<>();

        //Verifique se o item a remover se repete na lista
        for (Item itens : carrinhoDeCompras){
            //Caso o item seja igual ao item a remover, adicione ele a lista para remover
            if(itens.getNome().equalsIgnoreCase(item))
                listaRemover.add(itens);
        }

        //Remova todos os itens do carrinho de compras que xiste na listaRemover
        carrinhoDeCompras.removeAll(listaRemover);

    }

    //calcularValorTotal
    public double calcularValorTotal(){
        double valorTotal = 0;

        for (Item item: carrinhoDeCompras){
            valorTotal += item.getPreco()* item.getQuantidade();    
        }

        return valorTotal;
    }

    //exibirItens
    public void exibirItens(){
        System.out.println("<---------- Lista de Compras ---------->");
        for (Item item: carrinhoDeCompras){
            System.out.println(item.getNome() + " - " + "R$"+item.getPreco());
        }

        System.out.println("<-------------------------------------->");
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Sabão em pó", 2, 12);
        carrinho.adicionarItem("Sabão Líquido", 2, 10);
        carrinho.adicionarItem("Maçã", 10, 2);
        carrinho.adicionarItem("Verduras", 10, 2);
        carrinho.adicionarItem("Verduras", 10, 2);

        carrinho.exibirItens();
        System.out.println("R$ " + carrinho.calcularValorTotal());

        
        carrinho.removerItem("Verduras");

        carrinho.exibirItens();
        System.out.println("R$ " + carrinho.calcularValorTotal());

    }




}

package JavaCollections.set.Organizacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private int quantidade;
    private String cod;
    private double preco;

    public Produto(String nome, int quantidade, String cod, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.cod = cod;
        this.preco = preco;
    }

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString(){
        return "Quantidade: " + quantidade + ", Cód: " +  cod + ", Nome: " + nome  + ", Preço: " + preco; 
    }

    public int compareTo(Produto outroProduto){
        return nome.compareToIgnoreCase(outroProduto.getNome());
    }

    
}

class comparatorPorPreco implements Comparator<Produto>{
    public int compare(Produto produtoUm, Produto produtoDois){
        return Double.compare(produtoUm.getPreco(), produtoDois.getPreco());
    }
}
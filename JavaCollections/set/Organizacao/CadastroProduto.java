package JavaCollections.set.Organizacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> listaProdutos;

    public CadastroProduto() {
        listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(double preco, int quantidade, String nome, String cod) {
        listaProdutos.add(new Produto(nome, quantidade, cod, preco));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        // Set<Produto> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        // listaProdutos.addAll(listaProdutos);
        // return produtosPorPreco;

        Set<Produto> produtosPorPreco = new TreeSet<>(new Comparator<Produto>() {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    });
    produtosPorPreco.addAll(listaProdutos);
    return produtosPorPreco;

    }   


    public static void main(String[] args) {
        

    }

}
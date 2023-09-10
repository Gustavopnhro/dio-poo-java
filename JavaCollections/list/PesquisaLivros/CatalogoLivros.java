package JavaCollections.list.PesquisaLivros;

import java.util.ArrayList;
import java.util.List;


class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano =  ano;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return "Livro: " + titulo + "\nAutor: " + autor + "\nAno: " + ano;
    }

}



public class CatalogoLivros {
    private List<Livro> catalogoLivros;

    public CatalogoLivros(){
        catalogoLivros = new ArrayList<>();
    }

    //Adicionar Livro
    public void adicionarLivro(String titulo, String autor, int ano){
        catalogoLivros.add(new Livro(titulo, autor, ano));
    }

    //Pesquisar por Autor
    void pesquisarPorAutor(String autor){
        for (Livro livro : catalogoLivros){
            if(livro.getAutor().equalsIgnoreCase(autor))
                System.out.println(livro);
        }
    }

    void pesquisarPorTitulo(String titulo){
        for (Livro livro : catalogoLivros){
            if(titulo.equals(livro.getTitulo())){
                System.out.println("<------- Dados do Livro ------>");
                System.out.println(livro);
                break;
            }  
        }
    }

    void pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        for (Livro livro : catalogoLivros){
            if (livro.getAno() >= anoInicial &&  livro.getAno() <= anoFinal)
            {
                System.out.println(livro);
            }
        }

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Senhor dos Aneis", "Um autor legal", 1980);
        catalogoLivros.adicionarLivro("Senhor dos Aneis 2", "Um autor legal", 2022);
        catalogoLivros.adicionarLivro("Senhor dos Aneis 3", "Um autor legal", 2023);
        catalogoLivros.adicionarLivro("Contos do fogo", "Outro autor legal", 1789);
        catalogoLivros.adicionarLivro("Contos do fogo 2", "Outro autor legal", 2022);
        catalogoLivros.adicionarLivro("Animais sem fluxo", "Outro autor legal", 2023);
        catalogoLivros.pesquisarPorAutor("Um autor legal");
    }
}

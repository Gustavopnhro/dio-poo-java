package JavaCollections.ComparatorXComparable.Comparable;

import java.util.*;

class Filme implements Comparable<Filme>{
    private String nome;
    private int ano;

    public Filme(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public int compareTo(Filme outroFilme){
        return this.nome.compareTo(outroFilme.nome);
    }


}

public class Main {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Harry Potter e a Pedra Filosofal", 2001));
        filmes.add(new Filme("Efeito Borboleta", 2004));
        filmes.add(new Filme("Mr.Nobody", 2003));


        Collections.sort(filmes);

        for (Filme filme : filmes) {
            System.out.println(filme.getNome());
        }
    }
}
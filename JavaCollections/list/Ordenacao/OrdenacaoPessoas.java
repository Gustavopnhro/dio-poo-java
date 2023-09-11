package JavaCollections.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }

    public int compareTo(Pessoa outraPessoa){
        return Integer.compare(this.idade , outraPessoa.idade);
    }
    

}

public class OrdenacaoPessoas{
    private List<Pessoa> listaPessoas;


    public OrdenacaoPessoas(){
        listaPessoas = new ArrayList<>();   
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarAltura(){
        Comparator<Pessoa> porAltura = Comparator.comparing(Pessoa::getAltura);
        Collections.sort(listaPessoas, porAltura);

        for (Pessoa pessoa: listaPessoas){
            System.out.println(pessoa);
        }
    }

    public void ordenarIdade(){
        Collections.sort(listaPessoas);
        Collections.reverse(listaPessoas);
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }


    public static void main(String[] args) {
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
        listaPessoas.adicionarPessoa("Carina", 35, 1.65);
        listaPessoas.adicionarPessoa("Claudia", 45, 1.69);
        listaPessoas.adicionarPessoa("Flavia",23, 1.55);

        listaPessoas.ordenarIdade();

    }
}

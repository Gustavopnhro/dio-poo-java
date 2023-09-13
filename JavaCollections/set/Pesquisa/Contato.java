package JavaCollections.set.Pesquisa;

public class Contato {
    private int numero;
    private String nome;

    public Contato(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void trocarNumero(int novoNumero){
        this.numero = novoNumero;
    }

    public String toString(){
        return "Nome: " + nome + " Numero: " + numero;
    }
}

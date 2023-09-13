package JavaCollections.set.OperacaoBasica;

public class Convidado {
    
    private String nome;
    private String codigoConvite;


    public Convidado(String nome, String codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Convidado{" + "nome:'" + nome + '\'' + ", CodigoConvite: " + codigoConvite + "}";
    }
}

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereço;

    //O método construtor deve ter o mesmo nome da classe
    public Pessoa(String cpf, String nome, String endereço){
        this.cpf = cpf;
        this.nome = nome;
        this.endereço = endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getNome() {
        return nome;
    }
}

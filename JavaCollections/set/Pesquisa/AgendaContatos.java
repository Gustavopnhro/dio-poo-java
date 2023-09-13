package JavaCollections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> listaContatos;

    public AgendaContatos(){
        listaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        listaContatos.add(new Contato(numero, nome));
    }

    public void exibirContatos(){
        System.out.println(listaContatos);
    }

    public void pesquisarPorNome(String nome){
        for (Contato contato : listaContatos){
            if (contato.getNome().equals(nome)){
                System.out.println("Nós encontramos " + contato.getNome() + " " + "Número: " + contato.getNumero());
                break;
            }
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero ){
         for (Contato contato : listaContatos){
            if (contato.getNome().equals(nome)){
                contato.trocarNumero(novoNumero);
                System.out.println("Numero alterado com sucesso");
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaContatos listaContatos = new AgendaContatos();

        listaContatos.adicionarContato("Samara", 988234323);
        listaContatos.adicionarContato("Naruto", 988233112);
        listaContatos.adicionarContato("Ulisses", 988888321);

        listaContatos.exibirContatos();;

        listaContatos.atualizarNumeroContato("Samara", 9222222);

        listaContatos.exibirContatos();;

    }


}

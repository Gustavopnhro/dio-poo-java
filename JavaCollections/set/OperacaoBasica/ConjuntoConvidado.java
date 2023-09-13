package JavaCollections.set.OperacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidado(){
        conjuntoConvidados = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, String codigoConvite){
        conjuntoConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(String codigoConvite){
        Convidado convidadoRemover = null;

        for (Convidado convidado: conjuntoConvidados){
            if (convidado.getCodigoConvite().equals(codigoConvite)){
                convidadoRemover = convidado;
                break;
            } else {
                System.out.println("Este convidado não existe");
            }
            
        }

        conjuntoConvidados.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return conjuntoConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(conjuntoConvidados);
    }


    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();

        conjuntoConvidados.adicionarConvidado("Claudio Ribeiro", "STJ990");
        conjuntoConvidados.adicionarConvidado("Regina Ribeiro", "STU990");
        conjuntoConvidados.adicionarConvidado("Fernando Ribeiro", "STF990");
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidado("STJ990");
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();
    }
}
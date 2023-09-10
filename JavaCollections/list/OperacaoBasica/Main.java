package JavaCollections.list.OperacaoBasica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Tarefa {
    private String descricao;

    public Tarefa (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

class ListaTarefa {
    private List<Tarefa> listaTarefas;

    public ListaTarefa(){
        this.listaTarefas = new ArrayList<>();
    }

    public List<Tarefa> getListaTarefa() {
        return listaTarefas;
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for (Tarefa tarefa: listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao))
                tarefasRemover.add(tarefa);
        }
        listaTarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        for (Tarefa tarefa: listaTarefas){
            System.out.println(tarefa.getDescricao());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Lavar a casa");
        listaTarefa.adicionarTarefa("Lavar a casa");
        listaTarefa.adicionarTarefa("Pular corda");
        listaTarefa.adicionarTarefa("Não desistir");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Lavar a casa");

        listaTarefa.obterDescricoesTarefas();


                
        
    }    
}



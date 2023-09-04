public class SistemaIbge {
    public static void main(String[] args) {
        //Supondo a necessidade de listar todos os estados
        for (EstadoBrasileiro estado: EstadoBrasileiro.values()){
            System.err.println(estado.getNome());
        }

        //Supondo a necessidade de atribuir um estado já existente a uma variável
        EstadoBrasileiro estado = EstadoBrasileiro.MARANHAO;
        System.out.println(estado.getNome());
        System.out.println(estado.getSigla());
        System.out.println(estado.nomeDeEstadoMaiusculo());

        
    }
}

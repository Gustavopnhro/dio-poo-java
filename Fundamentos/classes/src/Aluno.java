public class Aluno {
    String nome;
    int idade;
    String sexo;
    String caracteristica;

    //Behaviors

    void beber(String bebida){
        System.out.println(this.nome + " está bebendo "+ bebida);
    }

    void comer(String comida){
        System.out.println(this.nome +" está comendo "+comida);
    }

    void descansar(){
        
        System.out.println(this.nome + "está descansando");
    }
}

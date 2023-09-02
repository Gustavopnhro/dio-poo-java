public class Escola {
    public static void main(String[] args) {
        Aluno estudante1 = new Aluno();
        estudante1.nome = "Diego";
        estudante1.idade = 12;
        estudante1.sexo = "Masculino";
        estudante1.caracteristica = "Alto";

        estudante1.beber("Suco");
        estudante1.comer("Abóbora");
    }
}

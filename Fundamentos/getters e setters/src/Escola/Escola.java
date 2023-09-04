package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno fernando = new Aluno();
        fernando.setIdade(12);
        fernando.setNome("Fernando");

        System.out.println(fernando.getNome() + " estuda na escola e tem " + fernando.getIdade() + " anos");
    }
}

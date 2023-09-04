package PredioSantarem;


public class Apartamento513 {
    static String morador = "Minerva";

    public static void main(String[] args) {
        Apartamento513.banheiro513(morador);
        Apartamento513.cozinha513(morador);
        Piscina.nadarNaPiscina(morador);

    }

    private static void banheiro513(String morador ){
        System.out.println(morador + " está indo ao banheiro do 513");
    }
    private static void cozinha513(String morador){
        System.out.println(morador + " está indo pra cozinha do 513");
    }
}

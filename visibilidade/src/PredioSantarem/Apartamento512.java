package PredioSantarem;


public class Apartamento512 {
    static String  morador = "Augusto";

    public static void main(String[] args) {
        Apartamento512.banheiro512(morador);
        Apartamento512.cozinha512(morador);
        Piscina.nadarNaPiscina(morador);


    }

    private static void banheiro512(String morador ){
        System.out.println(morador + " está indo ao banheiro do 512");
    }
    private static void cozinha512(String morador){
        System.out.println(morador + "está indo pra cozinha do 512");
    }
}

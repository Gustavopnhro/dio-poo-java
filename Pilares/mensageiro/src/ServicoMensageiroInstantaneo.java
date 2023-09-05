public abstract class ServicoMensageiroInstantaneo {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validandoInternet(){
        System.out.println("Validando a conexão com a internet");
    };
    protected void salvandoHistorico(){
        System.out.println("Salvando Histórico");
    };
}

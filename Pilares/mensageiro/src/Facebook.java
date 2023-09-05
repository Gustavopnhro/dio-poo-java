public class Facebook extends ServicoMensageiroInstantaneo {
    
    public void enviarMensagem(){
        validandoInternet();
        System.out.println("Enviando mensagem do Facebook");
        salvandoHistorico();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem do Facebook");
    }
}

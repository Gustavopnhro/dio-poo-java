public class Telegram extends ServicoMensageiroInstantaneo {
    
    public void enviarMensagem(){
        validandoInternet();
        System.out.println("Enviando mensagem do Telegram");
        salvandoHistorico();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem do Telegram");
    }
}

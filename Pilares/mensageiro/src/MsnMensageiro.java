public class MsnMensageiro extends ServicoMensageiroInstantaneo {
    public void enviarMensagem(){
        validandoInternet();
        System.out.println("Enviando mensagem do MSN");
        salvandoHistorico();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem do Msn");
    }

}

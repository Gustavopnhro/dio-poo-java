public class ComputadorJao {
    public static void main(String[] args) {
        ServicoMensageiroInstantaneo mensageiro = null;

        String appEscolhido = "outro";
        if (appEscolhido == "tlg")
            mensageiro = new Telegram();
        else if (appEscolhido == "fcb")
            mensageiro = new Facebook();
        else
            mensageiro = new MsnMensageiro();

        mensageiro.enviarMensagem();
        mensageiro.receberMensagem();

    }
}

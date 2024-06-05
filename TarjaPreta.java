public class TarjaPreta extends Produto {

    public TarjaPreta(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getInformacaoTarja() {
        return "Produto de tarja preta: venda sob prescrição e controle especial.";
    }
}

public class TarjaAmarela extends Produto {

    public TarjaAmarela(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getInformacaoTarja() {
        return "Produto de tarja amarela: venda sob retenção de receita.";
    }
}

// Classe TarjaPreta que herda de Produto

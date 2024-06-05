public class TarjaVermelha extends Produto {

    public TarjaVermelha(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getInformacaoTarja() {
        return "Produto de tarja vermelha: venda sob prescrição médica.";
    }
}

// Classe TarjaAmarela que herda de Produto

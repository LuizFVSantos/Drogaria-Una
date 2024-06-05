public abstract class Funcionario {
    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    // Método abstrato para cadastrar produto
    public abstract void cadastrarProduto();

    // Método abstrato para realizar venda
    public abstract void realizarVenda();
}

// Classe Vendedor que herda de Funcionario

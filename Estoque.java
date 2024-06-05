import java.util.*;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

  
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

 
    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println("Produto removido: " + produto.getNome());
        } else {
            System.out.println("Produto não encontrado: " + produto.getNome());
        }
    }


    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Info: " + produto.getInformacaoTarja());
            }
        }
    }


    public void buscarPorTarja(String tipoTarja) {
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getInformacaoTarja().contains(tipoTarja)) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Info: " + produto.getInformacaoTarja());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum produto encontrado com a tarja: " + tipoTarja);
        }
    }
}

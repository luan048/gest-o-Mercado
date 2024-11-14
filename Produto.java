public class Produto {
    String nomeProduto;
    int quantEstoque;
    double preco;

    Produto(String nomeProduto, int quantEstoque, double preco) {
        this.nomeProduto = nomeProduto;
        this.quantEstoque = quantEstoque;
        this.preco = preco;
    }

    public String toString() {
        return "(" + nomeProduto + ", " + quantEstoque + ", " + preco + ")";
    }
}

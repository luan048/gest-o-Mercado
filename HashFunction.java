public class HashFunction {
    int operador;
    Lista[] vetor;

    HashFunction(int operador) {
        this.operador = operador;

        vetor = new Lista[operador];
        for(int i = 0; i < operador; i++ ) {
            vetor[i] = new Lista();
        }
    }

    public void inserir(String codBarras, Produto produto) {
        int chave = Math.abs(codBarras.hashCode() % operador);
        vetor[chave].inserir(codBarras, produto);
    }

    public void compra(String codBarras, String nomeProduto, int quantidade) {
        int chave = Math.abs(codBarras.hashCode() % operador);
        vetor[chave].compra(nomeProduto, quantidade);
    }

    public Produto buscar(String codBarras) {
        int chave = Math.abs(codBarras.hashCode() % operador);
        return vetor[chave].buscar(codBarras);
    }

    public String toString() {
        StringBuilder out = new StringBuilder();

        for(int i = 0; i < operador; i++) {
            out.append(i).append(": ").append(vetor[i]).append("\n");
        }
        return out.toString();
    }
}

public class Lista {
    No inicio;

    public void inserir(String codBarras, Produto produto) {
        No no = new No();

        no.codBarras = codBarras;
        no.info = produto;
        no.proximo = inicio;
        inicio = no;
    }

    // Informar a quantidade comprada do produto e subtrair da quantidade em estoque
    public void compra(String nomeProduto, int quantidade) {
        No no = inicio;

        while (no != null) {
            if (no.info.nomeProduto.equals(nomeProduto)) {
                if(no.info.quantEstoque >= quantidade) {
                    no.info.quantEstoque -= quantidade;
                }
            }
            no = no.proximo;
        }
    }

    public Produto buscar(String codBarras) {
        No no = inicio;

        while (no != null) {
            if (no.codBarras.equals(codBarras)) {
                return no.info;
            }
            no = no.proximo;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        No no = inicio;

        while (no != null) {
            sb.append(no.info);
            no = no.proximo;
            if (no != null)
                sb.append(" -> ");
        }
        return sb.toString();
    }
}

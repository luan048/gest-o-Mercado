public class Main {
    public static void main(String[] args) {
        int operador = 10;
        HashFunction hashTable = new HashFunction(operador);

        // Adicionando Produtos
        Produto produto1 = new Produto("Feijão", 50, 10.60);
        Produto produto2 = new Produto("Arroz", 40, 8.40);
        Produto produto3 = new Produto("Macarrão", 38, 5.40);

        // Inserindo Produtos
        hashTable.inserir("1234567890", produto1);
        hashTable.inserir("0987654321", produto2);
        hashTable.inserir("1122334455", produto3);

        // Buscando Produtos
        Produto encontrado = hashTable.buscar("1234567890");
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado);
        } 
        else {
            System.out.println("Produto não encontrado para o código de barras 1234567890");
        }

        // TESTE ANTES DO METODO DE COMPRA
        System.out.println(hashTable);

        hashTable.compra("0987654321", "Arroz", 10);

        // TESTE PARA RETORNAR HASH TABLE COMPLETA APOS METODO DE COMPRA
        System.out.println("Tabela hash: ");
        System.out.println(hashTable);
    }
}

package encapsulamento;

public class Produto2 {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto2(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }

    // Método para exibir as informações do produto
    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }

    // Método para aplicar desconto com validação
    public void aplicarDesconto(double porcentagem) throws Exception {
        if (porcentagem > 50) {
            throw new Exception("O desconto não pode ser maior que 50%");
        } else if (porcentagem < 0) {
            throw new Exception("O desconto não pode ser negativo");
        }
        this.preco -= this.preco * (porcentagem / 100);
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        try {
            Produto2 produto = new Produto2("Notebook", 3000.0, 10);
            produto.exibirProduto();

            // Aplicando um desconto válido
            produto.aplicarDesconto(30);
            produto.exibirProduto();

            // Tentando aplicar um desconto maior que 50%
            produto.aplicarDesconto(60);
            produto.exibirProduto();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


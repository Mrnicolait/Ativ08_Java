package abstracao;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado com cartão de crédito.");
        } else {
            System.out.println("Pagamento com cartão de crédito não válido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return numeroCartao.length() == 16; // Simples validação para o número do cartão
    }

    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito("1234567812345678");
        cartao.processarPagamento(150.00);
    }
}

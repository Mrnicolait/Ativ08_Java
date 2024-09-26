package abstracao;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado com Pix.");
        } else {
            System.out.println("Pagamento com Pix não válido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return chavePix.length() > 0; // Verifica se a chave Pix não está vazia
    }

    public static void main(String[] args) {
        Pix pix = new Pix("minhaChavePix@exemplo.com");
        pix.processarPagamento(200.00);
    }
}


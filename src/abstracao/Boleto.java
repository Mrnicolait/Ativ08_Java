package abstracao;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado com boleto.");
        } else {
            System.out.println("Pagamento com boleto não válido.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return codigoBarras.length() == 44; // Simples validação para o código de barras
    }

    public static void main(String[] args) {
        Boleto boleto = new Boleto("12345678901234567890123456789012345678901234");
        boleto.processarPagamento(75.00);
    }
}

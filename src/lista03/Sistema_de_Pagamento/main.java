package lista03.Sistema_de_Pagamento;

public class main {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao(200, "Compra online");
        cartao.processar();
        cartao.reembolsar(100);

        System.out.println();

        try {
            PagamentoPix pix = new PagamentoPix(150, "Pagamento Pix");
            pix.processar();
            pix.reembolsar(50);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();

        try {
            PagamentoBoleto boleto = new PagamentoBoleto(0, "Boleto");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

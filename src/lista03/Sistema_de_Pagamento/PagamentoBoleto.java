package lista03.Sistema_de_Pagamento;

public class PagamentoBoleto extends Pagamento{
    public PagamentoBoleto(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento via boleto...");
        processado = true;
    }
}

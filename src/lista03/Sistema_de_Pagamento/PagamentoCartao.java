package lista03.Sistema_de_Pagamento;

public class PagamentoCartao extends Pagamento implements Reembolso {

    public PagamentoCartao(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public void processar(){
        System.out.println("Processando pagamento no cartão...");
        processado = true;
    }

    @Override
    public boolean podeReembolsar() {
        return processado;
    }

    @Override
    public void reembolsar(double valor) {
        if (valor <= 0 || valor > this.valor) {
            throw new IllegalArgumentException("Valor de reembolso inválido.");
        }

        if (!processado) {
            throw new IllegalStateException("Pagamento ainda não foi processado.");
        }

        System.out.println("Reembolso de R$ " + valor + " no cartão realizado.");
    }
}

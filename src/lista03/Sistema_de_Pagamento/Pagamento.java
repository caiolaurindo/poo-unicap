package lista03.Sistema_de_Pagamento;

public abstract class Pagamento {
    protected double valor;
    protected String descricao;
    protected boolean processado;

    public Pagamento(double valor, String descricao) {
        if (valor <= 0){
            throw  new IllegalArgumentException("Valor deve ser maior que zero");
        }

        this.valor = valor;
        this.descricao = descricao;
        this.processado = false;
    }
    public abstract void processar();

    public boolean isProcessado() {
        return processado;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

}

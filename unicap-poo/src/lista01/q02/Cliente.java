package lista01.q02;

public class Cliente {
    private String nome;
    private String cpf;
    private int saldo;
    private int numConta;

    public Cliente(String nome, String cpf, int saldo, int numConta){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numConta =numConta;
    }

    public Cliente(String nome, String cpf, int numConta){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
        this.numConta =numConta;
    }

    public String getNome(){

        return nome;
    }
    public void setNome(){

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int extrato(){
        return getSaldo();
    }
    public void saque(int valor){
        saldo = saldo - valor;
    }
    public  void deposito(int valor){
        saldo = saldo + valor;
    }

    @Override
    public String toString() {
        return
                "Cliente: " + nome + '\n' +
                "cpf: " + cpf + '\n' +
                "saldo: " + saldo +
                "numConta: " + numConta;
    }
}

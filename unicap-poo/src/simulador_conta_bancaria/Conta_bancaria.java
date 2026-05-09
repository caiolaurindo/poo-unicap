package simulador_conta_bancaria;

public class Conta_bancaria {
    String nome;
    int numero;
    double saldo;

    Conta_bancaria(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
            System.out.println("Depositado com sucesso");
            System.out.println("Saldo atual: " + saldo);
        }else{
            System.out.println("Erro ao depositar");
        }
    }

    void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Sacado com sucesso");
            System.out.println("Saldo atual: " + saldo);
        }else {
            System.out.println("Erro ao sacar");

        }
    }

    void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}

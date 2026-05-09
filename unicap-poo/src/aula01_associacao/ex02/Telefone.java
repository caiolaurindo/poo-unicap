package aula01_associacao.ex02;

public class Telefone {
    int ddd;
    String numero;

    Telefone(int ddd, String numero){
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd=" + ddd +
                ", numero='" + numero + '\'' +
                '}';
    }
}

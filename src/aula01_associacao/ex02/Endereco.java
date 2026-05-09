package aula01_associacao.ex02;

public class Endereco {
    String nome_logradouro;
    int numero_casa;
    String bairro;
    String cidade;
    String estado;


    public Endereco(String nome_logradouro, int numero_casa, String bairro, String cidade, String estado) {
        this.nome_logradouro = nome_logradouro;
        this.numero_casa = numero_casa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "nome_logradouro='" + nome_logradouro + '\'' +
                ", numero_casa=" + numero_casa +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

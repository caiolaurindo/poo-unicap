package aula01_associacao.ex02;

public class main {
    public static void main(String[] args) {
        Data d1 = new Data(28,2,2026);
        Endereco end1 = new Endereco("rua rosa de lima", 155, "sapucaia", "olinda", "Pernambuco");
        Telefone tel1 = new Telefone(81, "98403-6075");
        Cliente cliente1 = new Cliente("Caio", "8283223", tel1,d1,end1);
        System.out.println(cliente1);


    }
}

package aula01_encapsulamento.ex01;

public class main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("caio", 19);
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

        p1.setIdade(18);
        p1.setNome("lucas");
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

    }
}

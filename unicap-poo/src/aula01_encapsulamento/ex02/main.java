package aula01_encapsulamento.ex02;

public class main {
    public static void main(String[] args) {
        Departamento dep1 = new Departamento(232, "desenvolvimento");
        Funcionario fun1 = new Funcionario(1232, "caio", dep1);

        System.out.println(fun1);
    }
}

package aula01_encapsulamento.ex02;

public class Funcionario {
    private int matricula;
    private String nome;
    Departamento dep;

    public Funcionario(int matricula, String nome, Departamento dep){
        this.matricula = matricula;
        this.nome = nome;
        this.dep = dep;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario:\n" +
                "matricula= " + matricula +
                "\nnome= " + nome + '\n' + dep ;
    }
}

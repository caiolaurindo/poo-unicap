package lista_exercicios_heranca;

import java.util.UUID;

public class Funcionario {
    private  String nome;
    private  double salario;
    private static int totalfuncionarios;
    private final String id;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.id = UUID.randomUUID().toString();
        totalfuncionarios++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalfuncionarios() {
        return totalfuncionarios;
    }

    public static void setTotalfuncionarios(int totalfuncionarios) {
        Funcionario.totalfuncionarios = totalfuncionarios;
    }

    public String getId() {
        return id;
    }
}

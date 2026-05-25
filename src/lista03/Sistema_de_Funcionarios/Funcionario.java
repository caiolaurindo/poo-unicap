package lista03.Sistema_de_Funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        if(nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode estar vazio!");
        }
        if (salario <= 0){
            throw new IllegalArgumentException("O salário não pode ser zero ou menor que zero!");
        }
        this.nome = nome;
        this.salario = salario;
    }
    public abstract void calcularBonus();
    
}

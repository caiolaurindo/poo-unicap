package lista03.Sistema_de_Funcionarios;

public class Gerente extends Funcionario implements Bonificavel {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus(double salario){
        
    }
}

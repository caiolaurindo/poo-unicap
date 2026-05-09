package lista_exercicios_heranca;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public double calcularBonusGerente(){
        return 0.10*getSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

package lista_exercicios_heranca;
import java.util.ArrayList;
import java.util.UUID;
public class main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
 
        Gerente gerente1 = new Gerente("bruno", 2.343, "Rh");
        funcionarios.add(gerente1);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("rogerio", 1.323, "Python");
        funcionarios.add(desenvolvedor1);

        double bonus;
        for(Funcionario f : funcionarios){
            if (f instanceof Gerente){
                System.out.println("O ID É: " + f.getId());
                System.out.println("O NOME É: " +f.getNome());
                System.out.println("O SALÁRIO É: "+f.getSalario());
                System.out.println("O BÔNUS É: "+ ((Gerente) f).calcularBonusGerente());
            } else{
                System.out.println("O ID É: " + f.getId());
                System.out.println("O NOME É: " +f.getNome());
                System.out.println("O SALÁRIO É: "+f.getSalario());
                System.out.println("O BÔNUS É: "+ ((Desenvolvedor) f).calcularBonusDesenvolvedor());
            }
        }

    }
}

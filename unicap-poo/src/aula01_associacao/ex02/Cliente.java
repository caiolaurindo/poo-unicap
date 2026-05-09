package aula01_associacao.ex02;

public class Cliente {
        String nome;
        String rg;
        Telefone tel;
        Data dt_nascimento;
        Endereco end;

        Cliente(String nome,  String rg,Telefone tel, Data dt_nascimento, Endereco end){
            this.nome = nome;
            this.rg = rg;
            this.tel = tel;
            this.dt_nascimento = dt_nascimento;
            this.end = end;
        }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", tel=" + tel +
                ", dt_nascimento=" + dt_nascimento +
                ", end=" + end +
                '}';
    }
}

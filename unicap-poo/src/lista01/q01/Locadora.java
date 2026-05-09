package lista01.q01;

import java.util.ArrayList;

public class Locadora {
    private String nome;
    private ArrayList<Filme> filmes;

    public Locadora(String nome) {
        this.nome = nome;
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }

    public String listarFilmes() {
        String resultado = "";
        for (Filme f : filmes) {
            resultado += f + "\n";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return"Locadora: " + nome + "\nFilmes:\n" + listarFilmes();

    }
}
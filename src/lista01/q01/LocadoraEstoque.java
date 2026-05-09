package lista01.q01;

public class LocadoraEstoque {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Batman", "Herói", 2022);
        Filme filme2 = new Filme("Superman", "Herói", 2025);
        Filme filme3 = new Filme("panico", "terror", 2026);


        Locadora locadora = new Locadora("Laurindo's locadora");

        locadora.adicionarFilme(filme1);
        locadora.adicionarFilme(filme2);
        locadora.adicionarFilme(filme3);

        System.out.println(locadora);

    }
}


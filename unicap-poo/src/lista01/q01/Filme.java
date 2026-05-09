package lista01.q01;

public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Informações do filme" + '\n' + "titulo: " + titulo + '\n' +
                "genero: " + genero + '\n' +
                "anoLancamento: " + anoLancamento
                ;
    }
}
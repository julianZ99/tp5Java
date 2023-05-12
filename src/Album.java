public class Album {
    private int year;
    private String titulo;
    private Artista artista;

    public Album() {
    }

    public Album(int year, String titulo, Artista artista) {
        this.year = year;
        this.titulo = titulo;
        this.artista = artista;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "----------" + "\n" +
                "ALBUM: " + getTitulo() + "\n" +
                "ARTISTA: " + getArtista() + "\n" +
                "YEAR: " + getYear() + "\n";
    }
}

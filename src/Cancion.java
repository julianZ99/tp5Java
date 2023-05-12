import javax.lang.model.type.NullType;

public class Cancion {
    private String nombre;
    private Album album;
    private Artista artista;
    private String duracion;
    private Generos genero;
    private Artista invitado;


    public Cancion(String nombre, Album album, Artista artista, String duracion, Generos genero, Artista invitado) {
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.invitado = invitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public Artista getInvitado() {
        return invitado;
    }

    public void setInvitado(Artista invitado) {
        this.invitado = invitado;
    }

    @Override
    public String toString() {
        if (this.invitado != null) {
            return "----------" + "\n" +
                    "CANCION: " + getNombre() + "\n" +
                    "ALBUM: " + album.getTitulo() + "\n" +
                    "ARTISTA: " + artista.getNombre() + ", feat. " + invitado.getNombre() + "\n" +
                    "GENERO: " + genero.getName() + "\n" +
                    "DURACION: " + getDuracion() + "\n";
        } else {
            return "----------" + "\n" +
                    "CANCION: " + getNombre() + "\n" +
                    "ALBUM: " + album.getTitulo() + "\n" +
                    "ARTISTA: " + artista.getNombre() + "\n" +
                    "GENERO: " + genero.getName() + "\n" +
                    "DURACION: " + getDuracion() + "\n";

        }
    }
}

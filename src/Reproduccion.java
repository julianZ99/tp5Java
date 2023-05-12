public interface Reproduccion {
    abstract String reproducir();
    abstract String anadirCancion(Cancion c);
    abstract String eliminarCancion(Cancion c);
    abstract String verMiLista();
    abstract Integer buscarCancion(String nombre);
}

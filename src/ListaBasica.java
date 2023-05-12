
import java.util.ArrayList;

public class ListaBasica implements Reproduccion {
    private String nombreLista;
    private ArrayList<Cancion> miLista;

    public ListaBasica() {
    }

    public ListaBasica(String nombre, ArrayList<Cancion> miLista) {
        this.nombreLista = nombre;
        this.miLista = miLista;
    }

    public String getNombreReproduccion() {
        return nombreLista;
    }

    public void setNombreLista(String nombre) {
        this.nombreLista = nombre;
    }

    public ArrayList<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(ArrayList<Cancion> miLista) {
        this.miLista = miLista;
    }


    @Override
    public String reproducir() {
        if (miLista.isEmpty()) {
            return "esta vacia :(";
        }

        return this.miLista.get(0).getNombre();
    }

    @Override
    public String anadirCancion(Cancion c) {
        return "necesitas ser premium";
    }

    @Override
    public String eliminarCancion(Cancion c) {
        return "necesitas ser premium";
    }

    @Override
    public String verMiLista() {
        if (miLista.isEmpty()) {
            return "La lista " + this.nombreLista +" esta vacia.";
        }
        this.miLista.forEach(miLista-> System.out.println(miLista.getNombre()));
        return "la viste? god";
    }

    @Override
    public Integer buscarCancion(String nombre) {
        return null;
    }
}
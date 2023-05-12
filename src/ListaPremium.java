
import java.util.ArrayList;
import java.util.Scanner;

public class ListaPremium implements Reproduccion{
    private String nombreReproduccionPremium;
    private ArrayList<Cancion> miListaPremium;

    public ListaPremium() {
    }

    public ListaPremium(String nombreReproduccionPremium) {
        this.nombreReproduccionPremium = nombreReproduccionPremium;
    }

    public ListaPremium(ArrayList<Cancion> miListaPremium) {
        this.miListaPremium = miListaPremium;
    }

    public String getNombreReproduccionPremium() {
        return nombreReproduccionPremium;
    }

    public void setNombreReproduccionPremium(String nombreReproduccionPremium) {
        this.nombreReproduccionPremium = nombreReproduccionPremium;
    }

    public ArrayList<Cancion> getMiListaPremium() {
        return miListaPremium;
    }

    public void setMiListaPremium(ArrayList<Cancion> miListaPremium) {
        this.miListaPremium = miListaPremium;
    }

    @Override
    public String reproducir() {
        String i;
        Integer flag=0, x=0;

        System.out.println(i=verMiLista());

        Scanner scan = new Scanner(System.in);

        String nombreABuscar = scan.nextLine();

        x=buscarCancion(nombreABuscar);
        if (x==null)
        {
            return "no la encontro y/o ni idea :(";
        }
        return miListaPremium.get(x).getNombre();

    }

    @Override
    public String anadirCancion(Cancion c) {

        miListaPremium.add(c);
        return "anadida correctamente :)";
    }

    @Override
    public String eliminarCancion(Cancion c) {
        String i;
        Integer flag=0, x=0;

        System.out.println(i=verMiLista());

        Scanner scan = new Scanner(System.in);

        String nombreABuscar = scan.nextLine();

        x=buscarCancion(nombreABuscar);
        if (x==null)
        {
            return "no la encontro y/o ni idea :(";
        }

        miListaPremium.remove(x);

        return "la cancion"+ miListaPremium.get(x).getNombre() + "fue eliminada :)";
    }

    @Override
    public String verMiLista() {
        if (miListaPremium.isEmpty()) {
            return "esta vacia :(";
        }
        this.miListaPremium.forEach(miListaPremium-> System.out.println(miListaPremium.getNombre()));
        return "elegi una cancion";
    }


    @Override
    public Integer buscarCancion(String nombre) {

        Integer flag=0, x=0;

        while (flag==0 && x<miListaPremium.size())
        {
            if (nombre.equals(miListaPremium.get(x).getNombre()))
            {
                flag=1;
                return x;
            }
            x++;
        }
        return null;
    }
}
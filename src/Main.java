import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("SCROTIFY!");
        ArrayList<Cancion> canciones = new ArrayList<>();
        Artista noriken = new Artista("DJ Noriken", 33, "Japan");
        Artista sopa = new Artista("sopa", 24, "Argentina");
        Album h1storya = new Album(2017, "#H1STORYA", noriken);
        Album nightmares = new Album(2023, ".nightmares", sopa);
        Cancion uk01 = new Cancion("Lucia",h1storya, noriken,"6:28", Generos.HC, null);
        Cancion uk02 = new Cancion("Emotional Sky",h1storya, noriken,"5:35", Generos.HC, null);
        Cancion uk03 = new Cancion("Hardcore Soldiers",nightmares,sopa, "4:42",Generos.HC, noriken);
        Cancion uk04 = new Cancion("M4GNUM D0NG",nightmares,sopa, "6:69",Generos.HC, null);
        canciones.add(uk01);
        canciones.add(uk02);
        canciones.add(uk03);
        canciones.add(uk04);

        ListaBasica gym = new ListaBasica("lista para el gym",canciones);
        System.out.println(gym.verMiLista());

    }
}
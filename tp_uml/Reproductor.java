
package ar.charlycimino.tp_uml;

public class Reproductor {


    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + 
                           " - " + cancion.getArtista().getNombre());
    }
}


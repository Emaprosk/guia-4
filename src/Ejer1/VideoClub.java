
package Ejer1;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;

public class VideoClub {


    public void consualtarDetallesDeUnaPeliDeterminada(LinkedList<Pelicula> pelis,String pelicula,LinkedList<Alquiler> listAlq){
        Pelicula p;
        Alquiler q;
        p= buscarPeliculaDeterminada(pelis,pelicula);
        q=buscarPeliculaDeterminadaEnAlquiler(listAlq,pelicula);

        if (p.equals(q.getPeli())){
            System.out.println( q );  // Se muestra como alquiler para obtener la mayor info posible de la pelicula, en este caso si fue alquilada.
        }
    }

    private Pelicula buscarPeliculaDeterminada (LinkedList<Pelicula> listP, String nPeli){
        for (Pelicula p: listP) {
            if (p.getTitulo().equals(nPeli)){
                return p;
            }
        }

        return null;
    }
    private Alquiler buscarPeliculaDeterminadaEnAlquiler(LinkedList<Alquiler> listA, String nPeli){
        for (Alquiler a:listA) {
            if (a.getPeli().getTitulo().equals(nPeli)){
                return a;
            }
        }
        return null;
    }

    private boolean verificarSiesta(LinkedList<Pelicula> popu,Pelicula aComparar){
        for (Pelicula p: popu) {
            if ((p.getTitulo().equals(aComparar.getTitulo()))){
                return true;
            }
        }
        return false;
    }

    public void consultarPelisMasAlquilasConMejoras(LinkedList<Alquiler> alquis,String gene){
        LinkedList<Pelicula> populares = new LinkedList<>();
        for (Alquiler alq: alquis) {
            if ((alq.getPeli().getGenero()).equals(gene)){
                if (!verificarSiesta(populares,alq.getPeli())) {
                    populares.add(alq.getPeli());
                }
            }
        }
        populares.sort(Comparator.comparingInt(Pelicula::getVecesAlquiladas).reversed());
        System.out.println("la peli es"+populares);
    }

    public Pelicula consultarPelisMasAlquilas(LinkedList<Alquiler> alquis){
        Pelicula mayor= alquis.get(1).getPeli();
        for (Alquiler a: alquis){
            if(a.getPeli().getVecesAlquiladas()>mayor.getVecesAlquiladas()){
                mayor=a.getPeli();
            }
        }
        System.out.println("la pelicula mas alquilada es "+mayor.getTitulo()+ " el numero de veces "+mayor.getVecesAlquiladas());
        return mayor;
    }

    public void consultarAlquileres(LinkedList<Alquiler> alquileres){
        LocalDate hoy = LocalDate.now();
        for (Alquiler alqui: alquileres) {
            if((alqui.getFechaIngreso().equals(hoy))){
                System.out.println(alqui);

            }
        }
    }

    public LinkedList<Alquiler> consulUltiAlquileres(LinkedList<Alquiler> alquilers,Cliente client){
        LinkedList<Alquiler> aux= new LinkedList<>();

        for (Alquiler alqui: alquilers) {
            if (alqui.getClient().equals(client)){
                aux.addFirst(alqui);
            }
        }

        return aux;
    }

    public void consultarDisponibilidad(LinkedList<Pelicula> listPeliculas, String nombre){
        for (Pelicula peli: listPeliculas) {
            if(peli.getTitulo().equals(nombre)) {
                if (peli.getStock() > 0) {
                    System.out.println("Disponible");
                } else {
                    System.out.println("sin Stock");
                }
            }
        }
    }


}

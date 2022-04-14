import Ejer1.*;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Pelicula> listPelis = new LinkedList<>();
        LinkedList<Cliente> listClients = new LinkedList<>();
        LinkedList<Alquiler> listAlquileres = new LinkedList<>();



        Pelicula peli1= new Pelicula("Matilda", Genero.DRAMA, 20,2, 1, Classification.G);
        Pelicula peli2= new Pelicula("Hanssel y Gretel", Genero.AVENTURA, 20,2, 3, Classification.G);
        Pelicula peli3= new Pelicula("Scary Movie", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli4= new Pelicula("S", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli5= new Pelicula("Sce", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli6= new Pelicula("Scvie", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli7= new Pelicula("adc", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli8= new Pelicula("Saweawee", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli9= new Pelicula("aweraree", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli10= new Pelicula("Sgfgh", Genero.COMEDIA, 20,2, 2, Classification.G);
        Pelicula peli11= new Pelicula("ghye", Genero.COMEDIA, 20,2, 2, Classification.G);

        Cliente client1 = new Cliente("Emanuel", "1234","mdq");
        Cliente client2 = new Cliente("Perez", "1234","mdq");
        Cliente client3 = new Cliente("Gomez", "1234","mdq");

        listPelis.addFirst(peli1);
        listPelis.addFirst(peli2);
        listPelis.addFirst(peli3);
        listPelis.addFirst(peli4);
        listPelis.addFirst(peli6);
        listPelis.addFirst(peli7);
        listPelis.addFirst(peli8);
        listPelis.addFirst(peli9);
        listPelis.addFirst(peli10);
        listPelis.addFirst(peli11);



        // region Agrega un alquiler
        Alquiler alq1 = new Alquiler(peli1,client1, LocalDate.now(),LocalDate.now().plusDays(2));
        Alquiler alq2 = new Alquiler(peli3,client2, LocalDate.now(),LocalDate.now());
        Alquiler alq3 = new Alquiler(peli1,client3, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq4 = new Alquiler(peli3,client2, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq5 = new Alquiler(peli2,client3, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq6 = new Alquiler(peli2,client1, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq7 = new Alquiler(peli2,client2, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq8 = new Alquiler(peli3,client2, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq9 = new Alquiler(peli9,client2, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq10 = new Alquiler(peli2,client2, LocalDate.now(),LocalDate.now().plusDays(1));
        Alquiler alq11 = new Alquiler(peli11,client2, LocalDate.now(),LocalDate.now().plusDays(1));
        //System.out.println(alq1);

        listAlquileres.add(alq1);
        listAlquileres.add(alq2);
        listAlquileres.add(alq3);
        listAlquileres.add(alq4);
        listAlquileres.add(alq5);
        listAlquileres.add(alq6);
        listAlquileres.add(alq7);
        listAlquileres.add(alq8);
        listAlquileres.add(alq9);
        listAlquileres.add(alq10);
        listAlquileres.add(alq11);

        //endregion

        listClients.add(client1);
        listClients.add(client2);
        listClients.add(client3);

        VideoClub vd = new VideoClub();
        //vd.consultarDisponibilidad(listPelis,"Matilda");

        //vd.consultarAlquileres(listAlquileres);

        //System.out.println(vd.consulUltiAlquileres(listAlquileres,client2));

        //vd.consultarPelisMasAlquilas(listAlquileres);

        //vd.consultarPelisMasAlquilasConMejoras(listAlquileres,Genero.COMEDIA);









        //System.out.println(listaPeliculas);





    }
}

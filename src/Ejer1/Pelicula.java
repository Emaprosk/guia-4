package Ejer1;

public class Pelicula {
    //region Ejemplo de Region
//    Nos contactan para realizar un software que le permita a un video store gestionar los
//    alquileres de sus películas. Nuestro cliente, Roberto, nos cuenta que su negocio dispone de
//    un amplio catálogo de películas, de los siguientes géneros. Acción, Aventura, Comedia,
//    Drama, Horror y Documental. Cada film de su inventario cuenta con un título, una fecha de
//    lanzamiento, una duración en minutos, una clasificación de audiencia, las siglas del país de
//    origen y una descripción de la misma. El video store de Roberto, ofrece la posibilidad de
//    alquilar los títulos físicamente, esto significa que hay un límite fijo de copias de cada título.
//    Por otro lado, nuestro cliente nos cuenta que le interesa saber acerca de quienes alquilan
//    sus películas, su nombre, teléfono y dirección.
//    Roberto además nos cuenta como es el proceso de alquiler de un título de su colección, el
//    cliente se acerca, solicita una película, Roberto corrobora que exista en su colección si
//    existe, se asegura que tenga una copia disponible. Por último le pide los datos a su cliente,
//    si ya existe, procede a generar una boleta de préstamo definiendo la fecha de retiro y la
//    fecha de devolución. Caso contrario, primero carga los datos del nuevo cliente y continúa
//    con la reserva. Una vez que el tiempo de préstamo finaliza y el cliente se acerca a devolver
//    el título, Roberto, anota la devolución y guarda el título para tenerlo listo para el próximo
//    alquiler


    /// Generos: Acción, Aventura, Comedia, Drama, Horror y Documental.

    // Clase Pelicula:  Titulo, Genero, Fecha, Duracion, audiencia,
    // Siglas pais, Descripcion, Stock, Boolean.

    // Cliente: Pelicula, Nombre, Telefono, Direccion.

    //endregion
    private String titulo;
    private String genero;
    private int estreno;              //Estreno de lanzamiento
    private float duraciones;
    private int stock;
    private String clasificacion;
    private String pais = "ARG";
    private String descripcion= "Soy una pelicula";
    private int vecesAlquiladas = 0;                 // Cantidad de veces que se alquilo
    //private boolean alquilado= true;


    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int estreno, float duraciones, int stock, String clasificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.estreno = estreno;
        this.duraciones = duraciones;
        this.stock = stock;
        this.clasificacion= clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public float getDuraciones() {
        return duraciones;
    }

    public void setDuraciones(float duraciones) {
        this.duraciones = duraciones;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVecesAlquiladas() {
        return vecesAlquiladas;
    }

    public int incrementarVecesAlquiladas(){
        return this.vecesAlquiladas+=1;
    }

    @Override
    public String toString() {
        return "\nPeliculas{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", fecha=" + estreno +
                ", duraciones=" + duraciones +
                ", stock=" + stock +
                ", clasificacion='" + clasificacion + '\'' +
                ", pais='" + pais + '\'' +
                ", descripcion='" + descripcion + '\'' + ", count "+ vecesAlquiladas +
                '}' ;
    }
}

package modelo;

public class Coleccion extends Libro
{
    //Atributos
    protected int numeroDeColeccion;
    protected String nombre;

    //Constructor
    public Coleccion(String titulo, String autor, int anioEdicion, Boolean lujo, int numeroDeColeccion, String nombre)
    {
        super(titulo, autor, anioEdicion, lujo);
        this.numeroDeColeccion = numeroDeColeccion;
        this.nombre = nombre;
    }

    //Getters
    public int getNumerodeColeccion()
    {
        return numeroDeColeccion;
    }

    public String getNombre()
    {
        return nombre;
    }

    //Setters


    public void setNumerodeColeccion(int numeroDeColeccion)
    {
        this.numeroDeColeccion = numeroDeColeccion;
    }
    

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }


    
}

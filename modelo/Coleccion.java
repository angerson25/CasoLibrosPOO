package modelo;

import java.util.ArrayList;


public class Coleccion extends Libro
{
    //Atributos
    protected int numeroDeColeccion;
    protected String nombre;
    protected ArrayList coleccion;

    //Constructor
    public Coleccion()
    {
        coleccion = new ArrayList();
    }


    //Setters



    //Metodos
    public void agregarLibro(Libro libro)
    {
        coleccion.add(libro);
    }

   


    
}

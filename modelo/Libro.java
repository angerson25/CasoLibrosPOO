package modelo;

public class Libro
{  
    //Atributos
    protected String titulo;
    protected String autor;
    protected int anioEdicion;
    protected Boolean lujo;

    //Constructor
    public Libro()
    {
        titulo = "";
        autor = "";
        anioEdicion = 0;
        lujo = false;
    }
    public Libro(String titulo, String autor, int anioEdicion, Boolean lujo)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.lujo = false;
    }

    //Getters
    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public int getAnioEdicion()
    {
        return anioEdicion;
    }

    public Boolean getLujo()
    {
        return lujo;
    }

    //Setters

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public void setAnioEdicion(int anioEdicion)
    {
        this.anioEdicion = anioEdicion;
    }

    public void setLujo(Boolean lujo)
    {
        this.lujo = lujo;
    }

    //Metodos
    public String toString()
    {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAño de edicion: " + anioEdicion + "\nLujo: " + (lujo ? "Si" : "No");
    }







}
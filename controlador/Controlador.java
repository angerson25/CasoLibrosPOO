package controlador;

import modelo.Coleccion;
import modelo.Libro;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    
    //----------------------
    // Atributos
    //----------------------
    private VentanaPrincipal miVentana;
    private Libro miLibro;
    private Coleccion miColeccion;
    
    //----------------------
    // Metodos
    //----------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pMiVentana, Libro pMiLibro)
    {
        this.miVentana = pMiVentana;
        this.miLibro = pMiLibro;
        this.miVentana.miPanelEntradaDatos.agregarOyentesBotones(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if(comando.equals("Agregar"))
        {   
            miLibro.setTitulo(miVentana.miPanelEntradaDatos.getTitulo());
            miLibro.setAutor(miVentana.miPanelEntradaDatos.getAutor());
            miLibro.setAnioEdicion(miVentana.miPanelEntradaDatos.getAnioEdicion());
            miLibro.setLujo(miVentana.miPanelEntradaDatos.getLujo());




            miVentana.miPanelResultados.mostrarResultado(miLibro.toString());

            
            miColeccion.agregarLibro(miLibro);
        }
        
        if(comando.equals("Limpiar"))
        {
            miVentana.miPanelEntradaDatos.limpiar();
        }

        if(comando.equals("Salir"))
        {
            System.exit(0);
        }

        

        

        
    }

}

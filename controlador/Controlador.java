package controlador;

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

        

        

        
    }

}

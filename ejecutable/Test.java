package ejecutable;
import java.util.ResourceBundle.Control;

import controlador.Controlador;
import modelo.Libro;
import vista.VentanaPrincipal;

public class Test {
    public static void main(String[] args)
    {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Libro mLibro = new Libro();
        Controlador miControlador = new Controlador(miVentanaPrincipal, mLibro);
    }
}

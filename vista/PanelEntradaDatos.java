package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelEntradaDatos extends JPanel{
    //----------------------
    // Atributos
    //----------------------

    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbAnioEdicion;
    private JLabel lbLujo;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtAnioEdicion;
    private JCheckBox chkLujo;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JButton btnSalir;

    //----------------------
    // Constructor
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Creación de los componentes del panel
        lbTitulo = new JLabel("Titulo:");
        lbTitulo.setBounds(20,30,100,20);
        this.add(lbTitulo);
        
        lbAutor = new JLabel("Autor:");
        lbAutor.setBounds(20,60,100,20);
        this.add(lbAutor);

        lbAnioEdicion = new JLabel("Año Edición:");
        lbAnioEdicion.setBounds(20,90,100,20);
        this.add(lbAnioEdicion);

        lbLujo = new JLabel("Lujo:");
        lbLujo.setBounds(20,120,100,20);
        this.add(lbLujo);
        

        txtTitulo = new JTextField();
        txtTitulo.setBounds(130,30,200,20);
        this.add(txtTitulo);

        txtAutor = new JTextField();
        txtAutor.setBounds(130,60,200,20);
        this.add(txtAutor);

        txtAnioEdicion = new JTextField();
        txtAnioEdicion.setBounds(130,90,200,20);
        this.add(txtAnioEdicion);

        chkLujo = new JCheckBox();
        chkLujo.setBounds(130,120,20,20);
        this.add(chkLujo);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(350,30,100,20);
        this.add(btnAgregar);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(350,60,100,20);
        this.add(btnLimpiar);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(350,90,100,20);
        this.add(btnSalir);

        



        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btnAgregar.addActionListener(pAL);
        btnLimpiar.addActionListener(pAL);
        btnSalir.addActionListener(pAL);
        
    }




    
}

package Vista;

import Modelo.Usuario1;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class formulario {

    JFrame ventana = new JFrame("Registro Cajero");
    private JComboBox cmbsexo;

    JPanel panel = new JPanel();
    //CREO UN TEXTFIELD PARA EL ANCHO DEL CONTENIDO DE ESPACIO
    JTextField texto1 = new JTextField(10);
    JTextField texto2 = new JTextField(10);
    JTextField texto3 = new JTextField(10);
    JTextField texto4 = new JTextField(10);
    JTextField texto5 = new JTextField(10);
    JTextField texto6 = new JTextField(10);
    JTextField texto7 = new JTextField(10);
//    private Alumno alumno = new Alumno();
    //CREO UN JLABEL PARA PODER INGRESAR LOS DATOS
    JLabel nombres = new JLabel("Nombre:  ");
    JLabel apellidos = new JLabel("Apellido:  ");
    JLabel num_cedula = new JLabel("Cédula:  ");
    JLabel edad = new JLabel("Edad:  ");
    JLabel direccion = new JLabel("Dirección:  ");
    JLabel telefono = new JLabel("Teléfono:  ");
    //CREO UN JBUTTON PARA MOSTRAR LOS BOTONES 
    JButton b_guardar = new JButton("Guardar");
    JButton b_eliminar = new JButton("Eliminar ");
    JLabel etiqueta = new JLabel();
    ImageIcon imagen = new ImageIcon(getClass().getResource("/imagen/ic.PNG"));
//    JButton b_actualizar = new JButton("Actualizar");
//    JButton b_verificar = new JButton("Verificar");

    public formulario() {
        ventana.setSize(400, 500);
        ventana.setLocation(100, 100);
        etiqueta.setIcon(imagen);
        crearComponentes();
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Registro Cajero");

    }

    public void crearComponentes() {
        ventana.getContentPane().add(panel);
        panel.setBackground(Color.CYAN);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints contenedor1 = new GridBagConstraints();
        //FIJAR EL PRIMER JLABEL Y EL JTEXTFIELD
        contenedor1.gridx = 0;
        contenedor1.gridy = 0;
        contenedor1.insets = new Insets(10, 10, 10, 10);
        panel.add(nombres, contenedor1);
        contenedor1.gridx = 1;
        contenedor1.gridy = 0;
        panel.add(texto1, contenedor1);
        contenedor1.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor2 = new GridBagConstraints();
        contenedor2.gridx = 0;
        contenedor2.gridy = 1;
        contenedor2.insets = new Insets(10, 10, 10, 10);
        panel.add(apellidos, contenedor2);
        contenedor2.gridx = 1;
        contenedor2.gridy = 1;
        panel.add(texto2, contenedor2);
        contenedor2.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor3 = new GridBagConstraints();
        contenedor3.gridx = 0;
        contenedor3.gridy = 2;
        contenedor3.insets = new Insets(10, 10, 10, 10);
        panel.add(num_cedula, contenedor3);
        contenedor3.gridx = 1;
        contenedor3.gridy = 2;
        panel.add(texto3, contenedor3);
        contenedor3.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor4 = new GridBagConstraints();
        contenedor4.gridx = 0;
        contenedor4.gridy = 3;
        contenedor4.insets = new Insets(10, 10, 10, 10);
        panel.add(edad, contenedor4);
        contenedor4.gridx = 1;
        contenedor4.gridy = 3;
        panel.add(texto4, contenedor4);
        contenedor4.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor6 = new GridBagConstraints();
        contenedor6.gridx = 0;
        contenedor6.gridy = 5;
        contenedor6.insets = new Insets(10, 10, 10, 10);
        panel.add(direccion, contenedor6);
        contenedor6.gridx = 1;
        contenedor6.gridy = 5;
        panel.add(texto6, contenedor6);
        contenedor6.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints contenedor7 = new GridBagConstraints();
        contenedor7.gridx = 0;
        contenedor7.gridy = 6;
        contenedor7.insets = new Insets(10, 10, 10, 10);
        panel.add(telefono, contenedor7);
        contenedor7.gridx = 1;
        contenedor7.gridy = 6;
        panel.add(texto7, contenedor7);
        contenedor7.insets = new Insets(10, 10, 10, 10);

        GridBagConstraints g_boton = new GridBagConstraints();
        g_boton.gridy = 0;
        g_boton.gridy = 8;
        panel.add(b_guardar, g_boton);

        g_boton.gridy = 1;
        g_boton.gridy = 8;
        panel.add(b_eliminar, g_boton);

    }

    public String eliminarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario1 guardarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void limpiarCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bloquearCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

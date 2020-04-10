package Controlador;

import Vista.Reserva;
import Vista.formulario;
import Vista.VAlquiler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class OyenteVentanaP extends JFrame {

    JMenuBar menu = new JMenuBar();
    JMenu menu1;
    JMenuItem InicioSesion, Salir;

    public OyenteVentanaP() {
        super("Cancha Sintetica");
        dispose();
        setSize(400, 400);
        setLocationRelativeTo(null);
        iniciarComponentes();
        setVisible(true);

    }

    public JMenuItem getInicioSecion() {
        return InicioSesion;
    }

    public JMenuItem getMiSalir() {
        return Salir;
    }

    private void iniciarComponentes() {

        setJMenuBar(menu);
        menu1 = new JMenu("Cliente");
        menu.add(menu1);

        InicioSesion = new JMenuItem("Inicio de Sesion");
        InicioSesion.addActionListener(new VentanaP());
        menu1.add(InicioSesion);

        Salir = new JMenuItem("Salir");
        Salir.addActionListener(new VentanaP());
        menu1.add(Salir);

        /////////////////////
        /*setJMenuBar(menu2);
        menu02 = new JMenu("Productos");
        menu2.add(menu02);
        
        RegistrarProducto = new JMenuItem("Registrar Producto");
        RegistrarProducto.addActionListener(new VentanaP());
        menu1.add(RegistrarProducto);*/
    }

    public class VentanaP implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Salir) {
                System.exit(0);
            }
            if (e.getSource() == InicioSesion) {
                Reserva reserva = new Reserva();

            }

            /*if (e.getSource() == miAleartoria) {
                 VAleartorioAlumnos i = new VAleartorioAlumnos();

            }*/
        }
    }

    public static void main(String[] args) {
        OyenteVentanaP o = new OyenteVentanaP();

    }

}

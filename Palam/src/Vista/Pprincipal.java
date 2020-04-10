package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pprincipal extends JFrame {

    JPanel p = new JPanel();
    JPanel p2 = new JPanel();

    JButton b2 = new JButton("Alquiler de la cancha");
    JButton b4 = new JButton("Nuevo Usuario");
    JButton b6 = new JButton("Salir");
    JLabel etiqueta = new JLabel();
    ImageIcon image = new ImageIcon(getClass().getResource("/imagen/rese.jfif"));

    public Pprincipal() {
        super("Reserva Cancha Sintetica");
        setLocation(300, 300);
        setSize(500, 300);
        etiqueta.setIcon(image);
        agregar();
        dispose();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void agregar() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        p.add(etiqueta, g);
        g.gridx = 0;
        g.gridy = 1;
        g.gridwidth = 1;

        p.add(b2, g);
        g.gridx = 0;
        g.gridwidth = 0;
        g.gridy = 2;

        p.add(b4, g);
        g.gridx = 0;
        g.gridwidth = 0;
        g.gridy = 4;

        p.add(b6, g);
        g.gridx = 2;
        g.gridwidth = 2;
        g.gridy = 5;

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b6.getText() == "Salir") {
                    System.exit(0);
                } else {
                    dispose();
                }

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    new VAlquiler();
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b4) {
                    new formulario();
                }
            }
        });
    }

    public static void main(String[] args) {
        Pprincipal pagina = new Pprincipal();
    }

}

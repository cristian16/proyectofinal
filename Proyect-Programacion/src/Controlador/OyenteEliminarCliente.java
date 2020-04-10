package Controlador;

import Modelo.UsuarioBD;
import Vista.Vformulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteEliminarCliente implements ActionListener {

    Vformulario Rcliente;
    UsuarioBD base;

    public OyenteEliminarCliente(Vformulario c) {
        this.Rcliente = c;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        base.eliminarCliente(Rcliente.eliminarCliente());
    }

}

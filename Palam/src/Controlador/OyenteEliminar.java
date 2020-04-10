package Controlador;

import Modelo.ClienteBD;
import Vista.formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteEliminar implements ActionListener {

    formulario Rcliente;
    ClienteBD base;

    public OyenteEliminar(formulario c) {
        this.Rcliente = c;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        base.eliminarCliente(Rcliente.eliminarCliente());
    }

}

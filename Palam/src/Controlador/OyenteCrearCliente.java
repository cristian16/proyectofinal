package Controlador;

import Modelo.Usuario1;
import Modelo.ClienteBD;
import Vista.formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearCliente implements ActionListener {

   formulario Rcliente;
    ClienteBD base;
    Usuario1 cliente;

    public OyenteCrearCliente(formulario c) {
        this.Rcliente = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //de la vista recibo un cliente
        cliente = Rcliente.guardarCliente();
        //en la base de datos se registra un cliente a guardar
        base.guardarClienteBD(cliente);
        //envio  a limpiar los campos
        Rcliente.limpiarCampos();
        Rcliente.bloquearCampos();
    }
}

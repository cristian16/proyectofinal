package Controlador;

import Modelo.Usuario1;
import Modelo.UsuarioBD;
import Vista.Vformulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteCrearCliente implements ActionListener {

    Vformulario Rcliente;
    UsuarioBD base;
    Usuario1 cliente;

    public OyenteCrearCliente(Vformulario c) {
        this.Rcliente = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //de la vista recibo un cliente
        cliente = Rcliente.guardarCliente();
        //en la base de datos se registra un cliente a guardar
        base.guardarClienteBD(cliente);
    }
}

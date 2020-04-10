package Controlador;

import Modelo.Usuario1;
import Modelo.ClienteBD;
import Vista.formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteActualizarCliente {

    public class OyenteActualizarALumno implements ActionListener {

        Formulario cliente;
        ClienteBD base;
        Usuario1 c;

        public OyenteActualizarALumno(Formulario c) {
            this.cliente = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            base = new ClienteBD();
            base.actualizarCliente(cliente.guardarCliente());

            cliente.limpiarCampos();
            cliente.bloquearCampos();

        }

    }

}

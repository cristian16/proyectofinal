package Controlador;

import Modelo.Usuario1;
import Modelo.UsuarioBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OyenteActualizarCliente {

    public class OyenteActualizarALumno implements ActionListener {

        OyenteVFormulario cliente;
        UsuarioBD base;
        Usuario1 c;

        public OyenteActualizarALumno(OyenteVFormulario c) {
            this.cliente = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            base = new UsuarioBD();
            cliente.limpiarCampos();
            cliente.bloquearCampos();

        }

    }

}

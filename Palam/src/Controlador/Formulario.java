
package Controlador;

import Modelo.Usuario1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Formulario {

    Usuario1 guardarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void limpiarCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void bloquearCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class OyenteGuardarEstudiante implements ActionListener {

        Usuario1 de;

        public OyenteGuardarEstudiante(Usuario1 de) {
            this.de = de;
        }

        public void actionPerformed(ActionEvent arg0) {

            de.guardar();
        }
    }
}

package main.servicios;

import main.impl.Descargable;
import main.model.Usuario;

public class ServicioDescargaProxy implements Descargable {
    @Override
    public void descargar(Usuario usuario) {
        if (validarTipo(usuario)) {
            ServicioDescarga spotify = new ServicioDescarga();
            spotify.descargar(usuario);
        } else {
            System.out.println("No eres premium");
        }
    }

    public boolean validarTipo(Usuario usuarioTipo) {
        return usuarioTipo.getTipoUsuario().equalsIgnoreCase("Premium");
    }
}

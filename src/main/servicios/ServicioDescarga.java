package main.servicios;

import main.impl.Descargable;
import main.model.Usuario;

public class ServicioDescarga implements Descargable {
    @Override
    public void descargar(Usuario usuario) {
        System.out.println("Se ha descargado la canción");
    }
}

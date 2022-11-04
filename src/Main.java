import main.impl.Descargable;
import main.model.Usuario;
import main.servicios.ServicioDescargaProxy;

public class Main {
    public static void main(String[] args) {

            Usuario hele = new Usuario(1,"Premium");
            Usuario agus = new Usuario(2,"Free");

            Descargable spotify = new ServicioDescargaProxy();

            spotify.descargar(hele);
            spotify.descargar(agus);

    }
}
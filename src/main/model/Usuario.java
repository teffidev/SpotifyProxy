package main.model;

public class Usuario {
    private Integer identificador;
    private String tipoUsuario;

    public Usuario(Integer identificador, String tipoUsuario) {
        this.identificador = identificador;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

}

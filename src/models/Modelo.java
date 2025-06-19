package models;

public class Modelo {

    private String nombreUsuario;
    private String contrasennia;
    private boolean modoOscuro = false;

    public Modelo() {
    }

    public Modelo(String nombreUsuario, String contrasennia) {
        this.nombreUsuario = nombreUsuario;
        this.contrasennia = contrasennia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasennia() {
        return contrasennia;
    }

    public void setContrasennia(String contrasennia) {
        this.contrasennia = contrasennia;
    }
    
    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }
    
    public boolean habilitarModoOscuro() {
        this.setModoOscuro(true);
        return this.isModoOscuro();
    }
    
    public boolean deshabilitarModoOscuro() {
        this.setModoOscuro(false);
        return this.isModoOscuro();
    }

}

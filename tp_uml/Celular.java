
package ar.charlycimino.tp_uml;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;  
    private Usuario usuario;   

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this);
    }

    @Override
    public String toString() {
        return "Celular [IMEI=" + imei + ", marca=" + marca + ", modelo=" + modelo + 
               ", batería=" + bateria + ", usuario=" + usuario + "]";
    }
}


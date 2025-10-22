
package ar.charlycimino.tp_uml;


public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;      
    private Titular titular; 

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this);
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision + 
               ", foto=" + foto + ", titular=" + titular + "]";
    }
}


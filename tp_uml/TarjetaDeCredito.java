
package ar.charlycimino.tp_uml;


public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; 
    private Banco banco; 

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setTarjeta(this); 
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento +
               ", banco=" + banco + ", cliente=" + cliente + "]";
    }
}


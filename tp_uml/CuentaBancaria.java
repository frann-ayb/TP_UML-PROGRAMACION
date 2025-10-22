
package ar.charlycimino.tp_uml;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; 
    private Titular2 titular;      

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        // La clave se crea dentro de la cuenta → composición
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular2 getTitular() {
        return titular;
    }

    public void setTitular(Titular2 titular) {
        this.titular = titular;
        titular.setCuenta(this); 
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + 
               ", clave=" + clave + ", titular=" + titular + "]";
    }
}


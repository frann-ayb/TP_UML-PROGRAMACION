
package ar.charlycimino.tp_uml;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de: " + 
                           impuesto.getContribuyente().getNombre() + 
                           " Monto: $" + impuesto.getMonto());
    }
}


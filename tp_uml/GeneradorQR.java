
package ar.charlycimino.tp_uml;

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Código QR generado para " + usuario.getNombre() +
                           " con valor: " + qr.getValor());
    }
}


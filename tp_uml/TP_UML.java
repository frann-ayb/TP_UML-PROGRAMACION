
package ar.charlycimino.tp_uml;

public class TP_UML {
    public static void main(String[] args) {
        // Crear batería (puede existir sin el celular)
        Bateria bateria = new Bateria("Samsung-EBBG", 5000);

        // Crear usuario
        Usuario usuario = new Usuario("Lucía Gómez", "45872136");

        // Crear celular con batería
        Celular celular = new Celular("356789456123789", "Samsung", "Galaxy S23", bateria);

        // Vincular celular ↔ usuario (bidireccional)
        celular.setUsuario(usuario);

        // Mostrar información
        System.out.println(celular);
        System.out.println(usuario.getCelular());
    }
}

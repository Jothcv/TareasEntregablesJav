package Objetos.ClasesObjetosENT;

public class TiendaLibrosEjecutable {
    public static void main(String[] args) {
        TiendaLibros TiendaLibros2= new TiendaLibros();

        System.out.println("Detalles de un libro desconocido");
        TiendaLibros2.mostrarDetalles();

        TiendaLibros TiendaLibros3=new TiendaLibros("la vuelta al mundo en 80 dias","Jules Verne",40,96,"Pierre-Jules Hetzel");
        System.out.println("\ndetalles del libro2");
        TiendaLibros3.mostrarDetalles();
        TiendaLibros3.actualizarPrecio(43.2);

        System.out.println("\nel mismo libro pero con mas descuento por verano ");
        TiendaLibros3.mostrarDetalles();
    }
}
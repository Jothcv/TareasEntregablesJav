package Objetos.ClasesObjetosENT;

public class TiendaLibros {
    String titulo;
    String autor;
    double precio;
    int numeroPaginas;
    String editorial;


    public TiendaLibros(){
        this.titulo="desconocido";
        this.autor="desconocido";
        this.precio=0.0;
        this.numeroPaginas=0;
        this.editorial="desconocida";
    }

    public TiendaLibros(String titulo, String autor, double precio, int numeroPaginas, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
    }

    public void mostrarDetalles() {
        System.out.println("Título " + titulo);
        System.out.println("Autor " + autor);
        System.out.println("Precio " + precio);
        System.out.println("Numero de paginas " + numeroPaginas);
        System.out.println("Editorial " + editorial);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El nuevo precio del libro es " + nuevoPrecio);
    }

}

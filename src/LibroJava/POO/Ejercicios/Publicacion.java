package LibroJava.POO.Ejercicios;

public abstract class Publicacion {

    /*Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
Revista. Las clases deben estar implementadas con la jerarquía correcta. Las
características comunes de las revistas y de los libros son el código ISBN, el
título, y el año de publicación. Los libros tienen además un atributo prestado.
Cuando se crean los libros, no están prestados. Las revistas tienen un número.
La clase Libro debe implementar la interfaz Prestable que tiene los métodos
presta, devuelve y estaPrestado.*/

    //Atributos
    private String isbn;
    private String titulo;
    private  int anioPublicacion;


    //Constructor
    public Publicacion(String isbn, String titulo, int anioPublicacion){
        this.isbn=isbn;
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
    }


    @Override
    public String toString() {
        return "ISBN: "+isbn+", título "+titulo+", año de publicación: "+anioPublicacion;
    }
}

package LibroJava.POO.Ejercicios;

public abstract class Publicacion {

    /*Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
Revista. Las clases deben estar implementadas con la jerarqu�a correcta. Las
caracter�sticas comunes de las revistas y de los libros son el c�digo ISBN, el
t�tulo, y el a�o de publicaci�n. Los libros tienen adem�s un atributo prestado.
Cuando se crean los libros, no est�n prestados. Las revistas tienen un n�mero.
La clase Libro debe implementar la interfaz Prestable que tiene los m�todos
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
        return "ISBN: "+isbn+", t�tulo "+titulo+", a�o de publicaci�n: "+anioPublicacion;
    }
}

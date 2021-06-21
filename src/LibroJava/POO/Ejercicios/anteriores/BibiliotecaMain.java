package LibroJava.POO.Ejercicios;

public class BibiliotecaMain {
    public static void main(String[] args) {

        /*Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
         Revista. Las clases deben estar implementadas con la jerarqu�a correcta. Las
         caracter�sticas comunes de las revistas y de los libros son el c�digo ISBN, el
         t�tulo, y el a�o de publicaci�n. Los libros tienen adem�s un atributo prestado.
         Cuando se crean los libros, no est�n prestados. Las revistas tienen un n�mero.
         La clase Libro debe implementar la interfaz Prestable que tiene los m�todos
         presta, devuelve y estaPrestado.*/

        Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
        Libro libro2 = new Libro("112233", "Los Otros", 2016);
        Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
        Revista revista1 = new Revista("444555", "A�o Cero", 2019, 344);
        Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        libro2.presta();
        if (libro2.estaPrestado()) {
            System.out.println("El libro est� prestado");
        }
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado()) {
            System.out.println("El libro est� prestado");
        }
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3);

    }
}

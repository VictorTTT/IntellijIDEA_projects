package LibroJava.POO.Ejercicios;

public class Revista extends Publicacion{

    //Atributos de las revistas
    private int numero;


    public Revista(String isbn, String titulo, int anioPublicacion, int numero) {
        super(isbn, titulo, anioPublicacion);
        this.numero=numero;
    }
}

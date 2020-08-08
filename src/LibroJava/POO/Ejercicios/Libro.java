package LibroJava.POO.Ejercicios;

public class Libro extends Publicacion implements Prestable {


    //Atributos

    private boolean prestado = false;//Cunado se crea un objeto libro este valor será falso según el enunciado del problema

    //Constructor

    public Libro(String isbn, String titulo, int anioPublicacion) {
        super(isbn, titulo, anioPublicacion);
        prestado = false;
    }

    //Implementamos los métodos que nos marca la interfaz Prestable

    @Override
    public void presta() {
        if (this.prestado) {
            System.out.println("Lo siento ese libro ya está prestado");
        } else {
            this.prestado = true;
        }
    }

    @Override
    public void devuelve() {
       this.prestado=false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado=true;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
        /*Me doy cuenta de  que en este to String hay una cosa nueva, cada vez que
        * es llamado, imprime el valor booleano que tiene la propiedad prestado para ese objeto*/
    }
}

package LibroJava.POO;
/*Aplicai�n de gesti�n t�pica - alta, baja, listado y modificaci�n -
de una colecci�n de discos.
Este tipo de programas seuele denominar CRUD (Create Read Update Delete).*/

public class DiscoCRUD {

    private String codigo = "Libre";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duraci�n total en minutos

    // Utilizamos el constructor por defecto


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() { // ToString con formato chulo
        String cadena="\n-----------------------------------";
        cadena+="\nC�digo "+this.codigo;
        cadena+="\nAutor "+this.autor;
        cadena+="\nT�tulo "+this.titulo;
        cadena+="\nG�nero "+this.genero;
        cadena+="\nDuraci�n "+this.duracion;
        cadena+="\n-----------------------------------";

        return cadena;

        //En cada llamada se declara una variable (cadena) que va sumando a su contenido
        // la informaci�n correspondiente al objeto con el que se ha invocado
        //este m�todo.
    }
}

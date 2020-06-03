package LibroJava.POO;
/*Aplicaión de gestión típica - alta, baja, listado y modificación -
de una colección de discos.
Este tipo de programas seuele denominar CRUD (Create Read Update Delete).*/

public class DiscoCRUD {

    private String codigo = "Libre";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos

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
        cadena+="\nCódigo "+this.codigo;
        cadena+="\nAutor "+this.autor;
        cadena+="\nTítulo "+this.titulo;
        cadena+="\nGénero "+this.genero;
        cadena+="\nDuración "+this.duracion;
        cadena+="\n-----------------------------------";

        return cadena;

        //En cada llamada se declara una variable (cadena) que va sumando a su contenido
        // la información correspondiente al objeto con el que se ha invocado
        //este método.
    }
}

package Ilerna_POO.Ilerna_Videotutorias.Mapas;

public class AlumnoMapas {

    private String nombre;
    private int edad;

    public AlumnoMapas(){

    }

    public AlumnoMapas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "AlumnoMapas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

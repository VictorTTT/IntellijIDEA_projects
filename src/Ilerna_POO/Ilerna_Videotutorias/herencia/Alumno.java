package Ilerna_POO.Ilerna_Videotutorias.herencia;

/*
ALumno <-- Persona <--Object
 */
public class Alumno extends Persona {
    private String modulo;

    public Alumno() {
        super();
        modulo = "M03B";
    }

    public Alumno(String nombre, int edad, String modulo) {
        super(nombre,edad);
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Alumno con nombre " + getNombre() + ", edad " + getEdad() + " y modulo " + modulo;
    }

    @Override
    public void hablar(String texto){
        System.out.printf("El alumno dice: "+texto);
    }


}

package Ilerna_Videotutorias.herencia;

public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();
        System.out.println(persona.toString());
        Alumno alumno = new Alumno();
        System.out.println(alumno.toString());
        alumno.hablar("El alumno está hablando");
    }
}

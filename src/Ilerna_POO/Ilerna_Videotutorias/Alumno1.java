package Ilerna_POO.Ilerna_Videotutorias;

public class Alumno1 extends Persona {

    private String modulo;

    public Alumno1(){
        super();

        modulo="m03b";
    }

    public Alumno1 (String nombre, int edad, String modulo){
        super(nombre, edad);


        this.modulo=modulo;



    }

    public String toString(){

        return "Alumno con nombre"+getNombre()+" , edad "+ getEdad()+", módulo"+ modulo;
    }

    public void hablar( String texto){

        System.out.println("Este es un método sobreescrito :"+texto);
    }





}

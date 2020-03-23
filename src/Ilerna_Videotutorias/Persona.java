package Ilerna_Videotutorias;

public class Persona {

    private String nombre;

    private int edad;

    public Persona (){

        nombre="Víctor";

        edad=5;
    }

    public Persona(String nombre, int edad){

        this.nombre=nombre;

        this.edad=edad;


    }
    @Override
    public String toString(){

        return  "Persona con nombre "+ nombre+", edad "+edad;

    }

    public void hablar (String texto){

        System.out.println("La persona dice: "+texto);

    }

    public void setNombre(String nombre){

        this.nombre=nombre;
    }

    public String getNombre(){

        return nombre;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}

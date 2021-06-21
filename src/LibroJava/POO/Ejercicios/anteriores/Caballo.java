package LibroJava.POO.Ejercicios;

/*Implementa la clase Caballo vista en un ejercicio anterior. Pru�bala creando
instancias y aplic�ndole algunos m�todos.*/

import org.w3c.dom.ls.LSOutput;

public class Caballo {

    //Atributos

    private String nombre;
    private String raza;
    private int edad;
    private String sonido;
    private double peso;
    private String colorPelaje;
    private Sexo sexo; public enum Sexo{ MACHO, HEMBRA} //Me creo un tipo de dato con sus posibles valores
    private Cola longitudCola; public enum  Cola{ LARGA, CORTA} //Me creo un tipo de dato con sus posibles valores

    public Caballo() { // Constructor por defecto
    }

    public Caballo(String nombre, String raza, int edad, String sonido, double peso, String colorPelaje, Sexo sexo, Cola longitudCola) {
        // Constructor con todos los par�metros
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sonido = sonido;
        this.peso = peso;
        this.colorPelaje = colorPelaje;
        this.sexo = sexo;
        this.longitudCola = longitudCola;
    }

    // M�todos Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Cola getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(Cola longitudCola) {
        this.longitudCola = longitudCola;
    }

    // M�todo para imprimir todos los datos de cada objeto

    @Override
    public String toString() {
        return "Caballo{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", sonido='" + sonido + '\'' +
                ", peso=" + peso +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", sexo=" + sexo +
                ", longitudCola=" + longitudCola +
                '}';
    }

    //Comportamientos propios de esta clase (M�todos desarrollados por m�)

    public void relinchar (){
        System.out.println("IIIIIhhhIIIIHHHiii");
    }

    public void aparearse(Caballo pareja){

        if (pareja.getSexo().equals(Sexo.MACHO)&&this.getSexo().equals(Sexo.MACHO)){

            System.out.println("Hola "+pareja.getNombre()+" Aqu� no hay nada que hacer, los dos tenemos 5 piernas...");

        }else if (pareja.getSexo().equals(Sexo.HEMBRA)&&this.getSexo().equals(Sexo.MACHO)){

            System.out.println("Hola "+pareja.getNombre()+ " Ap�yate en la vaya que te voy a contar una cosa ");

        }else if (pareja.getSexo().equals(Sexo.MACHO)&&this.getSexo().equals(Sexo.HEMBRA)){

            System.out.println("Hola "+pareja.getNombre()+ " Te estaba esperando, saca la herramienta de perforaci�n");
        }
        else if (pareja.getSexo().equals(Sexo.HEMBRA)&&this.getSexo().equals(Sexo.HEMBRA)){

            System.out.println("Hola "+pareja.getNombre()+ " Necesitamos a un semental para tener �xito");
        }

    }

    public double velocidadGalope(int edad){

        if (this.edad<2)return 40.7;
        else if (this.edad>2&&this.edad<8)return  59.9;
        else if(this.edad>=8)return 30.2;
        else return 1.2;
    }






}



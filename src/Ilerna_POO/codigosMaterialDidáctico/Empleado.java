package Ilerna_POO.codigosMaterialDidáctico;

import java.util.Date;

public class Empleado {  //clase contenida
    //atributos

    String dni;
    String nombre;
    double sueldo;
    Date fechaNac;

    //Constructores

    public Empleado(){

        this.dni="00000000I";
        this.nombre="Víctor Tena";
        this.sueldo=2500;
        this.fechaNac=new Date();

    }

    public Empleado (String d, String n, double s, Date fn){

        this.dni=d;
        this.nombre=n;
        this.sueldo=s;
        this.fechaNac=fn;
    }

    //Gets and sets


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    //Métodos programador

    public double horasExtra(double horas){
        double precioHora=11;
        double extras;
        extras=horas* precioHora;
        return extras;
    }

}

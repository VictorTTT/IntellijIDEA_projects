package poo_pildoras;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Pesona
{
    public static void main(String[] args)
    {
        Persona[] lasPersonas= new Persona[2];

        lasPersonas[0]=new Empleado2("Luis Conde",50000,2009, 2,25);

        lasPersonas[1]=new Alumno("Ana Lopez", "Biol\u00f3gicas");

        for (Persona e: lasPersonas)
        {
            System.out.println(e.dameNombre()+", "+ e.dameDescripcion());
        }
    }
}

abstract class Persona
{
    public Persona(String nom)
    {
        nombre = nom;
    }

    public String dameNombre()
    {
        return nombre;
    }

    public abstract String dameDescripcion();

    //Al declarar un método abstracto, hay que teneren cuenta que la clase a la que pertenece también lo debe ser
    //por otro lado, la sintaxis de estos métodos es sin llaves, ni código dentro de ellos, solo se declaran


    private String nombre;


}

class Empleado2 extends Persona
{
    public Empleado2(String nom, double sue, int agno, int mes, int dia) //Constructor que recibe parámetros
    {
        super(nom);//Llamamos al constructor de la clase padre



        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        //objeto calendario de la clase "GregorianCalendar"(consultar api) que utiliza su segunda forma constructora
        //en la que le pasamos 3 parámetros de tipo entero para determinar un fecha, hay que tener en cuenta que el mes hay que ponerlo en -1
        //porque empieza a contar desde 0 como en las matrices

        altaContrato = calendario.getTime();//Utilizamos el método get time de la calse GregorianCalendar que a su vez
        //es heredado de otra clase (Calendar),este método nos devuelve la fecha

        ++IdSiguiente;

        Id = IdSiguiente;
    }

    public String dameDescripcion()
    {
        return "Este empleado tiene un Id= " + " con un sueldo= " + sueldo;
    }

    public double dameSueldo()// función //método getter
    {
        return sueldo;    //el  valor de estas variables que nos devuelven los métodos ya lo hemos establecido en el constructor
    }

    public Date dameFechaContrato() // función //método getter
    {
        return altaContrato;//el  valor de estas variables que nos devuelven los métodos ya lo hemos establecido en el constructor
    }

    public void subeSueldo(double porcentaje) //procedimiento //método setter que va a establecer
    //el valor de la variable para la subida de sueldo será void porque no va a devolver nada
    {
        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;


    }


    private double sueldo;//variables de clase encapsuladas por medio de private

    private Date altaContrato;//variables de clase encapsuladas por medio de private

    private static int IdSiguiente;

    private int Id;

}

class Alumno extends Persona
{
    public Alumno(String nom, String car)
    {
        super(nom);

        carrera=car;
    }

    public String dameDescripcion()
    {
        return " Este alumno est\u00e1 estudiando la carrera de " + carrera;
    }

    private String carrera;



}

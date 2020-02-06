package poo_pildoras;

public class Pruebas
{
    public static void main(String[] args)
    {
        Empleados trabajador1=new Empleados("Paco ");

        Empleados trabajador2 =new Empleados("Anna ");

        Empleados trabajador3=new Empleados("Antonio ");

        Empleados trabajador4=new Empleados("Maria ");



        trabajador1.cambiaSeccion("RRHH");



        System.out.println(trabajador1.devuelveDatos());



        System.out.println(trabajador2.devuelveDatos());



        System.out.println(trabajador3.devuelveDatos());


        System.out.println((trabajador4.devuelveDatos()));


        System.out.println(Empleados.dameIdSiguiente());
        //al declarar este método como estático podemos comprobar
        //cómo a la hora de utilizarlo tenemos que poner la clase delante
        //esto es porque no actúa sobre objetos




    }
}

class Empleados
{
    public Empleados(String nom)
    {
        nombre=nom;

        seccion="Administracion ";

        Id=IdSiguiente;

        IdSiguiente++;



    }

    public void cambiaSeccion(String seccion)//procedimiento
    {
    this.seccion=seccion;
    }



    public String devuelveDatos()//funcion


    {
        return "el nombre es "+ nombre+"y la seccion es "+seccion+"y el Id es "+Id;
    }

    public static String dameIdSiguiente()//clase propia satática
    {
        return "El Id siguiente es: "+ IdSiguiente;
    }



private final  String nombre;//constante encapsulada

private String seccion;//

private int Id;//id como variable encapsulada

    private static int IdSiguiente=1;//añadimos static a esta variable para poder incrementar
    //el valor de Id sin saltarnos las normas de encapsulacion.La convertimos en campo  de clase
}

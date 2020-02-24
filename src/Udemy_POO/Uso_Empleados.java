package Udemy_POO;

public class Uso_Empleados
{
    public static void main(String[] args)//Ejemplo no mudulado
    {
        Empleados empleado1=new Empleados("Ana");

        Empleados empleado2=new Empleados("Antonio");

        Empleados empleado3=new Empleados("María");

        Empleados miEmpleadoalAzar=new Empleados("Jorge");

        System.out.println(empleado1.getDatosEmpleado());

        empleado1.setSeccion("RRHH");

        System.out.println(empleado1.getDatosEmpleado());

        System.out.println(empleado2.getDatosEmpleado());

        System.out.println(empleado3.getDatosEmpleado());

        System.out.println(miEmpleadoalAzar.getDatosEmpleado());

        System.out.println(Empleados.getIdSiguiente());


    }
}

class Empleados
{
    private final String nombre;//el nombre lo creamos como constante porque no cambiará

    private String seccion;

    private int Id;

    private static int IdSiguiente=1;//Ojo con esto, esto es una variable de clase (static), se diferencia en que internamente
    //no se crea un espacio de memoria con ella para cada objeto. Simplemente pertenece a la clase y no a los objetos.
    //Por este motivo, cada vez que un objeto o método quiera acceder a ella, deberá incluir el nombre de la clase antes
    //para hacerlo. Podemos observar que se le da valor fuera del constructor y dentro del ámbito de la clase.

    public Empleados(String nombre)
    {
        this.nombre=nombre;

        seccion="Administración";

        Id=IdSiguiente;

        IdSiguiente++;//Como Id siguiente pertenece a la clase, cada vez que creamos un objeto estamos aumentando
        // el campo Id siguiente en la clase no en los objetos





    }

    public void setSeccion(String seccion)
    {
        this.seccion = seccion;
    }

    public String getDatosEmpleado()
    {
        return "El empleado "+nombre+" pertenece a la sección de "+seccion+" y tiene el número "+Id;
    }

    public static String getIdSiguiente()//método que utilizamos para saber cuál será el siguiente Id, observamos que
            //como se va a utilizar un campo de clas estático, el método también lo es.
    {
        return "El Id siguiente será "+IdSiguiente;
    }


}

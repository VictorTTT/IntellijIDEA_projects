package pidoras_Udemy_POO;

import java.util.GregorianCalendar;

public class Uso_Empleados {
    public static void main(String[] args)//Ejemplo no mudulado
    {
        // Empleados Antonio = new Empleados("Antonio", 2300.5, 2005, 7, 15);

        // Jefes Ana = new Jefes("Ana", 2900, 2008, 8, ;

        // Ana.setIncentivo(300.5);

        // System.out.println(Ana.getSueldo());

        Jefes Juan = new Jefes("Juan", 8000, 2013, 8, 5);

        Juan.setIncentivo(200);

        Empleados[] losEmpleados = new Empleados[6];

        losEmpleados[0] = new Empleados("Antonio", 2300.5, 2005, 7, 5);
        losEmpleados[1] = new Empleados("Carlos", 5000, 2007, 6, 5);
        losEmpleados[2] = new Empleados("Maria", 2500, 2006, 11, 7);
        losEmpleados[3] = new Empleados("Ana", 7000, 2009, 5, 3);
        losEmpleados[4] = Juan; // Ejemplo del principio de sustitución. Juan es un objetode tipo jefe, sin embargo está
        // en un array de tipo empleados. Esto es posible porque la clase jefes hereda de la clase empleados.
        /*Empleados Patricia= new Jefes("Patricia",2500,2007,5,6);
        Jefes PatriciaSecertaria=  (Jefes)Patricia; // Casting explícito*/
        losEmpleados[5] = new Jefes("Isabel", 8000,2007,4,2);
        Jefes Isabel=(Jefes)losEmpleados[5]; // Down casting de objetos
        Isabel.setIncentivo(500);


        for (Empleados obj : losEmpleados) {

            System.out.println(obj.getDatosEmpleado() + " y un salario de " + obj.getSueldo() + " €");

        }


    }
}

class Empleados {
    private final String nombre;//el nombre lo creamos como constante porque no cambiará

    private double sueldo;

    GregorianCalendar calendario;

    private int Id;

    private static int IdSiguiente = 1;//Ojo con esto, esto es una variable de clase (static), se diferencia en que internamente
    //no se crea un espacio de memoria con ella para cada objeto. Simplemente pertenece a la clase y no a los objetos.
    //Por este motivo, cada vez que un objeto o método quiera acceder a ella, deberá incluir el nombre de la clase antes
    //para hacerlo. Podemos observar que se le da valor fuera del constructor y dentro del ámbito de la clase.

    public Empleados(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;

        sueldo = sue;

        calendario = new GregorianCalendar(agno, mes, dia);

        Id = IdSiguiente;

        IdSiguiente++;//Como Id siguiente pertenece a la clase, cada vez que creamos un objeto estamos aumentando
        // el campo Id siguiente en la clase no en los objetos


    }


    public String getDatosEmpleado()//getter  devuelve datos del empleado pero no todos, los demás podemos mostrarlos con métodos independientes
    {
        return "El empleado " + nombre + " y tiene el número " + Id;
    }

    public double getSueldo()//getter devuelve sueldo
    {
        return sueldo;
    }

    public GregorianCalendar getFechaAlta()//getter que devuelve objeto de clase
    {
        return calendario;
    }

    public void setSubesueldo(double porcentaje)//setter que modifica el sueldo aumentándolo un determinado pocentaje
    {
        double aumento = sueldo * porcentaje / 100;//forma y manera de hallar la cantidad que se le va a subir

        sueldo += aumento;//se le suma la cantidad a la que ya cobraba, esta instrucción es lo mismo que decir
        //sueldo es igual a sueldo más aumento.
    }

    public static String getIdSiguiente()//método que utilizamos para saber cuál será el siguiente Id, observamos que
    //como se va a utilizar un campo de clas estático, el método también lo es.
    {
        return "El Id siguiente será " + IdSiguiente;
    }


}

 class Jefes extends Empleados//jefes hereda de empleados
{

    public Jefes(String nom, double sue, int agno, int mes, int dia)//al heredar tenemos que incluir el constructor de la clase padre
    {
        super(nom, sue, agno, mes, dia);//dentro del cuerpo del constructor heredado ponemos los
        // la palabra super para que llame al constructor de la clase padre y a continuación los parámetros que necesita
        //la clase padre
    }


    private double incentivo;//atributo//propiedad exclusivo/a para los jefes

    //Esta clase jefes, hereda todos los métodos (comportamientos) de la clase empleados pero
    //va a tener unos métodos (comportamientos) propios que solo los objetos de este tipo podrán disponer


    public void setIncentivo(double b)//método setter que establece el incentivo
    {
        incentivo = b;
    }

    public double getSueldo()//método getter que devuelve el sueldo más el incentivo, aquí vemos algo nuevo. Podemos observar
    // que este método se llama igual que uno de la clase empleados. Cuando ocurre esto estamos ante una sobreescritura de métodos
    // que invalida el método de la clase padre para utilizar el método que sobreescribe. Para complicarlo un poco más,
    //dentro del cuerpo del método queremos llamar al método de la clase padre y utiliarlo, pero si lo hacemos, como tiene el mismo
    //nombre estamos haciendo una llamada recursiva. Esto se soluciona poniendo la palbra super antes de la llamda al
    //método padre,es así como salimos de la recursividad y gastamos el método de empleados.
    {
        double sueldoJefe = super.getSueldo();//Almacenamos el sueldo del jefe en la variable

        return sueldoJefe + incentivo;//Devovlvemos la variable más el incentivo
    }


}




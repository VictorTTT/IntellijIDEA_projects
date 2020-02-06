package poo_pildoras;

import java.util.*;

public class Uso_Empleado1archivoClasesPropiasYPredefinidas
        //en este ejemplo utilizamos un único fichero fuente que contiene todas las calases que forman el programa
{

    public static void main(String[] args)
    {


        Jefatura jefe_RRHH = new Jefatura("Miguel Soriano ", 55000, 1995, 3, 30);

        jefe_RRHH.estableceIncentivo(2570.50);


        Empleado[] misEmpleados = new Empleado[6];//es lo mismo que hacer String miarray=new String[3]

        misEmpleados[0] = new Empleado("Ana ", 30000, 20000, 7, 7);

        misEmpleados[1] = new Empleado("Carlos ", 5000, 1995, 6, 15);

        misEmpleados[2] = new Empleado("Paco ", 2500, 2005, 9, 25);

        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);


        misEmpleados[4] = jefe_RRHH;//Polimorfismo en acción. Principio de sustitució
        //utilizamos un objeto de la subclase (Jefatura) cuando el programa espera a uno de la clase(polimorfismo)

        misEmpleados[5] = new Jefatura("Maria ", 95000, 1999, 5, 26);
        //en el array mis empleados podemos almacenar tanto objetos de la clase Empleado
        //como de la subclase Jefatura, es el caso de jefe_RRHH que es una nueva instancia que hemos creado
        //y también lo es el objeto que creamos con el constructor Jefatura en la linea 55 del código

        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
        //esto es un casting para convertir un objeto de un tipo en objeto de otro tipo

        jefa_Finanzas.estableceIncentivo(55000);

       /* Empleado director_comercial=new Jefatura("Sandra",8500,2012,5,5);//principio de sustitución,
        //declaramos un objeto Jefatura a través de la clase Empleado graciaas a la herencia de Jefatura por Empleado

        Comparable ejemplo=new Empleado("Elisabeth ",95000,2011,6,7);//Aquí estamos creando un obeto empleadod esde la interfaz comparable
        // esto solo es posible hacerlo de esta manera, con el prinipio de sustitución. Si intentáramos hacerlo directamente desde la interfaz
        //nos daría error.

        if (director_comercial instanceof Empleado)//Utilizamos un if para saber si director_comercial pertenece a Empleado por medio de intanceof
        {//¿director_comercial es una instancia de Empleado?

            System.out.println("Es de tipo Jefatura");//en caso afirmativo, imprimirá en consola que es de Jefatura,
            // gracias a que director_comercial pertenece Jefatura que a su vez  hereda de Empleado

            if (ejemplo instanceof Comparable)//¿ejemplo es una instancia de Comparable?,
                // Sí que lo es porque aunque no la hemos instanciado dentro de la interfaz, si lo hemos hecho a través del principio de sustitución
            {
                System.out.println("Implementa la interfaz Comparable");
            }
        }*/

        Arrays.sort(misEmpleados);

        System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));


        jefa_Finanzas.establece_bonus(500);

        System.out.println("EL jefe " + jefa_Finanzas.dameNombre() + " Tiene un bonus de " + jefa_Finanzas.establece_bonus(500));


        for (Empleado e : misEmpleados)//for each creamos dentro de él una vaiable de tipo Empledo e: misEmpleados
        {
            e.subeSueldo(5);
        }


        for (Empleado e : misEmpleados)
        {
            System.out.println("Nombre: " + e.dameNombre()
                    + "Sueldo: " + e.dameSueldo() + "Fecha de Alta " + e.dameFechaContrato());
        }


    }


}

class Empleado implements Comparable, Trabajadores//Empleado implementa la interfaz Comparable
        //interfaz predefinida que nos obliga a implementar el método abstracto comparaTo(T)
{


    public Empleado(String nom, double sue, int agno, int mes, int dia) //Constructor que recibe parámetros
    {
        nombre = nom;//Decimos que la variable nombre tiene que ser igual alparámetro que le pasamos a través del constructor

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

    public double establece_bonus(double gratificacion)
    {
        return Trabajadores.bonus_base + gratificacion;
    }

    public Empleado(String nom)//sobrecarga de método constructor, que se diferenecia delanterior en el número de argumentos
    {
        this(nom, 30000, 2000, 1, 1);
        //cuando utilizamos un this dentro de un metodo constructor sobrecargado,
        //lo que hace es llamar al otro constructor de la clase que se llama igual y que tiene los mismos parámetros
        //que estamos indicando
    }

    //en esta ocasión colocamos las variables al final de la clase para comprobar que
    //aun haciendolo así nno afecta al resultado

    public String dameNombre() // función //método getter
    {
        return nombre + "Id: " + "  " + Id;    //el  valor de estas variables que nos devuelven los métodos ya lo hemos establecido en el constructor
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


    public int compareTo(Object miObjeto)
    {
        Empleado otroEmpleado = (Empleado) miObjeto;

        if (this.Id < otroEmpleado.Id)
        {
            return -1;
        }

        if (this.Id > otroEmpleado.Id)
        {
            return 1;
        }

        return 0;

    }

    private String nombre;//variables de clase encapsuladas por medio de private

    private double sueldo;//variables de clase encapsuladas por medio de private

    private Date altaContrato;//variables de clase encapsuladas por medio de private

    private static int IdSiguiente;

    private int Id;


}

class Jefatura extends Empleado implements Jefes //Jefatura hereda de Empleado y también lo hace de la interfaz Jefes//una vez creamos la clase que hereda de la otra, tenemos que crear
        //un nuevo constructor, de lo contrario el programa buscará al constructor de la clase que hereda o a uno por
        // defecto y de no encontrarlos, nos marcará error.
        // la herencia múltiple solo es posible a travès de interfaces, si intentamos hacerlo solamente con clases Java nos da error
{

    public String tomar_decisiones(String decision)//método obligado porque proviene de la interfaz
    {
        return "UN miembro de la dirección ha tomado la decisión de : " + decision;
    }

    public double establece_bonus(double grtificacion)
    {
        double prima = 2000;

        return Trabajadores.bonus_base + grtificacion + prima;


    }


    public Jefatura(String nom, double sue, int agno, int mes, int dia)
    {
        super(nom, sue, agno, mes, dia);
    }


    public void estableceIncentivo(double b)//setter
    {
        incentivo = b;

    }


    public double dameSuledo()
    {
        double sueldoJefe = super.dameSueldo();//ponemos super para decir que no llame a
        //dame sueldo de la clase Jefatura sino que lo haga al de la clase empleado

        return sueldoJefe + incentivo;
    }


    private double incentivo;


}

class Director extends Jefatura//Director hereda de Jefatura
{



    public Director(String nom, double sue, int agno, int mes, int dia)
    {
        super(nom, sue, agno, mes, dia);


    }


}



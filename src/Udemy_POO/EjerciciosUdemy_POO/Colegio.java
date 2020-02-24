package Udemy_POO.EjerciciosUdemy_POO;


public class Colegio
{
    //Atributos

    private String nombre;//un colegio tiene nombre

    private Alumno[] arrayAlumnos;//un colegio tiene alumnos, que los almacenaremos en un array

    private int posicionArray = 0;//cada alumno que ocupará una posición en el array


    public Colegio(String nombre, int numAlumnos)//constructor, cada vez que lo llamemos, creará un objeto de tipo colegio
    //le dará un nombre y le asignará un array a ese colegio con el número de alumnos que lo puedan integrar(máximo)
    {
        this.nombre = nombre;

        arrayAlumnos = new Alumno[numAlumnos];


    }

    public String getNombreColegio()
    {
        return nombre;
    }

    private Alumno getAlumno(int Id)
    {
        return arrayAlumnos[Id];
    }

    public void nuevoAlumno(String nombreAlumno, double notaAlumno)//setter para crear alumnos
    {
        Alumno nuevoAlumno = new Alumno(this, nombreAlumno, notaAlumno);
        //Comprobamos cómo utiliza el this para referirse al objeto de la clase Colegio
        //cada vez que se llama a este método, creamos un objeto Alumno
        // llamamos al constructor de la clase alumno, pasándole sus parámetros correspondientes
        arrayAlumnos[posicionArray] = nuevoAlumno;
        //El objeto resultante lo almacenamos en una posición del el array del colegio
        posicionArray++;
        //Incrementamos la posición del array para el próximo alumno que instanciemos

        //Repasando, podemos ver que este método hace 2 cosas, crear alumnos desde la clase Colegio a través del constructor
        //alumno que se activa cada vez que el método que lo contiene es llamado.

        //Una vez hecho esto, el resultado es almacenado en un array perteneciente al la clase Colegio

    }

    public void expulsaAlumno(String nombreAlumno)//método setter para explsar alumno\borrar objeto ;)
    {
        for (int i = 0; i < arrayAlumnos.length; i++)//bucle for para recorrer toddo el aray dónde están los alumnos
        {
            if (this.getAlumno(i) != null)//si la posición i del array alumnos no está vacía...
            {
                if (arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno))//
                //si el nombre coincide con el que se ha introducido ignorando mayusclas/minusculas
                {
                    arrayAlumnos[i] = null;//borra
                }
            }

        }

    }

    public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia)

    {

        for (int i = 0; i < arrayAlumnos.length; i++)
        {
            if (this.getAlumno(i) != null)
            {
                if (arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno))
                {
                    arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
                }
            }

        }

    }

    public void getTodosAlumnos()
    {
        for (int i = 0; i < arrayAlumnos.length; i++)
        {
            if (this.getAlumno(i) != null)
            {
                System.out.println(this.getAlumno(i));
                System.out.println();
            }

        }
    }

    public void getDatosAlumno(String nombreAlumno)
    {
        for (int i = 0; i < arrayAlumnos.length; i++)
        {
            if (this.getAlumno(i) != null)
            {
                if (arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno))
                {
                    System.out.println(this.getAlumno(i));
                    System.out.println();
                }
            }
        }
    }


}



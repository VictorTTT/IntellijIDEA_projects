package Udemy_POO.EjerciciosUdemy_POO;


public class Colegio
{
    //Atributos

    private String nombre;//un colegio tiene nombre

    private Alumno[] arrayAlumnos;//un colegio tiene alumnos, los almacenaremos en un array de objetos de la clase Alumno

    private int posicionArray = 0;//cada alumno que ocupará una posición en el array


    public Colegio(String nombre, int numAlumnos)//constructor, cada vez que lo llamemos, creará un objeto de tipo colegio
    //le dará un nombre y le asignará un array a ese colegio con el número de alumnos que lo puedan integrar(máximo)
    {
        this.nombre = nombre;//El parámetro nombre, se almacenará en el campo de clase this.nombre

        arrayAlumnos = new Alumno[numAlumnos];//Aquí inicializamos el array de objetos de la clase alumno y cada vez que
        //el constructor sea llamdo, el parámetro numAlumnos, determinará el tamaño del array.


    }

    public String getNombreColegio()//métod getter que devuelve el nombre del colegio
    {
        return nombre;//si hacemos un click encima de del campo de clase nombre se iluminan a los que hacer referencia
    }

    private Alumno getAlumno(int Id)//Esta función getter es privada y el tipo que devuelve es un objeto de la clase Alumno,que sea privada quiere decir que no es accesible desde el
    // exterior de la clase (Colegio) en la que es declarada. Este tipo de funciones privadas solo se necesitan dentro de la clase(Colegio).
    //Recibe el parámetro Id que es un atributo que identifica a cada Alumno, no fijamos bien en que estamos dentro de la
    //clase colegio y podemos hacerlo sin problemas.
    {
        return arrayAlumnos[Id];//Devuelve una posición concreta del array, es decir, el nombre de un alumno.
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

    public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia)//Método setter que reestablece la nota media de un determinado alumno
    //Recibe un nombre y una nota media, que será la nueva.
    {

        for (int i = 0; i < arrayAlumnos.length; i++) //for que recorre toddo el array de alumnos
        {
            if (this.getAlumno(i) != null)//a cada vuelta de bucle, llama al método get alumno y evalúa si la posición en la que está está vacía
            {//si no está vacía cumple condición y entra en el bucle
                if (arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno))//si en una  posición del array llamamos al método
                    //getNombreAlumno (que es de la clase Almno y podemos acceder a el porque es public) y su nombre es igual al introducido por parámetro...
                {
                    arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);//Cumple condición y para esa posición del array
                    // le cambia la nota media por la que hemos introducido por parámetro
                }
            }

        }

    }

    public void getTodosAlumnos()//método setter que devuelve la totalidad de los alumnos que hayen todos los colegios
    {
        for (int i = 0; i < arrayAlumnos.length; i++)
        {
            if (this.getAlumno(i) != null)//si la posición no está vacía...
            {
                System.out.println(this.getAlumno(i));//imprime lo que devuelve el método get alumno
                System.out.println();//salto de línea
            }

        }
    }

    public void getDatosAlumno(String nombreAlumno)//método set que imprime por pantalla la info de un determinado alumno
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



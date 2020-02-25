package Udemy_POO.EjerciciosUdemy_POO;


public class Colegio
{
    //Atributos

    private String nombre;//un colegio tiene nombre

    private Alumno[] arrayAlumnos;//un colegio tiene alumnos, los almacenaremos en un array de objetos de la clase Alumno

    private int posicionArray = 0;//cada alumno que ocupar� una posici�n en el array


    public Colegio(String nombre, int numAlumnos)//constructor, cada vez que lo llamemos, crear� un objeto de tipo colegio
    //le dar� un nombre y le asignar� un array a ese colegio con el n�mero de alumnos que lo puedan integrar(m�ximo)
    {
        this.nombre = nombre;//El par�metro nombre, se almacenar� en el campo de clase this.nombre

        arrayAlumnos = new Alumno[numAlumnos];//Aqu� inicializamos el array de objetos de la clase alumno y cada vez que
        //el constructor sea llamdo, el par�metro numAlumnos, determinar� el tama�o del array.


    }

    public String getNombreColegio()//m�tod getter que devuelve el nombre del colegio
    {
        return nombre;//si hacemos un click encima de del campo de clase nombre se iluminan a los que hacer referencia
    }

    private Alumno getAlumno(int Id)//Esta funci�n getter es privada y el tipo que devuelve es un objeto de la clase Alumno,que sea privada quiere decir que no es accesible desde el
    // exterior de la clase (Colegio) en la que es declarada. Este tipo de funciones privadas solo se necesitan dentro de la clase(Colegio).
    //Recibe el par�metro Id que es un atributo que identifica a cada Alumno, no fijamos bien en que estamos dentro de la
    //clase colegio y podemos hacerlo sin problemas.
    {
        return arrayAlumnos[Id];//Devuelve una posici�n concreta del array, es decir, el nombre de un alumno.
    }

    public void nuevoAlumno(String nombreAlumno, double notaAlumno)//setter para crear alumnos
    {
        Alumno nuevoAlumno = new Alumno(this, nombreAlumno, notaAlumno);
        //Comprobamos c�mo utiliza el this para referirse al objeto de la clase Colegio
        //cada vez que se llama a este m�todo, creamos un objeto Alumno
        // llamamos al constructor de la clase alumno, pas�ndole sus par�metros correspondientes
        arrayAlumnos[posicionArray] = nuevoAlumno;
        //El objeto resultante lo almacenamos en una posici�n del el array del colegio
        posicionArray++;
        //Incrementamos la posici�n del array para el pr�ximo alumno que instanciemos

        //Repasando, podemos ver que este m�todo hace 2 cosas, crear alumnos desde la clase Colegio a trav�s del constructor
        //alumno que se activa cada vez que el m�todo que lo contiene es llamado.

        //Una vez hecho esto, el resultado es almacenado en un array perteneciente al la clase Colegio

    }

    public void expulsaAlumno(String nombreAlumno)//m�todo setter para explsar alumno\borrar objeto ;)
    {
        for (int i = 0; i < arrayAlumnos.length; i++)//bucle for para recorrer toddo el aray d�nde est�n los alumnos
        {
            if (this.getAlumno(i) != null)//si la posici�n i del array alumnos no est� vac�a...
            {
                if (arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno))//
                //si el nombre coincide con el que se ha introducido ignorando mayusclas/minusculas
                {
                    arrayAlumnos[i] = null;//borra
                }
            }

        }

    }

    public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia)//M�todo setter que reestablece la nota media de un determinado alumno
    //Recibe un nombre y una nota media, que ser� la nueva.
    {

        for (int i = 0; i < arrayAlumnos.length; i++) //for que recorre toddo el array de alumnos
        {
            if (this.getAlumno(i) != null)//a cada vuelta de bucle, llama al m�todo get alumno y eval�a si la posici�n en la que est� est� vac�a
            {//si no est� vac�a cumple condici�n y entra en el bucle
                if (arrayAlumnos[i].getNombreAlumno().equalsIgnoreCase(nombreAlumno))//si en una  posici�n del array llamamos al m�todo
                    //getNombreAlumno (que es de la clase Almno y podemos acceder a el porque es public) y su nombre es igual al introducido por par�metro...
                {
                    arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);//Cumple condici�n y para esa posici�n del array
                    // le cambia la nota media por la que hemos introducido por par�metro
                }
            }

        }

    }

    public void getTodosAlumnos()//m�todo setter que devuelve la totalidad de los alumnos que hayen todos los colegios
    {
        for (int i = 0; i < arrayAlumnos.length; i++)
        {
            if (this.getAlumno(i) != null)//si la posici�n no est� vac�a...
            {
                System.out.println(this.getAlumno(i));//imprime lo que devuelve el m�todo get alumno
                System.out.println();//salto de l�nea
            }

        }
    }

    public void getDatosAlumno(String nombreAlumno)//m�todo set que imprime por pantalla la info de un determinado alumno
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



package Udemy_POO.EjerciciosUdemy_POO;

public class Colegio
{
    //Atributos

    private String nombre;//un colegio tiene nombre

    private Alumno arrayAlumnos[];//un colegio tiene alumnos, que los almacenaremos en un array

    private int posicionArray;//cada alumno que ocupar� una posici�n en el array


    public Colegio(String nombre, int numAlumnos)//constructor, cada vez que lo llamemos, crear� un objeto de tipo colegio
    //le dar� un nombre y le asignar� un array a ese colegio con el n�mero de alumnos que lo puedan integrar(m�ximo)
    {
        this.nombre=nombre;

        arrayAlumnos=new Alumno[numAlumnos];



    }

}



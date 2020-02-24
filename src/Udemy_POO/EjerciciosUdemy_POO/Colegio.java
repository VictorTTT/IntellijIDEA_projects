package Udemy_POO.EjerciciosUdemy_POO;

public class Colegio
{
    //Atributos

    private String nombre;//un colegio tiene nombre

    private Alumno arrayAlumnos[];//un colegio tiene alumnos, que los almacenaremos en un array

    private int posicionArray;//cada alumno que ocupará una posición en el array


    public Colegio(String nombre, int numAlumnos)//constructor, cada vez que lo llamemos, creará un objeto de tipo colegio
    //le dará un nombre y le asignará un array a ese colegio con el número de alumnos que lo puedan integrar(máximo)
    {
        this.nombre=nombre;

        arrayAlumnos=new Alumno[numAlumnos];



    }

}



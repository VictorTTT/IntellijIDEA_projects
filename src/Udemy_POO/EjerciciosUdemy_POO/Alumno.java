package Udemy_POO.EjerciciosUdemy_POO;

public class Alumno
{

    private Colegio nombreColegio;//declaramos como atributo una instancia de la clase Colegio

    private String nombreAlumno;//un alumno tiene nombre

    private double notaMedia;//un alumno tiene nota media

    private int Id;//un alumno tiene un número de alumno

    private static int IdSiguiente = 1;//declaramos el número de alumno static para que pertenezca a la clase únicamente.

    public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia)
    {
        this.nombreColegio = nombreColegio;

        this.nombreAlumno = nombreAlumno;

        this.notaMedia = notaMedia;

        Id = IdSiguiente;

        IdSiguiente++;


    }


}

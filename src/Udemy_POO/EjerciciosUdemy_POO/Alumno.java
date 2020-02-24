package Udemy_POO.EjerciciosUdemy_POO;

public class Alumno
{      //Atributos

    private  Colegio nombreColegio;//declaramos como atributo una instancia de la clase Colegio

    private String nombreAlumno;//un alumno tiene nombre

    private double notaMedia;//un alumno tiene nota media

    private int Id;//un alumno tiene un número de alumno

    private static int IdSiguiente = 1;//declaramos el número de alumno static para que pertenezca a la clase únicamente.

    public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia)//constructor, cada vez que sea llamado para
            //la construcción de un objeto le dará los parámetros que tiente en su cuerpo del método
    {
        this.nombreColegio = nombreColegio;

        this.nombreAlumno = nombreAlumno;

        this.notaMedia = notaMedia;

        Id = IdSiguiente;

        IdSiguiente++;


    }

    public void setNotaMedia(double notaMedia)
    {
        this.notaMedia = notaMedia;
    }


    public String toString()
    {
        return "Nombre alumno: "+nombreAlumno+"\nColegio: "+this.getNombreColegioAlumno()+
                "\nNº Alumno: "+Id+"\nNota media: "+ notaMedia;
    }

    private String getNombreColegioAlumno()
    {
        return this.nombreColegio.getNombreColegio();
    }

    public String getNombreAlumno()
    {
        return nombreAlumno;
    }













}

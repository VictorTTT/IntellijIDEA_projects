package Udemy_POO.EjerciciosUdemy_POO;

public class Alumno
{      //Atributos

    private  Colegio nombreColegio;//declaramos como atributo una instancia de la clase Colegio

    private String nombreAlumno;//un alumno tiene nombre

    private double notaMedia;//un alumno tiene nota media

    private int Id;//un alumno tiene un n�mero de alumno

    private static int IdSiguiente = 1;//declaramos el n�mero de alumno static para que pertenezca a la clase �nicamente.

    public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia)//constructor, cada vez que sea llamado para
            //la construcci�n de un objeto le dar� los par�metros que tiente en su cuerpo del m�todo
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
                "\nN� Alumno: "+Id+"\nNota media: "+ notaMedia;
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

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

    public void setNotaMedia(double notaMedia)//establece nota media
    {
        this.notaMedia = notaMedia;
    }


    public String toString()//muy interesante lo que hace este m�todo: como lo que vamos a almacenar en el array est� compuesto por varios tipos de datos
            //con este m�todo lo pasamos odo a string y as� se puede guardar toda esta informaci�n en una sola posici�n del array
    {
        return "Nombre alumno: "+nombreAlumno+"\nColegio: "+this.getNombreColegioAlumno()+
                "\nN� Alumno: "+Id+"\nNota media: "+ notaMedia;
    }

    private String getNombreColegioAlumno()//private solo para esta clase
    {
        return this.nombreColegio.getNombreColegio();
    }

    public String getNombreAlumno()//devuelve el nombre del almuno
    {
        return nombreAlumno;
    }













}

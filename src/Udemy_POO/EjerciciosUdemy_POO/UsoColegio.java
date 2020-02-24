package Udemy_POO.EjerciciosUdemy_POO;

public class UsoColegio
{
    public static void main(String[] args)
    {
        Colegio SanJavier=new Colegio("San Javier",200);

        Colegio Cervantes=new Colegio("Cervantes",300);

        SanJavier.nuevoAlumno("Juan",8.5);

        SanJavier.nuevoAlumno("Sara",9);

        SanJavier.getTodosAlumnos();

        Cervantes.nuevoAlumno("Ana",5);

        Cervantes.nuevoAlumno("Antonio",7);

        Cervantes.nuevoAlumno("Maria",3);

        Cervantes.expulsaAlumno("Antonio");

        Cervantes.setNotaMedia("maria",8);

        Cervantes.getTodosAlumnos();


    }
}

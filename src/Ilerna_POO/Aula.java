package Ilerna_POO;

//Clase Aula donde utilizaremos lo objetos alumnos y los métodos que hemos generado
public class Aula
{
    public static void main(String[] args)
    {
        double note[]= new double[2];//declaración de array de tipo double que almacena dos notas
                                     //el operador new reserva un nuevo ;) espacio en la memoria
        
        //Creación de objetos Alumno
        
        Alumnos Alumno_1=new Alumnos("Victor Tena Palomares","DAW");
        
        Alumnos Alumno_2=new Alumnos("Enzo Tena Masip","DAM");
        
        //Sintaxis de la utilización de los métodos del objeto
        
        note[0]=Alumno_1.evaluar(6.5);
        
        note[1]=Alumno_2.evaluar(8);
    }
}

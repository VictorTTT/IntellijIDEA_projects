package Ilerna_POO.codigosMaterialDid�ctico;

//Clase Aula donde utilizaremos lo objetos alumnos y los m�todos que hemos generado
public class Aula
{
    public static void main(String[] args)  {
        double[] note = new double[2];//declaraci�n de array de tipo double que almacena dos notas
                                     //el operador new reserva un nuevo ;) espacio en la memoria
        
        //Creaci�n de objetos Alumno
        
        Alumnos Alumno_1=new Alumnos("Victor Tena Palomares","DAW");
        
        Alumnos Alumno_2=new Alumnos("Enzo Tena Masip","DAM");
        
        //Sintaxis de la utilizaci�n de los m�todos del objeto
        
        note[0]=Alumno_1.evaluar(6.5);
        
        note[1]=Alumno_2.evaluar(8);

        //Impresi�n de los atributos del alumno

        System.out.println("Nombre: "+ Alumno_1.getName()+
                            "Curso "+ Alumno_1.getCourse()+
                            " Nota: "+ note[0]);

        System.out.println("Nombre: "+ Alumno_2.getName()+
                            "Curso "+ Alumno_2.getCourse()+
                             " Nota: "+ note[1]);


    }
}

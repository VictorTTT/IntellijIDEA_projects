package LibroJava.Programacion_estructurada;

//Realiza un programa que calcule la nota que hace falta sacar en el segundo
//examen de la asignatura Programación para obtener la media deseada. Hay
//que tener en cuenta que la nota del primer examen cuenta el 40% y la del
//segundo examen un 60%.
//Ejemplo 1:
//Introduce la nota del primer examen: 7
//¿Qué nota quieres sacar en el trimestre? 8.5
//Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
//Ejemplo 2:
//Introduce la nota del primer examen: 8
//¿Qué nota quieres sacar en el trimestre? 7
//Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.

import java.util.Scanner;

public class EntradaDatosEjercicio8_NotaMedia
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a calcular la nota que tienes que sacar en el segundo examen para conseguir la nota deseada en el trimestre.\n" +
                "Recuerda que el primer examen es un 40% de la nota y el segundo es un 60% ");
        
        detenerConsola();//método de propia creación para detener consola en Java
        
        System.out.println("Introduce la nota del primer examen\n");
        
        Scanner entrada = new Scanner(System.in);
        
        double notaPrimero = entrada.nextDouble();
        
        notaPrimero = (notaPrimero * 4 / 10);
        
        System.out.println("el primer examen cuenta un " + notaPrimero + " sobre 10 ");
        
        System.out.println("¿Qué nota quieres sacar en el trimestre?\n");
        
        double notaTrimestre = entrada.nextDouble();
        
        double notaSegundo = notaTrimestre - notaPrimero;
        
        System.out.println(" Para sacar un " + notaTrimestre + " en el trimestre lo que tienes que sacar en el segundo examen es un : " + notaSegundo * 10 / 6);
        
        
    }
    
    public static void detenerConsola()//método para detener consola en Java
    {
        Scanner entrada = new Scanner(System.in);//creamos un objeto de la clase Scanner
        String cadenaVacia = "";//creamos una cadena vacía
        do
        {
            cadenaVacia = entrada.nextLine();//
            
        }
        while (!cadenaVacia.equals(""));
        
        //Este método lo que hace es esperar a que se introduzca algo por consola, ese algo que se introduce no es reflejado
        //pero se detiene el programa hasta pulsar enter. Cuando lo pulsamos el programa continúa
        
        
    }
}

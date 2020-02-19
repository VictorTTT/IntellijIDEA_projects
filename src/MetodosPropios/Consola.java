package MetodosPropios;

import java.util.Scanner;

public class Consola
{
    public static void detenerConsola()//método para detener consola en Java
    {
        System.out.println("\nPresiona enter para continuar");
        
        Scanner entrada = new Scanner(System.in);//creamos un objeto de la clase Scanner
        String cadenaVacia;//creamos una cadena vacía
        do
        {
            cadenaVacia = entrada.nextLine();//
            
        }
        while (!cadenaVacia.equals(""));
        
        //Este método lo que hace es esperar a que se introduzca algo por consola, ese algo que se introduce no es reflejado
        //pero se detiene el programa hasta pulsar enter. Cuando lo pulsamos el programa continúa
        
        
    }
    
    public static void limpiarConsola()
    {
    
    }
}

package LibroJava.Programacion_estructurada;

//Muestra los n�meros m�ltiplos de 5 de 0 a 100 utilizando un bucle while.

import VictorTTT_Metodos.Consola;

public class BuclesEjercicio2_While
{
    public static void main(String[] args)
    {
        System.out.println("Este programa muestra lo n�meros que son m�ltiplos de 5 desde el 0 hasta el 100");
        
        Consola.detenerConsola();
        
        int n = 0;
        
        while (n <= 100)
        {
            
            n++;
            
            if (n % 5 == 0)
            {
                System.out.println(n + " es m�ltiplo de 5");
            }
        }
        
        
    }
}

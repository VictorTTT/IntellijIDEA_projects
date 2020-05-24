package LibroJava.Programacion_estructurada;

//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.

import VictorTTT_Metodos.Consola;

public class BuclesEjercicio2_While
{
    public static void main(String[] args)
    {
        System.out.println("Este programa muestra lo números que son múltiplos de 5 desde el 0 hasta el 100");
        
        Consola.detenerConsola();
        
        int n = 0;
        
        while (n <= 100)
        {
            
            n++;
            
            if (n % 5 == 0)
            {
                System.out.println(n + " es múltiplo de 5");
            }
        }
        
        
    }
}

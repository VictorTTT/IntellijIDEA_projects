package LibroJava.Programacion_estructurada;

//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.

import VictorTTT_Metodos.*;

public class BuclesEjercicio1_For
{
    public static void main(String[] args)
    {
        System.out.println("Este programa muestra lo números que son múltiplos de 5 desde el 0 hasta el 100");
        
        
        Consola.detenerConsola();//invocamos al método propio indicando el paquete antes de la clase
        //y como es estático ponemos la clase en la que está,un punto y el nombre del método
        
        for (int i = 1; i <= 100; i++)
        {
            if (i % 5 == 0)
            {
                System.out.printf(" %d es múltiplo de 5 \n", i);
            }
        }
        
        
    }
}

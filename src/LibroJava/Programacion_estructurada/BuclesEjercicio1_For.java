package LibroJava.Programacion_estructurada;

//Muestra los n�meros m�ltiplos de 5 de 0 a 100 utilizando un bucle for.

import VictorTTT_Metodos.*;

public class BuclesEjercicio1_For
{
    public static void main(String[] args)
    {
        System.out.println("Este programa muestra lo n�meros que son m�ltiplos de 5 desde el 0 hasta el 100");
        
        
        Consola.detenerConsola();//invocamos al m�todo propio indicando el paquete antes de la clase
        //y como es est�tico ponemos la clase en la que est�,un punto y el nombre del m�todo
        
        for (int i = 1; i <= 100; i++)
        {
            if (i % 5 == 0)
            {
                System.out.printf(" %d es m�ltiplo de 5 \n", i);
            }
        }
        
        
    }
}

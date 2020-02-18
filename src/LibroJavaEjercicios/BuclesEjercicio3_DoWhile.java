package LibroJavaEjercicios;

//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.

import MetodosPropios.Consola;

public class BuclesEjercicio3_DoWhile
{
    public static void main(String[] args)
    {
        System.out.println("Este programa muestra lo números que son múltiplos de 5 desde el 0 hasta el 100");
        
        Consola.detenerConsola();
        
        int n = 0;
        
        do
        {
            n++;
            
            if (n % 5 == 0)
            {
                System.out.println(n + " es múltiplo de 5");
                
            }
        } while (n <= 100);
    }
}

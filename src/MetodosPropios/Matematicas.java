package MetodosPropios;



public class Matematicas
{
    //Comprueba si un número entero positivo es primo o no.
    //* Un número es primo cuando únicamente es divisible entre
    //* él mismo y la unidad
    public static boolean esPrimo(int x)
    {
        for (int i = 2; i < x; i++)//empieza a dividir el número por 2, y va subiendo dividiendo  hasta llegar al número -1
        {
            if ((x % i) == 0)//si el resto de alguna división es 0
            {
                return false;//es que no es primo
            }
        }
        return true;//si completa el bucle no puede dividir con resto 0 es que es primo
    }
    
    
    //Devuelve el siguiente número primo  mayor al número que
    //se pasa como parámetro.
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

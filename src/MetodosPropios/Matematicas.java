package MetodosPropios;



public class Matematicas
{
    //Comprueba si un n�mero entero positivo es primo o no.
    //* Un n�mero es primo cuando �nicamente es divisible entre
    //* �l mismo y la unidad
    public static boolean esPrimo(int x)
    {
        for (int i = 2; i < x; i++)//empieza a dividir el n�mero por 2, y va subiendo dividiendo  hasta llegar al n�mero -1
        {
            if ((x % i) == 0)//si el resto de alguna divisi�n es 0
            {
                return false;//es que no es primo
            }
        }
        return true;//si completa el bucle no puede dividir con resto 0 es que es primo
    }
    
    
    //Devuelve el siguiente n�mero primo  mayor al n�mero que
    //se pasa como par�metro.
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

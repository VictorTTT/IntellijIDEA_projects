package LibroJavaEjercicios;

//Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
//do-while.

public class BuclesEjercicio6_DoWhile
{
    public static void main(String[] args)
    {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20\n");
        
        int n =320;
        
        do
        {
            System.out.println(n);
            
            n-=20;
            
        }while (n>=160);
    }
}

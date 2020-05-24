package LibroJava.Programacion_estructurada;

//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
//un bucle while.

public class BuclesEjercicio5_While
{
    public static void main(String[] args)
    {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás");
        
        int n=320;
        
        while (n>=160){
    
            System.out.println(n);
            
            n-=20;
        }
    }
}

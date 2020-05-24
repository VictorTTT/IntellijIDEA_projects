package LibroJava.Programacion_estructurada;

//Vamos a producir de forma aleatoria una palabra - piedra, papel o
//tijera - generando primero un número entero entre 0 y 2 y posteriormente haciendo
//corresponder una palabra a cada número.

public class NumeroAleatorio_PiedraPapelTijera
{
    public static void main(String[] args)
    {
        System.out.println("genera al azar piedra, papel o tijera:");
        
        int mano = (int) (Math.random() * 3);
        //genera un número al azar entre
        //0 y 2 ambos incluidos
        
        switch (mano)
        {
            case 0:
                System.out.println("piedra");
                break;
            
            case 1:
                System.out.println("papel");
                break;
            
            case 2:
                System.out.println("tijera");
                break;
            
            
        }
        
        
    }
}

package LibroJavaEjercicios;

//Escribe un programa que calcule la media de un conjunto de n�meros positivos
//introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
//introducir�n. El usuario indicar� que ha terminado de introducir los datos
//cuando meta un n�mero negativo.

import javax.swing.*;

public class BuclesEjercicio10_MediaNumeros
{
    public static void main(String[] args)
    {
        System.out.println("Introduce todos los n�meros que quieras, cuando los tengas, " +
                
                " introduce uno negativo para terminar con la entrada y el programa continuar� mostrando la media de todos ellos");
        
        
        int n;
        
        int suma=0;
        
        int contador=0;
        
        do
        {
            
            n=Integer.parseInt(JOptionPane.showInputDialog("introduce n�mero"));
            
            if (n<0)break;
    
            contador++;
    
    
            suma+=n;
            
            
            
            
        }while(n>0);
        
       
    
        System.out.println("La media de los n�meros que has introducido es: "+suma/contador);
    
        
    }
}

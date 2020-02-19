package LibroJavaEjercicios;

//Escribe un programa que calcule la media de un conjunto de números positivos
//introducidos por teclado. A priori, el programa no sabe cuántos números se
//introducirán. El usuario indicará que ha terminado de introducir los datos
//cuando meta un número negativo.

import javax.swing.*;

public class BuclesEjercicio10_MediaNumeros
{
    public static void main(String[] args)
    {
        System.out.println("Introduce todos los números que quieras, cuando los tengas, " +
                
                " introduce uno negativo para terminar con la entrada y el programa continuará mostrando la media de todos ellos");
        
        
        int n;
        
        int suma=0;
        
        int contador=0;
        
        do
        {
            
            n=Integer.parseInt(JOptionPane.showInputDialog("introduce número"));
            
            if (n<0)break;
    
            contador++;
    
    
            suma+=n;
            
            
            
            
        }while(n>0);
        
       
    
        System.out.println("La media de los números que has introducido es: "+suma/contador);
    
        
    }
}

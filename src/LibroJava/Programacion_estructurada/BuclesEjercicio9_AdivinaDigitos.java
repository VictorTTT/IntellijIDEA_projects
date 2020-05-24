package LibroJava.Programacion_estructurada;

//Realiza un programa que nos diga cuántos dígitos tiene un número introducido
//por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
//la salvedad de que el anterior estaba limitado a números de 5 dígitos como
//máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
//esta manera, la única limitación en el número de dígitos la establece el tipo de
//dato que se utilice (int o long).

import javax.swing.*;

public class BuclesEjercicio9_AdivinaDigitos
{
    public static void main(String[] args)
    {
        System.out.println("Introduce un número y el programa averiguará de cuantos dígitos está compuesto");
        
        long num = Long.parseLong(JOptionPane.showInputDialog("Introduce uno largo, no te cortes"));
        
        int digitos = 1;
        //dentro del bucle, dividimos el número introducido por 10 y sumamos 1 a la variable "dígitos"
        //como regla matemática, cada vez que dividimos un determinado número entre 10, restamos un dígito a el número
        while (num > 10)
        {
            
            num = num / 10;
            
            digitos++;
        }
        
        System.out.println("El número que has introducido tiene " + digitos + " dígitos");
    }
}

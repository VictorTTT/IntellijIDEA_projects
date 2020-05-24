package LibroJava.Programacion_estructurada;

//Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido
//por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
//la salvedad de que el anterior estaba limitado a n�meros de 5 d�gitos como
//m�ximo. En esta ocasi�n, hay que realizar el ejercicio utilizando bucles; de
//esta manera, la �nica limitaci�n en el n�mero de d�gitos la establece el tipo de
//dato que se utilice (int o long).

import javax.swing.*;

public class BuclesEjercicio9_AdivinaDigitos
{
    public static void main(String[] args)
    {
        System.out.println("Introduce un n�mero y el programa averiguar� de cuantos d�gitos est� compuesto");
        
        long num = Long.parseLong(JOptionPane.showInputDialog("Introduce uno largo, no te cortes"));
        
        int digitos = 1;
        //dentro del bucle, dividimos el n�mero introducido por 10 y sumamos 1 a la variable "d�gitos"
        //como regla matem�tica, cada vez que dividimos un determinado n�mero entre 10, restamos un d�gito a el n�mero
        while (num > 10)
        {
            
            num = num / 10;
            
            digitos++;
        }
        
        System.out.println("El n�mero que has introducido tiene " + digitos + " d�gitos");
    }
}

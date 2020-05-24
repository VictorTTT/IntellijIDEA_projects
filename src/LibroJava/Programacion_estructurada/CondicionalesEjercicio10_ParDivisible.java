package LibroJava.Programacion_estructurada;

//Realiza un programa que diga si un número introducido por teclado es par y/o
//divisible entre 5.


import javax.swing.*;

public class CondicionalesEjercicio10_ParDivisible
{
    public static void main(String[] args)
    {
        System.out.println("Introduce un número y sabrás si es par y divisible entre 5 \n");
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));
        
        if (num % 2 == 0)
        {
            System.out.print("Es par ");
        } else
        {
            System.out.print("Es impar ");
        }
        
        if (num % 5 == 0)
        {
            System.out.println("y se puede dividir entre 5");
        } else
        {
            System.out.println("y no se puede dividir entre 5");
        }
    }
}

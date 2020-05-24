package LibroJava.Programacion_estructurada;

//Muestra la tabla de multiplicar de un número introducido por teclado

import java.util.Scanner;

public class BuclesEjercicio8_TablaMultilpicar
{
    public static void main(String[] args)
    {
        System.out.println("Introduce un número y te mosraremos la tabla de multiplicar del mismo");
    
        Scanner entrada=new Scanner(System.in);
        
        int num=entrada.nextInt();
    
        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    
    }
}

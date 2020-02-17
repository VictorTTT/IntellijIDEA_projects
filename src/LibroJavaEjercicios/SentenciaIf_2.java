package LibroJavaEjercicios;

//El usuario introducirá un número por
//teclado y el programa dirá si se trata de un número positivo o negativo.


import java.util.Scanner;

public class SentenciaIf_2
{
    public static void main(String[] args)
    {
        System.out.println("Por favor, introduce un número entero ");
        
        Scanner entrada = new Scanner(System.in);
        
        int numero = entrada.nextInt();
        
        if (numero < 0)
        {
            System.out.println("El número introducido es negativo");
        }
        else
        {
            System.out.println("El número introducido es positivo");
        }
        
        
    }
}

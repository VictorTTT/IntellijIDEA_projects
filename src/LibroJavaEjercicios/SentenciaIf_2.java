package LibroJavaEjercicios;

//El usuario introducir� un n�mero por
//teclado y el programa dir� si se trata de un n�mero positivo o negativo.


import java.util.Scanner;

public class SentenciaIf_2
{
    public static void main(String[] args)
    {
        System.out.println("Por favor, introduce un n�mero entero ");
        
        Scanner entrada = new Scanner(System.in);
        
        int numero = entrada.nextInt();
        
        if (numero < 0)
        {
            System.out.println("El n�mero introducido es negativo");
        }
        else
        {
            System.out.println("El n�mero introducido es positivo");
        }
        
        
    }
}

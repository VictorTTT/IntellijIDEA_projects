package LibroJava.Programacion_estructurada;

//Escribe un programa que ordene tres n�meros enteros introducidos por teclado.

import java.util.Scanner;

public class CondicionalesEjercicio9_OrdenarNumeros
{
    public static void main(String[] args)
    {
        int aux;
        
        System.out.println("Este programa ordenar� tres n�meros que introduzcas de menor a mayor");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce n�mero");
        
        int n1 = entrada.nextInt();
        
        System.out.println("Introduce n�mero");
        
        int n2 = entrada.nextInt();
        
        System.out.println("Introduce n�mero");
        
        int n3 = entrada.nextInt();
        
        //ordenamos primer y segundo n�mero
        
        if (n1 > n2)
        {
            
            aux = n1;
            
            n1 = n2;
            
            n2 = aux;
        }
        
        //ordenamos segundo y tercer n�mero
        
        if (n2 > n3)
        {
            
            aux = n2;
            
            n2 = n3;
            
            n3 = aux;
        }
        
        //volvemos a ordenar primer y segundo n�mero
        
        if (n1 > n2)
        {
            aux=n1;
            
            n1=n2;
            
            n2=aux;
           
            
        }
    
        System.out.println(" Los n�meros que has introducido ordenados de menor a mayor son: \n 1� "+n1+"\n 2� "+n2 +"\n 3� "+n3);
    }
}

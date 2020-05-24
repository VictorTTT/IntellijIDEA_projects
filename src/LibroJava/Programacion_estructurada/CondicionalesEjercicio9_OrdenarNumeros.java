package LibroJava.Programacion_estructurada;

//Escribe un programa que ordene tres números enteros introducidos por teclado.

import java.util.Scanner;

public class CondicionalesEjercicio9_OrdenarNumeros
{
    public static void main(String[] args)
    {
        int aux;
        
        System.out.println("Este programa ordenará tres números que introduzcas de menor a mayor");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce número");
        
        int n1 = entrada.nextInt();
        
        System.out.println("Introduce número");
        
        int n2 = entrada.nextInt();
        
        System.out.println("Introduce número");
        
        int n3 = entrada.nextInt();
        
        //ordenamos primer y segundo número
        
        if (n1 > n2)
        {
            
            aux = n1;
            
            n1 = n2;
            
            n2 = aux;
        }
        
        //ordenamos segundo y tercer número
        
        if (n2 > n3)
        {
            
            aux = n2;
            
            n2 = n3;
            
            n3 = aux;
        }
        
        //volvemos a ordenar primer y segundo número
        
        if (n1 > n2)
        {
            aux=n1;
            
            n1=n2;
            
            n2=aux;
           
            
        }
    
        System.out.println(" Los números que has introducido ordenados de menor a mayor son: \n 1º "+n1+"\n 2º "+n2 +"\n 3º "+n3);
    }
}

package Ilerna_POO.EDD;

import java.util.Scanner;

public class VictorTena_ConjeturaUllman
{
    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Este programa calcula e imprime los elementos correspondientes a la Conjetura de Ullman\n");

        System.out.println("Por favor, introduce un número positivo\n");

        int num=entrada.nextInt();

        System.out.println("La secuencia obtenida es:\n");

        System.out.print(num);

        while (num>1)
        {
            if (esPar(num))
            {
                num/=2;

            }
            else
            {
                num=(num*3)+1;

            }
            System.out.print(", "+num);
        }

    }

    public static boolean esPar(int n)
    {
        return n % 2 == 0;
    }




}

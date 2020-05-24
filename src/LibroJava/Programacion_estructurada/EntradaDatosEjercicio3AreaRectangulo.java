package LibroJava.Programacion_estructurada;

//Escribe un programa que calcule el área de un rectángulo

import java.util.Scanner;

public class EntradaDatosEjercicio3AreaRectangulo
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a calcular el área  de un rectángulo \n");

        System.out.println("Recordemos que el área de un rectángulo e base * altura\n");

        Scanner entrada= new Scanner(System.in);

        System.out.println("introduce la base \n");

        double  base=entrada.nextDouble();

        System.out.println("introduce la altura \n");

        double altura=entrada.nextDouble();

        System.out.println("El area del rectángulo es: "+base*altura);


    }
}

package LibroJava.Programacion_estructurada;

//Escribe un programa que calcule el �rea de un rect�ngulo

import java.util.Scanner;

public class EntradaDatosEjercicio3AreaRectangulo
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a calcular el �rea  de un rect�ngulo \n");

        System.out.println("Recordemos que el �rea de un rect�ngulo e base * altura\n");

        Scanner entrada= new Scanner(System.in);

        System.out.println("introduce la base \n");

        double  base=entrada.nextDouble();

        System.out.println("introduce la altura \n");

        double altura=entrada.nextDouble();

        System.out.println("El area del rect�ngulo es: "+base*altura);


    }
}

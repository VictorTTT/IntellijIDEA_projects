package LibroJava.Programacion_estructurada;

//Realiza un programa que pida dos n�meros y que luego muestre el resultado
//de su multiplicaci�n.

import java.util.Scanner;

public class EntradaDatosEjercicio1
{
    public static void main(String[] args)
    {
        System.out.println("Introduce 2 n�meros, por favor ");

        Scanner entrada=new Scanner(System.in);

        double n1=entrada.nextDouble();

        double n2=entrada.nextDouble();

        double multiplicaci�n=n1*n2;

        System.out.println("El resultado de la multiplicaci�n entre ambos es= "+multiplicaci�n);

    }
}

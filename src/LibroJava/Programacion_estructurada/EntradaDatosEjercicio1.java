package LibroJava.Programacion_estructurada;

//Realiza un programa que pida dos números y que luego muestre el resultado
//de su multiplicación.

import java.util.Scanner;

public class EntradaDatosEjercicio1
{
    public static void main(String[] args)
    {
        System.out.println("Introduce 2 números, por favor ");

        Scanner entrada=new Scanner(System.in);

        double n1=entrada.nextDouble();

        double n2=entrada.nextDouble();

        double multiplicación=n1*n2;

        System.out.println("El resultado de la multiplicación entre ambos es= "+multiplicación);

    }
}

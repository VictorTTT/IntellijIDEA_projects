package Udemy_POO.EjerciciosUdemy_POO;

import java.util.Scanner;

public class Uso_Sucursal_y_Paquetes
{
    public static void main(String[] args)
    {
        System.out.println("Bienvenido a la empresa de mensajer�a de los TeMa");

        Scanner entrada=new Scanner(System.in);

        System.out.println("Por favor, introduzca el n� de sucursal");

        String numSucursal=entrada.nextLine();

        System.out.println("Ahora introduzca la direcci�n de env�o");

        String direccionEnvio=entrada.nextLine();

        System.out.println("Tambi�n necesitamos la ciudad y el c�digo postal");

        String ciudad=entrada.nextLine();

        Sucursal miSucursal1=new Sucursal(numSucursal,direccionEnvio,ciudad);



        //Paquete miPaquete1=new Paquete()







    }

}

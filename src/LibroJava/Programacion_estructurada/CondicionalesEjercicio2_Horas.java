package LibroJava.Programacion_estructurada;

//Realiza un programa que pida una hora por teclado y que muestre luego buenos
//d�as, buenas tardes o buenas noches seg�n la hora. Se utilizar�n los tramos de
//6 a 12, de 13 a 20 y de 21 a 5. respectivamente. S�lo se tienen en cuenta las
//horas, los minutos no se deben introducir por teclado.

import java.util.Scanner;

public class CondicionalesEjercicio2_Horas
{
    public static void main(String[] args)
    {
        System.out.println("Introduce la hora que es ahora mismo, solo la hora en formato de 24h");

        Scanner entrada = new Scanner(System.in);

        int hora = entrada.nextInt();

        if (hora >= 6 && hora <= 12)
        {
            System.out.println("Buenos di�s");
        }
        else if (hora >= 13 && hora <=20)
        {
            System.out.println("Buenas tardes");
        }
        else if (hora >= 21 && hora <=24||hora>=1&&hora<=5)
        {
            System.out.println("Buenas noches");
        }
        else
        {
            System.out.println("Opci�n incorrecta");
        }


    }
}

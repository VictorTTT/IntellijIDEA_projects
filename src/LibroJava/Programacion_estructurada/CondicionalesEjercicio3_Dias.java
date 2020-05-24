package LibroJava.Programacion_estructurada;

//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
//nombre del día de la semana.

import java.util.Scanner;

public class CondicionalesEjercicio3_Dias
{
    public static void main(String[] args)
    {

        System.out.println("Introduce un número y mostraremos a ué día de la semana corresponde ");

        Scanner entrada = new Scanner(System.in);

        int dia = entrada.nextInt();

        switch (dia)
        {
            case 1:
                System.out.println("Lunes");


                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("opción elegida incorrecta");


        }


    }
}

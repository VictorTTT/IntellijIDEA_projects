package LibroJava.Programacion_estructurada;

//Escribe un programa en que dado un n�mero del 1 a 7 escriba el correspondiente
//nombre del d�a de la semana.

import java.util.Scanner;

public class CondicionalesEjercicio3_Dias
{
    public static void main(String[] args)
    {

        System.out.println("Introduce un n�mero y mostraremos a u� d�a de la semana corresponde ");

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
                System.out.println("Mi�rcoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("S�bado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("opci�n elegida incorrecta");


        }


    }
}

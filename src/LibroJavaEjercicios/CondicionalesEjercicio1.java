package LibroJavaEjercicios;

//Escribe un programa que pida por teclado un d�a de la semana y que diga qu�
//asignatura toca a primera hora ese d�a.

import java.util.Scanner;

public class CondicionalesEjercicio1
{
    public static void main(String[] args)
    {
        System.out.println("\n\n\neste programa sirve para saber qu� asignaturas le tocan a Enzo el dia de la semana que elijas");

        EntradaDatosEjercicio8_NotaMedia.detenerConsola();

        System.out.println("Introduce un d�a de la semana");

        Scanner entrada=new Scanner (System.in);

        String dia=entrada.nextLine();

        switch (dia)
        {
            case "lunes":

                System.out.println("los lunes toca:\nLengua, Educaci�n F�sica, Patio, Mate, Angl�s Oral, Descans, y Taller de LLengua");

                break;

            case"martes":

                System.out.println("los martes toca:\nLengua, LLengua, Patio, Angl�s, Naturals" +
                        ", Descans, Taller de Mate");

                break;

            case "miercoles":

                System.out.println("los miercoles toca:\nMate, M�sica, Patio, Valors, Taller de Llengua, Descans, Naturals");

                break;

            case "jueves":

                System.out.println("los jueves toca:\nMate, Llengua, Patio, Angl�s, Socials, Descans, Socials");

                break;

            case "viernes":

                System.out.println("los viernes toca:\nLlengua, Educaci�n F�sica, Inform�tica, Arts and crafts, Descans, Tutoria");

                break;

            case "sabado":

                System.out.println("LOS S�BADOS NO SE VA AL COLE, QUE YA EST� BIEN DE LUNES A VIERNES!!!!!!!!");

                break;

            case "domingo":

                System.out.println("LOS DOMINGOS NO SE VA AL COLE, QUE YA EST� BIEN DE LUNES A VIERNES!!!!!!!!");

                break;

            default:
                System.out.println("ESA RESPUESTA NO ME LA ESPERABA ");
        }







    }
}

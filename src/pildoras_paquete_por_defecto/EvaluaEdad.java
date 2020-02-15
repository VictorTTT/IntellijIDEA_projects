package pildoras_paquete_por_defecto;

import java.util.Scanner;

public class EvaluaEdad
{
    public static void main(String[] args)
    {
        Scanner ReadLine=	new Scanner(System.in);
        //clase//objeto //constructor

        System.out.println("Introduce tu edad, por favor");

        int edad=ReadLine.nextInt();
        //variable entera es igual al objeto de la clase scanner y
        //el siguiente entero que se introduzca por consola.

        if(edad<18)	//si...
        {
            System.out.println("Eres adolescente");
        }
        else if(edad<40)//y si no...
        {
            System.out.println("Eres joven");
        }
        else if(edad<65) //y si no...
        {
            System.out.println("eres maduro");
        }
        else//si nada de lo anterior es verdad haz esto...
        {
            System.out.println("cuídate");
        }

    }

}

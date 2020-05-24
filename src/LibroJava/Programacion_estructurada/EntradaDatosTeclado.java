package LibroJava.Programacion_estructurada;

//Para recoger datos por teclado usamos System.console().readLine(). Cuando llegamos a
//esta sentencia, el programa se detiene y espera que el usuario introduzca informaci�n
//mediante el teclado. La introducci�n de datos termina con la pulsaci�n de la tecla
//INTRO. Una vez que el usuario presiona INTRO, ttodo lo que se ha tecleado se almacena
//en una variable, en el siguiente ejemplo esa variable es nombre.

import java.util.Scanner;

public class EntradaDatosTeclado
{
    public static void main(String[] args)
    {
        String nombre;//declaramos variable

        System.out.println("Por favor,dime c�mo te llamas");

        //nombre=System.console().readLine();//esta sentencia da error en Intellij�por qu�?

        Scanner entrada=new Scanner(System.in);//creamos objeto de la clase scanner

        nombre=entrada.nextLine();//alamcenamos el objeto Scanner con el m�todo nextLine() en la variable String inicial

        System.out.println(" Hola "+nombre+" encantado de conocerte!!!!! ");//mostramos por pantalla
    }
}
